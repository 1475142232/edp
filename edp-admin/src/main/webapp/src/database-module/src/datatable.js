KISSY.add("database-module/src/datatable",function(S,IO,Event,Cookie){
	function DataTable(){
		var _this = this;
		var cookie = new Cookie();
		var baseId = "";
		var userRole = "";
		var userBool = false;
		
		this.init = function(base_Id,baseName){
			$("#base_name").html(baseName);
			
			baseId = base_Id;
			
			_this.getUserRole();
			//获取表列表
			_this.getTableList();
			if(userRole === "3" && userBool){
				$(".table-add-del").attr("style","display:;");
				
				//添加表操作事件
				_this.renderTableEvent();
				//添加表的表单验证
				_this.tableSaveValidator();
			}
		};
		
		/**
		 * 表新增、修改、删除事件
		 */
		this.renderTableEvent = function(){
			//表新增
			$("#add_table").on("click", function(){
				//清除表单验证信息
				$("#tableSave_Form").data('bootstrapValidator').destroy();
				$('#tableSave_Form').data('bootstrapValidator', null);
				//重置表单信息
				$("#dataId").val(baseId);
				$("#sava_id").val("");
				$("#tableName").val("");
				$("#tableDesc").val("");
				$("#myModalLabel").html("新建表");
				$("#error").html("");
			    //表单添加校验
				_this.tableSaveValidator();
				//弹出model
				$("#tableSaveModal").modal("show");
			});
			
			//表修改
			$("#edit_table").on("click", function(){
				//清除表单验证信息
				$("#tableSave_Form").data('bootstrapValidator').destroy();
				$('#tableSave_Form').data('bootstrapValidator', null);
				//重置表单信息
				$("#dataId").val(baseId);
				$("#tableName").val("");
				$("#tableDesc").val("");
				$("#myModalLabel").html("修改表");
				$("#error").html("");
			    //表单添加校验
				_this.tableSaveValidator();
				//获取点击的表ID
				var active = $(".table-list a.active");
				if(active !== undefined && active.attr("class") === "active"){
					var id = active.attr("id").split("_");
					if(id !== null && id !== undefined && id.length > 1){
						//获取表信息
						_this.getTableById(id[1]);
					}
				}else{
					$("#myModal").modal("show");
					$("#modelInfo").html("请先点击表列表中的一条数据!");
				}
			});
			
			//表删除
			$("#del_table").on("click", function(){
				//获取点击的表ID
				var active = $(".table-list a.active");
				if(active !== undefined && active.attr("class") === "active"){
					var id = active.attr("id").split("_");
					if(id !== null && id !== undefined && id.length > 1){
						//model提示是否删除
						$("#delModal").modal("show");
						$("#delInfo").html("您确定删除此表？");
						_this.delTableInfo(id[1], "", 1);
					}
				}else{
					$("#myModal").modal("show");
					$("#modelInfo").html("请先点击表列表中的一条数据!");
				}
			});
			
			//表保存事件
			$("#save_Data").on("click",function(){
	        	 $('#tableSave_Form').bootstrapValidator('validate');
	        	 if($('#tableSave_Form').data('bootstrapValidator').isValid()){
	        		 _this.saveTableInfo();
	        	 }
			});
		}
		
		/**
		 * 获取表列表并设置点击事件
		 */
		this.getTableList = function(){
			$(".table-list").html("");
			$.ajax({
	             type: "POST",
	             url: "tableController/tablelist.action",
	             async: true,
	             dataType: "json",
	             data:{dataId: baseId},
	             success: function(data){
	            	//项目跳转
	            	if(data !== null){
	            		var html = "";
	            		for (var i = 0; i < data.length; i++) {
	            			var active = "";
	            			if(i === 0){
	            				active = 'class="active"';
	            				_this.getFieldList(data[i].id);
	            			}
	            			html += '<a href="javascript:void(0);" '+active+' id="table_'+ data[i].id +'">'+data[i].tableName+'</a>';
						}
	            		$(".table-list").append(html);
	            		
	            		$(".table-list a").on("click", function(){
	        				var ids = (this.id).split("_");
	        				if(ids.length > 1){
	        					$(".table-list a").removeAttr("class");
	        					$(this).attr("class","active");
	        					_this.getFieldList(ids[1]);
	        				}
	        			});
	            	}else{
	            		$("#myModal").modal('show');
	            		$("#modelInfo").html("查询失败，请联系管理员!");
	            	}
                }
      	 	});
		}
		
		/**
		 * 获取字段列表
		 */
		this.getFieldList = function(tableId){
			if(userRole === "3" && userBool){
				$(".field-list").html('<a href="javascript:void(0);" class="add_field" id="add_field">+新增字段</a><a href="javascript:void(0);" class="del_field" id="del_field">-删除字段</a><table id="mytab" class="table table-hover"></table>');
			}else{
				$(".field-list").html('<table id="mytab" class="table table-hover"></table>');
			}
			$('#mytab').bootstrapTable({
                url: "columnInfoController/columnlist.action",//数据源
                dataField: "rows",//服务端返回数据键值 就是说记录放的键值是rows，分页时使用总记录数的键值为total
                height: 'auto',//高度调整
                search: false,//是否搜索
                pagination: true,//是否分页
                pageSize: 20,//单页记录数
                pageList: [5, 10, 20, 50],//分页步进值
                sidePagination: "client",//客户端分页
                contentType: "application/x-www-form-urlencoded",//请求数据内容格式 默认是 application/json 自己根据格式自行服务端处理
                dataType: "json",//期待返回数据类型
                method: "post",//请求方式
//                searchAlign: "left",//查询框对齐方式
//                queryParamsType: "limit",//查询参数组织方式
                queryParams: function getParams(params) {
                    //params obj
                    params.tableId = tableId;
                    return params;
                },
                searchOnEnterKey: false,//回车搜索
                showRefresh: false,//刷新按钮
                showColumns: false,//列选择按钮
                buttonsAlign: "left",//按钮对齐方式
//                toolbar: "#toolbar",//指定工具栏
//                toolbarAlign: "right",//工具栏对齐方式
                columns: [
                    {
                        title: "全选",
                        field: "select",
                        checkbox: true,
                        width: 40,//宽度
                        align: "center",//水平
                        valign: "middle"//垂直
                    },{
                        title: "字段名称",//标题
                        field: "columnName",//键名
                        align: "center",//水平
                        order: "desc"//默认排序方式
                    },{
                        title: "数据类型",
                        field: "columnType",
                        align: "center",//水平
                        sortable: false
                    },{
                        title: "数据长度",
                        field: "columnLength",
                        align: "center",//水平
                        sortable: false
                    },{
                        title: "必填",
                        field: "columnRequired",
                        align: "center",//水平
                        sortable: false
                    },{
                        title: "主键",
                        field: "columnKey",
                        align: "center",//水平
                        sortable: false
                    },{
                        title: "备注",
                        field: "columnDesc",
                        align: "center"
//                        	,//水平
//                        formatter: 'infoFormatter'//对本列数据做格式化
                    }
                ],
                onDblClickRow: function(row, $element) {
                    //$element是当前tr的jquery对象
                	$element.siblings().removeAttr("style");
                    $element.css("background-color", "#999999");
                    
                    _this.getUpdateFieldInfo(row);
                },//单击row事件
                locale: "zh-CN",//中文支持,
                detailView: false //是否显示详情折叠
            });

            if(userRole === "3" && userBool){
	            //添加新增和删除事件
	            _this.renderFieldEvent(tableId);
	            //初始表单验证信息
	            _this.fieldSaveValidator();
            }
		};
		
		/**
		 * 保存表信息
		 */
		this.saveTableInfo = function(){
			//验证成功，保存数据
	    	var saveData = $("#tableSave_Form").serialize();
	    	var url = "tableController/addTable.action";
	    	var id = $("#sava_id").val();
	    	if(id !== null && id !== ""){
	    		saveData.id = id;
	    		url = "tableController/editTable.action";
	    	}
	    	$.ajax({
      		  	type : 'post',
      		  	url : url,
      		  	data : saveData,
      		  	dataType : "json",
      		  	async : false,
      		  	success : function(data) {
      		  		if (data !== null && data === '0000') {
      		  			_this.getTableList();
      		  			$("#tableSaveModal").modal('hide');
      		  		} else {
      		  			var error = data !== "" ? data : "保存失败，请联系管理员!";
      		  			$("#error").html(error);
      		  		}
      		  	}   
      	  	});
		};
		
		/**
		 * 修改前获取表信息
		 */
		this.getTableById = function(id){
			$.ajax({
	             type: "POST",
	             url: "tableController/findTableById.action",
	             async: true,
	             dataType: "json",
	             data:{id: id},
	             success: function(data){
	            	if(data !== null){
	            		$("#sava_id").val(data.id);
	            		$("#tableName").val(data.tableName);
	            		$("#tableDesc").val(data.tableDesc);
	            		$("#tableSaveModal").modal('show');
	            	}else{
	            		$("#myModal").modal('show');
	            		$("#modelInfo").html("查询失败，请联系管理员!");
	            	}
                }
      	 	});
		};
		
		/**
		 * 表删除
		 */
		this.delTableInfo = function(id, tableId, type){
			$("#del_Data").on("click",function(){
				var url = "tableController/editTable.action";
				var datasend = {id: id, tableState: "00"};
				if(type === 2){
					url = "columnInfoController/editColumn.action";
					datasend = {id: id, columnState: "00"};
				}
				$.ajax({
					type: "POST",
					url: url,
					async: true,
					dataType: "json",
					data: datasend,
					success: function(data){
						if(data !== "" && data === "0000"){
							$("#delModal").modal('hide');
							if(type === 2){
								_this.getFieldList(tableId);
							}else{
								_this.getTableList();
							}
						}else{
							$("#delModal").modal('hide');
							$("#myModal").modal('show');
							var error = data !== "" ? data : "删除失败，请联系管理员!";
							$("#modelInfo").html(error);
						}
					}
				});
			});
		};
		
		/**
		 * 表信息添加表单验证
		 */
		this.tableSaveValidator = function(){
			$('#tableSave_Form').bootstrapValidator({
	            message: 'This value is not valid',
	            feedbackIcons: {
	                valid: 'glyphicon glyphicon-ok',
	                invalid: 'glyphicon glyphicon-remove',
	                validating: 'glyphicon glyphicon-refresh'
	            },
	            fields: {
	            	tableName: {
	                    message: 'The username is not valid',
	                    validators: {
	                        notEmpty: {
	                            message: '请输入表名称!'
	                        },
	                        stringLength: {
	                            max: 20,
	                            message: '长度最大不能超过20!'
	                        },
	                        regexp: {
	                            regexp: /^[a-zA-Z0-9\_]+$/,
	                            message: '输入的格式错误!(只能输入字母、数字、_)'
	                        }
	                    }
	                },
	                tableDesc: {
	                    validators: {
	                    	stringLength: {
	                            max: 50,
	                            message: '长度最大不能超过50!'
	                        }
	                    }
	                }
	            }
	        });
		};
		
		// 字段操作 -----------------------------------
		
		/**
		 * 添加字段新增、删除事件
		 */
		this.renderFieldEvent = function(tableId){
			$("#add_field").unbind("click");
			$("#del_field").unbind("click");
			$("#save_Field").unbind("click");
			
			//新增字段
			$("#add_field").on("click", function(){
				//清除表单验证信息
				$("#fieldSave_Form").data('bootstrapValidator').destroy();
				$('#fieldSave_Form').data('bootstrapValidator', null);
				//重置表单信息
				_this.clearForm("fieldSave_Form");
				$("#sava_field_id").val("");
				$("#tableId").val(tableId);
				$("#myFModalLabel").html("新建字段");
				$("#fError").html("");
			    //表单添加校验
				_this.fieldSaveValidator();
				//弹出model
				$("#fieldSaveModal").modal("show");
			});
			
			//删除字段
			$("#del_field").on("click", function(){
				//获取点击的字段ID
				var idArray = $('#mytab').bootstrapTable('getSelections');
				if(idArray !== undefined && idArray.length > 0){
					var id = "";
					for (var i = 0; i < idArray.length; i++) {
						if(i === 0){
							id += idArray[i].id;
						}else{
							id += "," + idArray[i].id;
						}
					}
					//model提示是否删除
					$("#delModal").modal("show");
					$("#delInfo").html("您确定删除字段？");
					_this.delTableInfo(id, tableId, 2);
				}else{
					$("#myModal").modal("show");
					$("#modelInfo").html("请先点击表列表中的一条数据!");
				}
			});
			
			//保存字段信息
			$("#save_Field").on("click", function(){
				 $('#fieldSave_Form').bootstrapValidator('validate');
	        	 if($('#fieldSave_Form').data('bootstrapValidator').isValid()){
	        		 _this.saveFieldInfo();
	        	 }
			});
		};
		
		this.fieldSaveValidator = function(){
			$('#fieldSave_Form').bootstrapValidator({
	            message: 'This value is not valid',
	            feedbackIcons: {
	                valid: 'glyphicon glyphicon-ok',
	                invalid: 'glyphicon glyphicon-remove',
	                validating: 'glyphicon glyphicon-refresh'
	            },
	            fields: {
	            	columnName: {
	                    message: 'The username is not valid',
	                    validators: {
	                        notEmpty: {
	                            message: '请输入字段名称!'
	                        },
	                        stringLength: {
	                            max: 20,
	                            message: '长度最大不能超过20!'
	                        },
	                        regexp: {
	                            regexp: /^[a-zA-Z0-9\_]+$/,
	                            message: '输入的格式错误!(只能输入字母、数字、_)'
	                        }
	                    }
	                },
	                columnType: {
	                    message: 'The username is not valid',
	                    validators: {
	                        notEmpty: {
	                            message: '请输入数据类型!'
	                        },
	                        stringLength: {
	                            max: 20,
	                            message: '长度最大不能超过20!'
	                        },
	                        regexp: {
	                            regexp: /^[a-zA-Z0]+$/,
	                            message: '输入的格式错误!(只能输入字母)'
	                        }
	                    }
	                },
	                columnLength: {
	                    message: 'The username is not valid',
	                    validators: {
	                        notEmpty: {
	                            message: '请输入数据长度!'
	                        },
	                        stringLength: {
	                            max: 20,
	                            message: '长度最大不能超过20!'
	                        },
	                        regexp: {
	                            regexp: /^[0-9]+$/,
	                            message: '输入的格式错误!(只能输入数字)'
	                        }
	                    }
	                },
	                columnDesc: {
	                    validators: {
	                    	stringLength: {
	                            max: 50,
	                            message: '长度最大不能超过50!'
	                        }
	                    }
	                }
	            }
	        });
		};
		
		/**
		 * 保存字段信息 
		 */
		this.saveFieldInfo = function(){
			//验证成功，保存数据
	    	var saveData = _this.serialize("fieldSave_Form");//form序列化
	    	var url = "columnInfoController/addColumn.action";
	    	var id = $("#sava_field_id").val();
	    	var required = $("#columnRequired").is(":checked");
	    	var key = $("#columnKey").is(":checked");
	    	if(id !== null && id !== ""){
	    		saveData.id = id;
	    		url = "columnInfoController/editColumn.action";
	    	}
	    	if(required === true || required === "checked"){
	    		saveData.columnRequired = true;
	    	}else{
	    		saveData.columnRequired = false;
	    	}
	    	if(key === true || key === "checked"){
	    		saveData.columnKey = true;
	    	}else{
	    		saveData.columnKey = false;
	    	}
	    	$.ajax({
      		  	type : 'post',
      		  	url : url,
      		  	data : saveData,
      		  	dataType : "json",
      		  	async : false,
      		  	success : function(data) {
      		  		if (data !== null && data === '0000') {
      		  			_this.getFieldList($("#tableId").val());
      		  			$("#fieldSaveModal").modal('hide');
      		  		} else {
      		  			var error = data !== "" ? data : "保存失败，请联系管理员!";
      		  			$("#fError").html(error);
      		  		}
      		  	}   
      	  	});
		};
		
		this.getUpdateFieldInfo = function(row){
			//清除表单验证信息
			$("#fieldSave_Form").data('bootstrapValidator').destroy();
			$('#fieldSave_Form').data('bootstrapValidator', null);
			//重新加载表单验证
			_this.fieldSaveValidator();
			$("#fError").html("");
			$.ajax({
	             type: "POST",
	             url: "columnInfoController/findColumnById.action",
	             async: true,
	             dataType: "json",
	             data:{id: row.id},
	             success: function(data){
	            	//项目跳转
	            	if(data !== null){
	            		$("#myFModalLabel").html("修改字段");
	            		$("#sava_field_id").val(data.id);
	            		$("#tableId").val(data.tableId);
	            		$("#columnName").val(data.columnName);
	            		$("#columnType").val(data.columnType);
	            		$("#columnLength").val(data.columnLength);
	            		if(data.columnRequired === "true" || data.columnRequired === true){
	            			$("#columnRequired").prop("checked", true);
	            		}else{
	            			$("#columnRequired").prop("checked", false);
	            		}
	            		if(data.columnKey === "true" || data.columnRequired === true){
	            			$("#columnKey").prop("checked", true);
	            		}else{
	            			$("#columnKey").prop("checked", false);
	            		}
	            		$("#columnDesc").val(data.columnDesc);
	            		//弹出修改框
	            		$("#fieldSaveModal").modal('show');
	            	}else{
	            		$("#myModal").modal('show');
	            		$("#modelInfo").html("查询失败，请联系管理员!");
	            	}
                 }
       	 	});
		};
		
		//获取登录人权限
		this.getUserRole = function(){
			$.ajax({
	             type: "POST",
	             url: "userController/getUser.action",
	             data: {teamId: cookie.getCookie("teamId")},
	             async: false,
	             dataType: "json",
	             success: function(data){
          			if(data !== null && data !== ""){
          				userRole = data.userRole;
          				_this.verfiyTaskUser(data.id);
          			}else{
          				userRole = "";
          			}
                }
      	 	});
		};
		
		/**
		 * 获取用户任务下是否有此未完成的数据库任务
		 */
		this.verfiyTaskUser = function(userId){
			$.ajax({
	             type: "POST",
	             data: {userId: userId, teamId: cookie.getCookie("teamId")},
	             url: "TaskInfoController/findTaskInfoByUserId.action",
	             async: false,
	             dataType: "json",
	             success: function(data){
         			if(data !== null && data.length > 0){
         				for (var i = 0; i < data[0].length; i++) {
							if(""+userId+"" === data[0][i].taskOwner && data[0][i].taskType === "06"){
								userBool = true;
							}
						}
         			}
               }
     	 	});
		};
		
		/**
		 * form 清空表单
		 */
		this.clearForm = function(id) {
		    var objId = document.getElementById(id);
		    if (objId == undefined) {
		        return;
		    }
		    for (var i = 0; i < objId.elements.length; i++) {
		        if (objId.elements[i].type == "text") {
		            objId.elements[i].value = "";
		        }
		        else if (objId.elements[i].type == "password") {
		            objId.elements[i].value = "";
		        }
		        else if (objId.elements[i].type == "radio") {
		            objId.elements[i].checked = false;
		        }
		        else if (objId.elements[i].type == "checkbox") {
		            objId.elements[i].checked = false;
		        }
		        else if (objId.elements[i].type == "select-one") {
		            objId.elements[i].options[0].selected = true;
		        }
		        else if (objId.elements[i].type == "select-multiple") {
		            for (var j = 0; j < objId.elements[i].options.length; j++) {
		                objId.elements[i].options[j].selected = false;
		            }
		        }
		        else if (objId.elements[i].type == "textarea") {
		            objId.elements[i].value = "";
		        }
		    }
		};
		
		/**
		   * 序列化表单元素为JSON对象
		   * @param form          Form表单id或表单jquery DOM对象
		   * @returns {}
		   */
		this.serialize = function(form){
		      var $form = (typeof(form)=="string" ? $("#"+form) : form);
		      var dataArray =  $form.serializeArray();
		     var result={};
		      $(dataArray).each(function(){
		          //如果在结果对象中存在这个值，那么就说明是多选的情形。
		          if(result[this.name]){
		              //多选的情形，值是数组，直接push
		              result[this.name].push(this.value);
		          }else{
		              //获取当前表单控件元素
		              var element = $form.find("[name='"+ this.name +"']")[0];
		              //获取当前控件类型
		              var type = ( element.type || element.nodeName ).toLowerCase();
		              //如果控件类型为多选那么值就是数组形式，否则就是单值形式。
		              result[this.name] = (/^(select-multiple|checkbox)$/i).test(type) ? [this.value] : this.value;
		          }
		      });
		      return result;
		  };
	};
	
	return DataTable;
},{
	requires : ['io','event','common-module/src/cookie']
});