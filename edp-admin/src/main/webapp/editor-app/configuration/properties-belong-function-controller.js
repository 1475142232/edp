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


var KisBelongFunctionPropertiesCtrl = [ '$scope', '$modal', '$timeout', '$translate', function($scope, $modal, $timeout, $translate) {
    // Config for the modal window
    var opts = {
        template:  'editor-app/configuration/properties/belong-function-popup.html?version=' + Date.now(),
        scope: $scope
    };

    // Open the dialog
    $modal(opts);
}];

var KisBelongFunctionPropertiesPopupCtrl = ['$scope', '$q', '$translate', '$timeout', function($scope, $q, $translate, $timeout) {
    // Put json representing form properties on scope
	$scope.selectedFields = [];
	$scope.NAME_TITLE = "功能名称";
	$scope.DESC_TITLE = "功能描述";
	$scope.noList = "没有相关的数据，请先添加！";
	$scope.mySelections = [];
    $scope.len = $scope.selectedFields.length;
    $scope.labels = {};
    $scope.test ="11111";
    

    // Click handler for save button
    $scope.save = function() {
    	var treeCheckId = document.getElementById("treeCheckId").value;
    	var treeCheckName = document.getElementById("treeCheckName").value;
    	var treeCheckType = document.getElementById("treeCheckType").value;
        if (treeCheckId !== "" && treeCheckName !== "") {
        	$scope.property.value = {};
            $scope.property.value.belongFunction = treeCheckName;
            $scope.property.value.id = treeCheckId;
            $scope.property.value.type = treeCheckType;
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
    
    $scope.request = function(method, url, data, success, error, async, headers) {
		
		// get a request object
		var httpRequest = Try.these(

			/* do the Mozilla/Safari/Opera stuff */
			function() { return new XMLHttpRequest(); },
			
			/* do the IE stuff */
			function() { return new ActiveXObject("Msxml2.XMLHTTP"); },
			function() { return new ActiveXObject("Microsoft.XMLHTTP") }
		);

		// if there is no request object ...
        if (!httpRequest) {
			if(!this.__corrupt)
				throw 'This browser does not provide any AJAX functionality. You will not be able to use the software provided with the page you are viewing. Please consider installing appropriate extensions.';
			this.__corrupt = true;
			return false;
        }
		
		if(success instanceof Function)
			httpRequest.onload = success;
		if(error instanceof Function) {
			httpRequest.onerror = error;
		}
		
		var h = $H(headers)
		h.keys().each(function(key) {
			
			httpRequest.setRequestHeader(key, h[key]);
		}); 
		
		try {
	        httpRequest.open(method, url, !async?false:true);
	        httpRequest.send(data);
		} catch(e) {
			return false;
		}
		return true;
    }
}];