/**
 * 包配置config.js，规范模块声明，同时便于跑测试引包模块。或可为测试环节单独配置config_testOnly.js
 * 
 */
KISSY.config({
	'packages':{
		'common-module':{
		    debug: true,
		    tag: '20140827',
		    base: './src',
		    combine: false
		},
		'activititree-module':{
			debug: true,
		    tag: '20160612',
		    base: './src',
		    combine: false
		}
		
	}
});