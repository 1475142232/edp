/*
 * Activiti Modeler component part of the Activiti project
 * Copyright 2005-2014 Alfresco Software, Ltd. All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */


var KisBelongTablePropertiesCtrl = [ '$scope', '$modal', '$timeout', '$translate', function($scope, $modal, $timeout, $translate) {
    // Config for the modal window
    var opts = {
        template:  'editor-app/configuration/properties/belong-table-popup.html?version=' + Date.now(),
        scope: $scope
    };

    // Open the dialog
    $modal(opts);
}];

var KisBelongTablePropertiesPopupCtrl = ['$scope', '$q', '$translate', '$timeout', function($scope, $q, $translate, $timeout) {
    // Put json representing form properties on scope
	$scope.search = "查询";
	$scope.addtable = "添加";
	$scope.tablename = "表名称";
	$scope.tablefield = "表字段";
	$scope.tabledesc = "按住'Ctrl'并点击实现多选";
	$scope.selectedtable = "选择的表字段";
	$scope.tabledelete = "删除";
	$scope.selectDefault = "请选择数据库";
	$scope.tableDatas = [];
	$scope.fieldDatas = [];
	$scope.baseDatas = [];
	$scope.mySelections = [];
    $scope.labels = {};
    $scope.test ="11111";
    //回显上次选中的内容
    if($scope.property.value !== undefined && $scope.property.value !== null
            && $scope.property.value.belongtable !== undefined
            && $scope.property.value.belongtable !== null) {
    	$scope.mySelections = $scope.property.value.id;
    }
    // Handler for when the value of the type dropdown changes
    
    //获取数据库列表
    jQuery("#tableName").html("");
	jQuery.ajax({
    	url: "DataController/findDataByproductId.action",
    	data: {productId: getCookie("productId")},
		type: "POST",
		dataType: 'json',
		cache: false,
		async: false,
		success: function (data) {
			if(data !== undefined && data.length !== null){
	    		$scope.baseDatas = data;
	    	}
		},
		error: function(httpError){}
    });
    
    /**
     * 查询字段列表
     */
    $scope.getfieldDatas = function(){
    	var tableId = jQuery("#tableSelect").val();
    	jQuery.ajax({
        	url: "columnInfoController/columnlist.action?tableId="+tableId,
    		type: "POST",
    		dataType: 'json',
    		cache: false,
    		async: false,
    		success: function (data) {
    			if(data !== undefined && data !== null){
    	    		$scope.fieldDatas = data.data;
    	    	}
    		},
    		error: function(httpError){}
        });
    };
    
    /**
     * 选中的数据放入缓存数组中，并回显
     */
    $scope.setMySelections = function(){
    	var tableId = jQuery("#tableSelect").val();
    	var tableName = jQuery("#tableSelect").find("option:selected").text();
    	var fieldIds = jQuery("#fieldSelect").val();
    	var fieldNames = [];
    	var c = 0;
    	//将选中的数据放入数组中
    	jQuery("#fieldSelect").find("option:selected").each(function(){
    		fieldNames[c] = jQuery(this).text();
    		c++;
    	});
    	if(tableId !== "" && fieldIds !== null){
    		var count = 0;
    		var bool = false;
    		//判断缓存数组表里有没有此表
    		for (var i = 0; i < $scope.mySelections.length; i++) {
				if($scope.mySelections[i].id === tableId[0]){
					count = i;
					bool = true;
				}
			}
    		//封装表和字段为object对象
    		var data = {id: tableId[0], name: tableName};
    		data.children = [];
    		for (var i = 0; i < fieldIds.length; i++) {
    			var field = {id: fieldIds[i], name: fieldNames[i]}
    			data.children[i] = field;
    		}
    		//如果缓存里有，则替换
    		if(bool){
    			$scope.mySelections[count] = data;
    		}else{
    			$scope.mySelections.push(data);
    		}
    	}
    };
    
    /**
     * 查询数据库
     */
    $scope.getTableSreach = function(){
    	var id = jQuery("#tableName").val();
    	$scope.tableDatas = [];
    	$scope.fieldDatas = [];
    	if(id === ""){
    		return false;
    	}
    	/**
         * 查询表列表
         */
        jQuery.ajax({
        	url: "tableController/tablelist.action?dataId="+ id,
    		type: "POST",
    		dataType: 'json',
    		cache: false,
    		async: false,
    		success: function (data) {
    			if(data !== undefined && data !== null){
    	    		$scope.tableDatas = data;
    	    	}
    		},
    		error: function(httpError){}
        });
    };
    
    /**
     * 对选中的表字段进行删除
     * id: 要删除的对象id
     * type: 删除类型 1,数据表；2,字段
     */
    $scope.tableDelete = function(id, type) {
    	if(type === "1"){
    		for (var i = 0; i < $scope.mySelections.length; i++) {
				if($scope.mySelections[i].id === id){
					$scope.mySelections.splice(i,1);//删除数组下标对应的数据
				}
			}
    	}else{
    		for (var i = 0; i < $scope.mySelections.length; i++) {
    			var children = $scope.mySelections[i].children;
    			for (var j = 0; j < children.length; j++) {
    				if(children[j].id === id){
    					children.splice(j,1);
    				}
        		}
    			//判断所有字段是否已经删除
    			if(children.length <= 0){//已经完全删除，则删除表
    				$scope.mySelections.splice(i,1);
    			}else{
    				$scope.mySelections[i].children = children;
    			}
			}
    	}
    };

    /**
     * 数据保存
     */
    $scope.save = function() {
        if ($scope.mySelections.length > 0) {
        	var names = "";
        	for (var i = 0; i < $scope.mySelections.length; i++) {
				names += "[" + $scope.mySelections[i].name + ":";
				var children = $scope.mySelections[i].children;
				for (var j = 0; j < children.length; j++) {
					if(j === 0){
						names += children[j].name;
					}else{
						names += "," + children[j].name;
					}
				}
				names += "];";
			}
        	$scope.property.value = {};
            $scope.property.value.belongtable = names;
            $scope.property.value.id = $scope.mySelections;
//            $scope.property.value.type = treeCheckType;
        } else {
            $scope.property.value = "";
        }
        $scope.updatePropertyInModel($scope.property);
        $scope.close();
    };

    $scope.cancel = function() {
    	$scope.$hide();
    	$scope.property.mode = 'read';
    };

    // Close button handler
    $scope.close = function() {
    	$scope.$hide();
    	$scope.property.mode = 'read';
    };
    
    
    //获取cookie
    function getCookie(cname) {
		var name = cname + "=";
		var ca = document.cookie.split(';');
		for(var i=0; i<ca.length; i++) {
			var c = ca[i];
			while (c.charAt(0)==' ') c = c.substring(1);
			if (c.indexOf(name) != -1) return c.substring(name.length, c.length);
		}
		return "";
	}
    
    /**
     * 获取地址栏url的参数
     * name 参数名称
     */
    function getParamString(name){
         var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
         var r = window.parent.location.search.substr(1).match(reg);
         if(r!=null)return  unescape(r[2]); return null;
    }
}];