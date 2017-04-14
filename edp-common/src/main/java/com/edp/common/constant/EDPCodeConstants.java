package com.edp.common.constant;

/**
 * EDP系统交易码设置常量类
 * @author  changer  2016-5-20
 */
public class EDPCodeConstants {
	/**
	 * 通用成功码
	 */
	public static final String SUCCESS_CODE = "0000";

	/**
	 * 通用成功信息
	 */
	public static final String SUCCESS_MSG = "交易执行成功";

	/**
	 * 通用错误码
	 */
	public static final String ERROR_CODE = "9999";

	/**
	 * 通用错误信息
	 */
	public static final String ERROR_MSG = "交易执行失败";


	/**
	 * 通用输入数据校验信息码-无效
	 */
	public static final String INVALID_DATA_CODE = "5555";

	/**
	 * 通用输入数据校验信息-无效
	 */
	public static final String INVALID_DATA_MSG = "无效的输入数据";

	/**
	 * 通用查无记录信息码
	 */
	public static final String NO_RECORD_CODE = "1111";

	/**
	 * 通用查无记录信息
	 */
	public static final String NO_RECORD_MSG="查无记录";


	/**
	 * 工单-新建
	 */
	public static final String TASK_STATE_NEW="00";

	/**
	 * 工单-延期
	 */
	public static final String TASK_STATE_DELAY="88";

	/**
	 * 工单-删除
	 */
	public static final String TASK_STATE_DELETED="66";

	/**
	 * 工单-关闭
	 */
	public static final String TASK_STATE_CLOSED="77";

	/**
	 * 工单-转移
	 */
	public static final String TASK_STATE_TRANSFERED="55";

	/**
	 * 工单-执行中
	 */
	public static final String TASK_STATE_DOING="10";

	/**
	 * 工单-开发完成
	 */
	public static final String TASK_STATE_DONE="20";

	/**
	 * 工单-测试中
	 */
	public static final String TASK_STATE_TESTING="30";

	/**
	 * 工单-退回
	 */
	public static final String TASK_STATE_GOBACK="40";


	/**
	 * 工单-测试通过
	 */
	public static final String TASK_STATE_PASS="50";


	/**
	 * 工单-验收通过
	 */
	public static final String TASK_STATE_ACCEPTED="60";

	/**
	 * 工单-已发布
	 */
	public static final String TASK_STATE_PUBLISHED="70";


	/**
	 * 操作类型-工单转移
	 */
	public static final String OPERATE_TYPE_TRANSFERED = "01";


	/**
	 * 操作类型-工单状态变化
	 */
	public static final String OPERATE_TYPE_STATE_CHANGE = "02";


	/**
	 * 操作类型-工单延期
	 */
	public static final String OPERATE_TYPE_DELAY = "03";







}
