package com.edp.common.exception;



/**
 * ClassName: EbizException <br/>
 * Function: 自定义检查异常 <br/>
 * date: 2015年3月2日 下午1:14:03 <br/>
 *
 * @author st-sb3915
 * @version 
 * @since JDK 1.6
 */
public class EbizException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 寮傚父鐮佷笌寮傚父淇℃伅鐨勫垎鍓茬
	 */
	private static final String  DEFAULT_SPLITTER=":";

	/**
	 * 寮傚父浠ｇ爜
	 */
	private String code;
	
	/**
	 * 寮傚父淇℃伅
	 */
	private String msg;
	public String getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	
	/**
     * @param message 寮傚父淇℃伅
     * @param code	  寮傚父鐮�
     */
    public EbizException(String code,String message) {
        super(code+DEFAULT_SPLITTER+message);
        this.code= code;
        this.msg =message;
    }
	
    /**
     * @param message 寮傚父淇℃伅
     * @param code    寮傚父鐮�
     * @param cause
     */
    public EbizException(String code,String message,Throwable cause) {
        super(code+DEFAULT_SPLITTER+message, cause);
        this.code= code;
        this.msg =message;
    }
}
