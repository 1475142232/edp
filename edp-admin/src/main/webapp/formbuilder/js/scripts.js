function supportstorage() {
	if (typeof window.localStorage=='object') 
		return true;
	else
		return false;		
}

//保存原型图到数据库
function saveToDatabase(htmlName){
	var e = "";
	$("#download-layout").children().html($(".demo").html());
	var t = $("#download-layout").children();
	t.find(".preview, .configuration, .drag, .remove").remove();
	t.find(".lyrow").addClass("removeClean");
	t.find(".box-element").addClass("removeClean");
	t.find(".lyrow .lyrow .lyrow .lyrow .lyrow .removeClean").each(function() {
		cleanHtml(this)
	});
	t.find(".lyrow .lyrow .lyrow .lyrow .removeClean").each(function() {
		cleanHtml(this)
	});
	t.find(".lyrow .lyrow .lyrow .removeClean").each(function() {
		cleanHtml(this)
	});
	t.find(".lyrow .lyrow .removeClean").each(function() {
		cleanHtml(this)
	});
	t.find(".lyrow .removeClean").each(function() {
		cleanHtml(this)
	});
	t.find(".removeClean").each(function() {
		cleanHtml(this)
	});
	t.find(".removeClean").remove();
	$("#download-layout .column").removeClass("ui-sortable");
	$("#download-layout .row-fluid").removeClass("clearfix").children().removeClass("column");
	if ($("#download-layout .container").length > 0) {
		changeStructure("row-fluid", "row")
	}
	formatSrc = $.htmlClean($("#download-layout").html(), {
		format: true,
		allowedAttributes: [
			["id"],
			["class"],
			["data-toggle"],
			["data-target"],
			["data-parent"],
			["role"],
			["data-dismiss"],
			["aria-labelledby"],
			["aria-hidden"],
			["data-slide-to"],
			["data-slide"]
		]
	});
	var html = '<!DOCTYPE html><html><head>'
				+'<meta charset="utf-8">'
				+'<meta name="viewport" content="width=device-width, initial-scale=1.0">'
				+'<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">'
				+'<link href="css/bootstrap-combined.min.css" rel="stylesheet">'
				+'<link href="css/layoutit.css" rel="stylesheet">'
				+'<link href="ckeditor/skins/moono/editor.css" rel="stylesheet">'
				+'<link rel="shortcut icon" href="img/favicon.png">'

				+'<script type="text/javascript" src="js/jquery-2.0.0.min.js"></script>'
				+'<script type="text/javascript" src="js/bootstrap.min.js"></script>'
				+'<script type="text/javascript" src="js/jquery-ui.js"></script>'
				+'<script type="text/javascript" src="js/jquery.ui.touch-punch.min.js"></script>'
				+'<script type="text/javascript" src="js/jquery.htmlClean.js"></script>'
				+'<script type="text/javascript" src="ckeditor/ckeditor.js"></script>'
				+'<style>.cke{visibility:hidden;}</style>'
				+'<script type="text/javascript" src="ckeditor/config.js"></script>'
				+'<script type="text/javascript" src="js/scripts.js"></script>'
				+'<script type="text/javascript" src="ckeditor/config.js"></script>'
				+'<script type="text/javascript" src="ckeditor/lang/zh-cn.js"></script>'
				+'<script type="text/javascript" src="ckeditor/styles.js"></script>'
				+'</head><body>';
	html += formatSrc + "</body></html>";
	alert(html);
//	$.ajax({  
//		type: "POST",  
//		url: "/build/downloadLayout",  
//		data: { layout: formatSrc, name: htmlName},  
//		success: function(data) { clearDemo(); }
//	});
}

function getHtmlName(){
	$.ajax({  
	type: "POST",  
	url: "/build/downloadLayout",  
	data: { layout: formatSrc, name: htmlName},  
	success: function(data) { 
		
	}
});
}

function handleSaveLayout() {
	var e = $(".demo").html();
	if (!stopsave && e != window.demoHtml) {
		stopsave++;
		window.demoHtml = e;
		saveLayout();
		stopsave--;
	}
}

var layouthistory; 
function saveLayout(){
	var data = layouthistory;
	if (!data) {
		data={};
		data.count = 0;
		data.list = [];
	}
	if (data.list.length>data.count) {
		for (i=data.count;i<data.list.length;i++)
			data.list[i]=null;
	}
	data.list[data.count] = window.demoHtml;
	data.count++;
	if (supportstorage()) {
		localStorage.setItem("layoutdata",JSON.stringify(data));
	}
	layouthistory = data;
	console.log(data);
	/*$.ajax({  
		type: "POST",  
		url: "/build/saveLayout",  
		data: { layout: $('.demo').html() },  
		success: function(data) {
			//updateButtonsVisibility();
		}
	});*/
}

function downloadLayout(){
	
	$.ajax({  
		type: "POST",  
		url: "/build/downloadLayout",  
		data: { layout: $('#download-layout').html() },  
		success: function(data) { window.location.href = '/build/download'; }
	});
}

function downloadHtmlLayout(){
	$.ajax({  
		type: "POST",  
		url: "/build/downloadLayout",  
		data: { layout: $('#download-layout').html() },  
		success: function(data) { window.location.href = '/build/downloadHtml'; }
	});
}

function undoLayout() {
	var data = layouthistory;
	//console.log(data);
	if (data) {
		if (data.count<2) return false;
		window.demoHtml = data.list[data.count-2];
		data.count--;
		$('.demo').html(window.demoHtml);
		if (supportstorage()) {
			localStorage.setItem("layoutdata",JSON.stringify(data));
		}
		return true;
	}
	return false;
	/*$.ajax({  
		type: "POST",  
		url: "/build/getPreviousLayout",  
		data: { },  
		success: function(data) {
			undoOperation(data);
		}
	});*/
}

function redoLayout() {
	var data = layouthistory;
	if (data) {
		if (data.list[data.count]) {
			window.demoHtml = data.list[data.count];
			data.count++;
			$('.demo').html(window.demoHtml);
			if (supportstorage()) {
				localStorage.setItem("layoutdata",JSON.stringify(data));
			}
			return true;
		}
	}
	return false;
	/*
	$.ajax({  
		type: "POST",  
		url: "/build/getPreviousLayout",  
		data: { },  
		success: function(data) {
			redoOperation(data);
		}
	});*/
}

function handleJsIds() {
	handleModalIds();
	handleAccordionIds();
	handleCarouselIds();
	handleTabsIds()
}
function handleAccordionIds() {
	var e = $(".demo #myAccordion");
	var t = randomNumber();
	var n = "accordion-" + t;
	var r;
	e.attr("id", n);
	e.find(".accordion-group").each(function(e, t) {
		r = "accordion-element-" + randomNumber();
		$(t).find(".accordion-toggle").each(function(e, t) {
			$(t).attr("data-parent", "#" + n);
			$(t).attr("href", "#" + r)
		});
		$(t).find(".accordion-body").each(function(e, t) {
			$(t).attr("id", r)
		})
	})
}
function handleCarouselIds() {
	var e = $(".demo #myCarousel");
	var t = randomNumber();
	var n = "carousel-" + t;
	e.attr("id", n);
	e.find(".carousel-indicators li").each(function(e, t) {
		$(t).attr("data-target", "#" + n)
	});
	e.find(".left").attr("href", "#" + n);
	e.find(".right").attr("href", "#" + n)
}
function handleModalIds() {
	var e = $(".demo #myModalLink");
	var t = randomNumber();
	var n = "modal-container-" + t;
	var r = "modal-" + t;
	e.attr("id", r);
	e.attr("href", "#" + n);
	e.next().attr("id", n)
}
function handleTabsIds() {
	var e = $(".demo #myTabs");
	var t = randomNumber();
	var n = "tabs-" + t;
	e.attr("id", n);
	e.find(".tab-pane").each(function(e, t) {
		var n = $(t).attr("id");
		var r = "panel-" + randomNumber();
		$(t).attr("id", r);
		$(t).parent().parent().find("a[href=#" + n + "]").attr("href", "#" + r)
	})
}
function randomNumber() {
	return randomFromInterval(1, 1e6)
}
function randomFromInterval(e, t) {
	return Math.floor(Math.random() * (t - e + 1) + e)
}
function gridSystemGenerator() {
	$(".lyrow .preview input").bind("keyup", function() {
		var e = 0;
		var t = "";
		var n = $(this).val().split(" ", 12);
		$.each(n, function(n, r) {
			e = e + parseInt(r);
			t += '<div class="span' + r + ' column"></div>'
		});
		if (e == 12) {
			$(this).parent().next().children().html(t);
			$(this).parent().prev().show()
		} else {
			$(this).parent().prev().hide()
		}
	})
}
function configurationElm(e, t) {
	$(".demo").delegate(".configuration > a", "click", function(e) {
		e.preventDefault();
		var t = $(this).parent().next().next().children();
		$(this).toggleClass("active");
		
		if($(this).attr("rel") === "password"){
			t.attr("type","password");
		}else if($(this).attr("rel") === "text"){
			t.attr("type","text");
		}else if($(this).attr("rel") === "checkbox"){
			t[1].innerHTML = '<input type="checkbox" name="checkbox"  style="margin-top: 7px;float: none;margin-left: 0px;"/>';
		}else{
			t.toggleClass($(this).attr("rel"))
		}
	});
	$(".demo").delegate(".configuration .dropdown-menu a", "click", function(e) {
		e.preventDefault();
		var t = $(this).parent().parent();
		var n = t.parent().parent().next().next().children();
		t.find("li").removeClass("active");
		$(this).parent().addClass("active");
		var r = "";
		t.find("a").each(function() {
			r += $(this).attr("rel") + " "
		});
		t.parent().removeClass("open");
		n.removeClass(r);
		
		if($(this).attr("rel") === "password"){
			n.attr("type","password");
		}else if($(this).attr("rel") === "text"){
			n.attr("type","text");
		}else if($(this).attr("rel") === "checkbox"){
			n[1].innerHTML = '<input type="checkbox" name="checkbox"  style="margin-top: -8px;float: none;margin-left: 0px;"/>';
		}else{
			n.addClass($(this).attr("rel"))
		}
	})
}
function removeElm() {
	$(".demo").delegate(".remove", "click", function(e) {
		e.preventDefault();
		$(this).parent().remove();
		if (!$(".demo .lyrow").length > 0) {
			clearDemo()
		}
	})
}
function clearDemo() {
	$(".demo").empty();
	layouthistory = null;
	if (supportstorage())
		localStorage.removeItem("layoutdata");
}
function removeMenuClasses() {
	$("#menu-layoutit li button").removeClass("active")
}
function changeStructure(e, t) {
	$("#download-layout ." + e).removeClass(e).addClass(t)
}
function cleanHtml(e) {
	$(e).parent().append($(e).children().html())
}
function downloadLayoutSrc() {
	var e = "";
	$("#download-layout").children().html($(".demo").html());
	var t = $("#download-layout").children();
	t.find(".preview, .configuration, .drag, .remove").remove();
	t.find(".lyrow").addClass("removeClean");
	t.find(".box-element").addClass("removeClean");
	t.find(".lyrow .lyrow .lyrow .lyrow .lyrow .removeClean").each(function() {
		cleanHtml(this)
	});
	t.find(".lyrow .lyrow .lyrow .lyrow .removeClean").each(function() {
		cleanHtml(this)
	});
	t.find(".lyrow .lyrow .lyrow .removeClean").each(function() {
		cleanHtml(this)
	});
	t.find(".lyrow .lyrow .removeClean").each(function() {
		cleanHtml(this)
	});
	t.find(".lyrow .removeClean").each(function() {
		cleanHtml(this)
	});
	t.find(".removeClean").each(function() {
		cleanHtml(this)
	});
	t.find(".removeClean").remove();
	$("#download-layout .column").removeClass("ui-sortable");
	$("#download-layout .row-fluid").removeClass("clearfix").children().removeClass("column");
	if ($("#download-layout .container").length > 0) {
		changeStructure("row-fluid", "row")
	}
	formatSrc = $.htmlClean($("#download-layout").html(), {
		format: true,
		allowedAttributes: [
			["id"],
			["class"],
			["data-toggle"],
			["data-target"],
			["data-parent"],
			["role"],
			["data-dismiss"],
			["aria-labelledby"],
			["aria-hidden"],
			["data-slide-to"],
			["data-slide"]
		]
	});
	$("#download-layout").html(formatSrc);
	$("#downloadModal textarea").empty();
	$("#downloadModal textarea").val(formatSrc)
}

var currentDocument = null;
var timerSave = 1000;
var stopsave = 0;
var startdrag = 0;
var demoHtml = $(".demo").html();
var currenteditor = null;
var currentNum = null;
var boxType = 0;
$(window).resize(function() {
	$("body").css("min-height", $(window).height() - 90);
	$(".demo").css("min-height", $(window).height() - 160)
});

function restoreData(){
	if (supportstorage()) {
		layouthistory = JSON.parse(localStorage.getItem("layoutdata"));
		if (!layouthistory) return false;
		window.demoHtml = layouthistory.list[layouthistory.count-1];
		if (window.demoHtml) $(".demo").html(window.demoHtml);
	}
}

function initContainer(){
	$(".demo, .demo .column").sortable({
		connectWith: ".column",
		opacity: .35,
		handle: ".drag",
		start: function(e,t) {
			if (!startdrag) stopsave++;
			startdrag = 1;
		},
		stop: function(e,t) {
			if(stopsave>0) stopsave--;
			startdrag = 0;
		}
	});
	configurationElm();
}
$(document).ready(function() {
	CKEDITOR.disableAutoInline = true;
	restoreData();
	var contenthandle = CKEDITOR.replace( 'contenteditor' ,{
		language: 'zh-cn',
		contentsCss: ['css/bootstrap-combined.min.css'],
		allowedContent: true
	});
	$("body").css("min-height", $(window).height() - 90);
	$(".demo").css("min-height", $(window).height() - 160);
	$(".sidebar-nav .lyrow").draggable({
		connectToSortable: ".demo",
		helper: "clone",
		handle: ".drag",
		start: function(e,t) {
			if (!startdrag) stopsave++;
			startdrag = 1;
		},
		drag: function(e, t) {
			t.helper.width(400)
		},
		stop: function(e, t) {
			$(".demo .column").sortable({
				opacity: .35,
				connectWith: ".column",
				start: function(e,t) {
					if (!startdrag) stopsave++;
					startdrag = 1;
				},
				stop: function(e,t) {
					if(stopsave>0) stopsave--;
					startdrag = 0;
				}
			});
			if(stopsave>0) stopsave--;
			startdrag = 0;
		}
	});
	$(".sidebar-nav .box").draggable({
		connectToSortable: ".column",
		helper: "clone",
		handle: ".drag",
		start: function(e,t) {
			if (!startdrag) stopsave++;
			startdrag = 1;
		},
		drag: function(e, t) {
			t.helper.width(400)
		},
		stop: function() {
			handleJsIds();
			if(stopsave>0) stopsave--;
			startdrag = 0;
		}
	});
	initContainer();
	$('body.edit .demo').on("click","[data-target=#editorModal]",function(e) {
		e.preventDefault();
		currenteditor = $(this).parent().parent().find('.view');
		var eText = currenteditor.html();
		contenthandle.setData(eText);
	});
	$("#savecontent").click(function(e) {
		e.preventDefault();
		currenteditor.html(contenthandle.getData());
	});
	$("[data-target=#downloadModal]").click(function(e) {
		e.preventDefault();
		downloadLayoutSrc();
	});
	$("[data-target=#shareModal]").click(function(e) {
		e.preventDefault();
		handleSaveLayout();
	});
	//复选框和单选框，“多选”和“个数”点击事件
	$('body.edit .demo').on("click","[data-target=#countModal]",function(e) {
		e.preventDefault();
		currentNum = $(this).parent().parent().find(".checkbox-div");
		boxType = 0;
		if(currentNum === null || currentNum === undefined || currentNum.length < 1){
			currentNum = $(this).parent().parent().find(".radio-div");
			boxType = 1;
		}
	});
	//按钮添加点击事件
	$('body.edit .demo').on("click","[data-target=#clickModal]",function(e) {
		e.preventDefault();
		currenteditor = $(this).parent().parent().find('.view');
	});
	
	$("#saveOriginal").click(function(e) {
		var name = $("#originalName").val();
		if(name !== null && name !== undefined && name !== ""){
			saveToDatabase(name);
		}else{
			return false;
		}
	});
	$("#download").click(function() {
		downloadLayout();
		return false
	});
	$("#downloadhtml").click(function() {
		downloadHtmlLayout();
		return false
	});
	//显示个数的“确定”点击事件
	$("#renderContent").click(function(e) {
		var count = $("#countNum").val();
		if(count !== null && count !== undefined && count !== ""){
			count = parseInt(count);
			if(count > 0){
				var html = "";
				for (var i = 0; i < count; i++) {
					if(boxType === 0){
						html += '<input type="checkbox" name="checkbox" style="margin-top: -8px;float: none;margin-left: 0px;"/><lable class="control-label" contenteditable="true">option'+i+'</lable> '
					}else{
						html += '<input type="radio" name="radio" style="margin-top: -8px;"/><lable class="control-label" contenteditable="true">option'+i+'</lable> '
					}
				}
				currentNum.html(html);
			}else{
				return false
			}
		}else{
			return false
		}
	});
	//“确定”后添加事件和方法
	$("#renderClick").click(function(e) {
		var funcName = $("#funcName").val();
		var funcContent = $("#funcContent").val();
		var button = currenteditor.find(".btn");
		if(funcContent !== null && funcContent !== undefined && funcContent !== ""){
			if(funcName !== null && funcName !== undefined && funcName !== ""){
				var target = $("#targetHtml").val();
				if(target !== null && target !== undefined && target !== ""){
					target = 'window.open(\"'+target+'\", "_self");';
				}else{
					target = "";
				}
				button.attr("onclick", funcName);
				var html1 = '<script>'
					+ 'function ' + funcName + '{'
					+ '  ' + funcContent + ';'
					+ '  ' + target
					+ '}'
					+ '</script>';
				var html2 = 'function ' + funcName + '{' + funcContent + '; ' + target + '}';
				var script = currenteditor.find("script");
				if(script === undefined || script === null || script.length < 1){
					currenteditor.append(html1);
				}else{
					script.html(html2);
				}
			}else{
				return false
			}
		}else{
			return false
		}
	});
	$("#edit").click(function() {
		$("body").removeClass("devpreview sourcepreview");
		$("body").addClass("edit");
		removeMenuClasses();
		$(this).addClass("active");
		return false
	});
	$("#clear").click(function(e) {
		e.preventDefault();
		clearDemo()
	});
	$("#devpreview").click(function() {
		$("body").removeClass("edit sourcepreview");
		$("body").addClass("devpreview");
		removeMenuClasses();
		$(this).addClass("active");
		return false
	});
	$("#sourcepreview").click(function() {
		$("body").removeClass("edit");
		$("body").addClass("devpreview sourcepreview");
		removeMenuClasses();
		$(this).addClass("active");
		return false
	});
	$("#fluidPage").click(function(e) {
		e.preventDefault();
		changeStructure("container", "container-fluid");
		$("#fixedPage").removeClass("active");
		$(this).addClass("active");
		downloadLayoutSrc()
	});
	$("#fixedPage").click(function(e) {
		e.preventDefault();
		changeStructure("container-fluid", "container");
		$("#fluidPage").removeClass("active");
		$(this).addClass("active");
		downloadLayoutSrc()
	});
	$(".nav-header").click(function() {
		$(".sidebar-nav .boxes, .sidebar-nav .rows").hide();
		$(this).next().slideDown()
	});
	$('#undo').click(function(){
		stopsave++;
		if (undoLayout()) initContainer();
		stopsave--;
	});
	$('#redo').click(function(){
		stopsave++;
		if (redoLayout()) initContainer();
		stopsave--;
	});
	removeElm();
	gridSystemGenerator();
	setInterval(function() {
		handleSaveLayout()
	}, timerSave)
})