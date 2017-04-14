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
'use strict';

angular.module('activitiModeler')
    .controller('ToolbarController', ['$scope', '$http', '$modal', '$q', '$rootScope', '$translate', '$location', function ($scope, $http, $modal, $q, $rootScope, $translate, $location) {
    	var _this = this;
    	
    	$scope.editorFactory.promise.then(function () {
    		var userRole = "3";
    		var items = KISBPM.TOOLBAR_CONFIG.items;
    		_this.request("post","userController/getUser.action",{teamId: _this.getCookie("teamId")},function(data){
    			if(data !== null && data !== ""){
     				userRole = data.userRole;
     			}else{
     				userRole = "";
     			}
    		},"",false);
    		for (var i = 0; i < items.length; i++) {
    			if(i === 0){
    				if(userRole === "1" || userRole === "2"){
    					items[i].enabled = false;
					}
    			}
			}
    		
    		$scope.items = items;
    	});
    	
    	/*
		 * 获取cookie
		 */
    	this.getCookie = function(c_name){
			if (document.cookie.length>0) {
			  var c_start=document.cookie.indexOf(c_name + "=")
			  if (c_start!=-1){ 
			    c_start=c_start + c_name.length+1 
			    var c_end=document.cookie.indexOf(";",c_start)
			    if (c_end==-1) c_end=document.cookie.length
			    	return unescape(document.cookie.substring(c_start,c_end))
			    } 
			}
			return ""
		};
		
		this.request = function(method, url, data, success, error, async, headers) {
			
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
        
        $scope.secondaryItems = KISBPM.TOOLBAR_CONFIG.secondaryItems;

        // Call configurable click handler (From http://stackoverflow.com/questions/359788/how-to-execute-a-javascript-function-when-i-have-its-name-as-a-string)
        var executeFunctionByName = function(functionName, context /*, args */) {
        	var args = Array.prototype.slice.call(arguments).splice(2);
            var namespaces = functionName.split(".");
            var func = namespaces.pop();
            for(var i = 0; i < namespaces.length; i++) {
                context = context[namespaces[i]];
            }
            return context[func].apply(this, args);
        };

        // Click handler for toolbar buttons
        $scope.toolbarButtonClicked = function(buttonIndex) {

            // Default behaviour
            var buttonClicked = $scope.items[buttonIndex];
            var services = { '$scope' : $scope, '$rootScope' : $rootScope, '$http' : $http, '$modal' : $modal, '$q' : $q, '$translate' : $translate};
            executeFunctionByName(buttonClicked.action, window, services);

            // Other events
            var event = {
                type : KISBPM.eventBus.EVENT_TYPE_TOOLBAR_BUTTON_CLICKED,
                toolbarItem : buttonClicked
            };
            KISBPM.eventBus.dispatch(event.type, event);
        };
        
        // Click handler for secondary toolbar buttons
        $scope.toolbarSecondaryButtonClicked = function(buttonIndex) {
            var buttonClicked = $scope.secondaryItems[buttonIndex];
            var services = { '$scope' : $scope, '$http' : $http, '$modal' : $modal, '$q' : $q, '$translate' : $translate, '$location': $location};
            executeFunctionByName(buttonClicked.action, window, services);
        };
        
        /* Key bindings */
        Mousetrap.bind(['command+z', 'ctrl+z'], function(e) {
        	var services = { '$scope' : $scope, '$rootScope' : $rootScope, '$http' : $http, '$modal' : $modal, '$q' : $q, '$translate' : $translate};
        	KISBPM.TOOLBAR.ACTIONS.undo(services);
            return false;
        });
        
        Mousetrap.bind(['command+y', 'ctrl+y'], function(e) {
        	var services = { '$scope' : $scope, '$rootScope' : $rootScope, '$http' : $http, '$modal' : $modal, '$q' : $q, '$translate' : $translate};
        	KISBPM.TOOLBAR.ACTIONS.redo(services);
            return false;
        });
        
        Mousetrap.bind(['command+c', 'ctrl+c'], function(e) {
        	var services = { '$scope' : $scope, '$rootScope' : $rootScope, '$http' : $http, '$modal' : $modal, '$q' : $q, '$translate' : $translate};
        	KISBPM.TOOLBAR.ACTIONS.copy(services);
            return false;
        });
        
        Mousetrap.bind(['command+v', 'ctrl+v'], function(e) {
        	var services = { '$scope' : $scope, '$rootScope' : $rootScope, '$http' : $http, '$modal' : $modal, '$q' : $q, '$translate' : $translate};
        	KISBPM.TOOLBAR.ACTIONS.paste(services);
            return false;
        });
        
        Mousetrap.bind(['del'], function(e) {
        	var services = { '$scope' : $scope, '$rootScope' : $rootScope, '$http' : $http, '$modal' : $modal, '$q' : $q, '$translate' : $translate};
        	KISBPM.TOOLBAR.ACTIONS.deleteItem(services);
            return false;
        });

        /* Undo logic */

        $scope.undoStack = [];
        $scope.redoStack = [];

        $scope.editorFactory.promise.then(function() {

            // Catch all command that are executed and store them on the respective stacks
            $scope.editor.registerOnEvent(ORYX.CONFIG.EVENT_EXECUTE_COMMANDS, function( evt ){

                // If the event has commands
                if( !evt.commands ){ return; }

                $scope.undoStack.push( evt.commands );
                $scope.redoStack = [];
                
                for(var i = 0; i < $scope.items.length; i++) 
        		{
                    var item = $scope.items[i];
                    if (item.action === 'KISBPM.TOOLBAR.ACTIONS.undo')
                    {
                    	item.enabled = true;
                    }
                    else if (item.action === 'KISBPM.TOOLBAR.ACTIONS.redo')
                    {
                    	item.enabled = false;
                    }
        		}

                // Update
                $scope.editor.getCanvas().update();
                $scope.editor.updateSelection();

            });

        });
        
        // Handle enable/disable toolbar buttons 
        $scope.editorFactory.promise.then(function() {
        	$scope.editor.registerOnEvent(ORYX.CONFIG.EVENT_SELECTION_CHANGED, function( evt ){
        		var elements = evt.elements;
        		
        		for(var i = 0; i < $scope.items.length; i++) 
        		{
                    var item = $scope.items[i];
                    if (item.enabledAction && item.enabledAction === 'element')
                    {
                    	var minLength = 1;
                    	if(item.minSelectionCount) {
                    		minLength = item.minSelectionCount;
                    	}
                    	if (elements.length >= minLength && !item.enabled) {
                    		$scope.safeApply(function () {
                    			item.enabled = true;
                            });
                    	}
                    	else if (elements.length == 0 && item.enabled) {
                    		$scope.safeApply(function () {
                    			item.enabled = false;
                            });
                    	}
                    }
                }
        	});
        	
        });

    }]);