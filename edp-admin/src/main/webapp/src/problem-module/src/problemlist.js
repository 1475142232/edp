KISSY.add("problem-module/src/problemlist",function(S,IO, Cookie, ProblemDetail){
	function ProblemList(){
		var _this = this;
		var cookie = new Cookie();
		var searchParam = {};
		var problemType = "0";
		var teamId = cookie.getCookie("teamId");
		
		this.init = function(){
			//获取项目列表
			_this.getMyProjectList();
//			//获取用户列表
//			_this.getUserList();
			//筛选条件鼠标移入移出事件
			$('.g_con').hover(function(){
				$(this).addClass("hover");
				$(this).show();
			},function(){
				$(this).removeClass("hover");
				$(this).hide(); 
			});
			$('.g_dot').children('span').hover(function(){
				$(this).parent().children('.g_con').show();
			},function(){
				setTimeout(function(){ 
				var divThis = $('.g_dot').children('.g_con'); 
				if (!divThis.hasClass('hover')) 
				{ 
					divThis.hide(); 
				} 
				}, 10);
			});
			
			$("#problem_user li").on("click", function(){
				problemType = this.id;
				$(this).parent().parent().children('span').html($(this).html());
				//获取问题列表
				_this.getProblemList();
			    //节点选中
				_this.navQie("problem_user",this);
			});
			
			$("#problem_time li").on("click", function(){
				if(this.id === ""){
					searchParam.problemStarteUser = "";
					searchParam.problemEndUser = "";
				}else{
					var ids = (this.id).split("_");
					searchParam.problemStarteUser = ids[1];
					searchParam.problemEndUser = ids[1];
				}
				$(this).parent().parent().children('span').html($(this).html());
				//获取问题列表
				_this.getProblemList();
				//节点选中
				_this.navQie("problem_time",this);
			});
			
			$("#problem_type li").on("click", function(){
				if(this.id === ""){
					searchParam.problemType = "";
				}else{
					var ids = (this.id).split("_");
					searchParam.problemType = ids[1];
				}
				$(this).parent().parent().children('span').html($(this).html());
				//获取问题列表
				_this.getProblemList();
				//节点选中
				_this.navQie("problem_type",this);
			});
			
			$("#problem_lv li").on("click", function(){
				if(this.id === ""){
					searchParam.problemLv = "";
				}else{
					var ids = (this.id).split("_");
					searchParam.problemLv = ids[1];
				}
				$(this).parent().parent().children('span').html($(this).html());
				//获取问题列表
				_this.getProblemList();
				//节点选中
				_this.navQie("problem_lv",this);
			});
			
			$("#problem_sreach").on("click", function(){
				var sreach_name = $("#sreach_name").val();
				if(sreach_name !== undefined && sreach_name !== ""){
					searchParam.problemName = sreach_name;
					//获取问题列表
				}
				_this.getProblemList();
			});
		};
		
		this.getProblemList = function(){
			var searchHtml = "?teamId="+ teamId + "&type=" + problemType;
			if(searchParam.productId !== undefined && searchParam.productId !== ""){
				searchHtml = "?type=" + problemType;
			}
			var sreach_name = $("#sreach_name").val();
			if(sreach_name === undefined || sreach_name === ""){
				searchParam.problemName = "";
			}
			$(".g_quesBar").html("");
			//获取项目列表
			$.ajax({
	             type: "POST",
	             url: "ProblemController/problemList.action" + searchHtml,
	             data: searchParam,
	             async: true,
	             dataType: "json",
	             success: function(data){
	            	 if(data !== null && data.length > 0){
	            		 for(var i = 0; i < data.length; i++) {
	            			 var problemEndName = (data[i].problemEndName !== undefined && data[i].problemEndName !== null) ? '<span class="g_per">'+ data[i].problemEndName +'</span>' : "无";
	            			 var problemType = data[i].problemType;
	            			 var problemLv = data[i].problemLv;
	            			 var type = "";
	            			 if(problemType === "01"){
	            				 type = "BUG";
	            			 }else{
	            				 type = "求助";
	            			 }
	            			 var problem = '<li id="'+ data[i].id +'">'
	            			 +'<div style="float:left;">'
	            			 +'<span class="g_time">'+ data[i].problemStarteTime +'</span>'
	            			 +'<span class="g_help lv_'+ problemLv +'">'+ type +'</span>'
	            			 +'<span class="g_helpcon">'+ data[i].problemName +'</span>'
	            			 +'</div>'
	            			 +'<div style="float:right">'
	            			 +'<span class="g_per">'+ data[i].problemStarteName +'</span>'
	            			 +'<span>解决人：</span>'
	            			 + problemEndName
	            			 +'</div>'
	            			 +'</li>';
	            			 $(".g_quesBar").append(problem);
	            		 }
	            		 
	            		 $(".g_quesBar li").on("click", function(){
	            			 var id = this.id;
	            			 IO.get("views/problem/problem_detail.html",null,function(){
            	  				 $("#mainpage").html(arguments[0], true);
            	  				 var problemDetail = new ProblemDetail();
            	  				 problemDetail.init(id);
            	  	     	 });
	            		 });
	            		
	            	 }else{
	            		 
	            	 }
                  }
        	});
		};
		
		this.getMyProjectList = function(){
			//获取项目列表
			$.ajax({
	             type: "POST",
	             url: "productController/productList.action?teamId="+teamId,
	             async: true,
	             dataType: "json",
	             success: function(data){
	            	 $("#my_project").html('');
	            	 var product = "";
	            	 if(data !== null && data.length > 0){
	            		 for(var i = 0; i < data.length; i++) {
	            			 if(i === 0){
	            				 searchParam.productId = data[i].id;
	            				 $("#my_project").parent().children('span').html(data[i].productName);
	            				 product += '<li id="'+ data[i].id +'" class="active">'+ data[i].productName +'</li>';
	            			 }else{
	            				 product += '<li id="'+ data[i].id +'">'+ data[i].productName +'</li>';
	            			 }
	            		 }
	            		 $("#my_project").html(product);
	            		 
	            		 $("#my_project li").on("click", function(){
	            			 searchParam.productId = this.id;
	            			 $(this).parent().parent().children('span').html($(this).html());
	            			//获取问题列表
		         			_this.getProblemList();
		         			//节点选中
		    				_this.navQie("my_project",this);
	            		 });
	            		 
	            		 //获取问题列表
	         			 _this.getProblemList();
	            	 }else{
	            		 
	            	 }
                  }
        	});
		};
		
		this.getUserList = function(){
			$(".g_con").html("");
			//获取项目列表
			$.ajax({
	             type: "POST",
	             url: "DataController/findAllData.action",
	             async: true,
	             dataType: "json",
	             success: function(data){
	            	 if(data !== null && data.length > 0){
//	            		 for(var i = 0; i < data.length; i++) {
//	            			 var problem = '<li id="'+ data[i].id +'"></li>';
//	            			 $(".g_con").append(problem);
//	            		 }
//	            		 
//	            		 $(".g_con li").on("click", function(){
//	            			 alert(this.id);
//	            		 });
	            	 }else{
	            		 
	            	 }
                  }
        	});
		};
		
		this.navQie = function(pid, id){
			var li = $("#"+ pid +" li");
			if(li !== null && li !== undefined){
				li.removeAttr("class");
			}
			$(id).attr("class","active");
		}
	};
	
	return ProblemList;
},{
	requires : ['io','common-module/src/cookie','problem-module/src/problemdetail']
});