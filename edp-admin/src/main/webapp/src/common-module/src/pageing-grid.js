/**
 * 对GRID，Store，ToolBar封装
 */
KISSY.add('common-module/src/pageing-grid',function(S, IO,Grid, Data, Toolbar,Select,CommonDom){
	function Pageing() {
		this.grid;
		this.store;
		this.bar;
		var common = new CommonDom();
		var _this = this;
		//this.select;
		/**
		 * @function initPageing 表格定义
		 * @param gridId 渲染Grid的id属性
		 * @param columns 定义表格表头
		 * @param url store的url地址
		 * @param pagesize 分页数
		 * @param params 请求参数
		 * @param gridBarId 渲染的bar的id属性
		 */
		this.initPageing = function(gridId, columns, url, pageSize, params, gridBarId, plugins1) {
			this.store = new Data.Store({
				 data : [],
				 url : url,
	     	     autoLoad : true,
	     	     remoteSort : true,
	     	     params : params,
	     	     proxy:{
	     	    	method : 'post',
	     	    	limitParam:'limit',
	     	    	pageIndexParam:'pageIndex',
	     	    	ajaxOptions:{
	     	    		error:function(){
	     	    			common.redirect(501);
	     	    			return false;
	     	    		}
	     	    	}
	     	     },
	     	     pageSize:pageSize
    	      });
			
			this.grid = new Grid.Grid({
	     	    render:'#' + gridId,
	     	    width : '100%',
	     	    height : 495,
	     	    //forceFit: true,
	     	    stripeRows: false,
	     	    innerBorder: false, // 默认为true
	     	    emptyDataTpl : '<div class="centered" id="centered" style="height:21px;"><h4>没有符合条件的记录</h4></div>',
	     	    columns : columns,
	     	    store : this.store,
	     	   plugins : plugins1
     	    });
			
			//分页
     	    this.bar = new Toolbar.NumberPagingBar({
	     	    render : '#' + gridBarId,
	     	    elCls : 'pagination pull-right',
	     	    store : this.store
     	    });
     	    
     	    this.grid.render();
     	    this.bar.render();
		};
		/**
		 * @function initSelect 下拉框定义
		 * @param selName 渲染隐藏域的id属性
		 * @param divId 定义divID
		 * @param selWidth 下拉框宽度
		 * @param selDisabled 是否置灰
		 * @param setSelValue 是否设置默认值
		 * @param items 下拉框属性值
		 */
		this.initSelect =function(selName,divId,items,selWidth,selDisabled,setSelValue){
			var select = new Select.Select({
				name : selName,
				render : '#'+divId,
				valueField : 'hide',
				disabled:selDisabled,
				width : selWidth,
				items : items

			});
			select.render(); 
			//默认显示“请选择”
			select.setSelectedValue(setSelValue);
			return select;
	    };	

	}
	
	return Pageing;
}, {
	requires : ['io', 'bui/grid','bui/data','bui/toolbar','bui/select','common-module/src/common']
});