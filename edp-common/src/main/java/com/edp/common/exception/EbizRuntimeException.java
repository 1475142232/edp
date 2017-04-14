/**
 * Copyright (C) 2002-2014 bocsoft (www.bocsoft.com)
 *
 * Licensed under the bocsoft License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.bocsoft.com/licenses/LICENSE-1.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.edp.common.exception;


/**
 * ClassName: EbizRuntimeException <br/>
 * Function: 自定义非检查异常 <br/>
 * date: 2015年3月2日 下午1:10:44 <br/>
 * 
 * @author st-sb3915
 * @version
 * @since JDK 1.6
 */
public class EbizRuntimeException extends RuntimeException {
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
    public EbizRuntimeException(String code,String message) {
        super(code+DEFAULT_SPLITTER+message);
        this.code= code;
        this.msg =message;
    }
	
    /**
     * @param message 寮傚父淇℃伅
     * @param code    寮傚父鐮�
     * @param cause
     */
    public EbizRuntimeException(String code,String message,Throwable cause) {
        super(code+DEFAULT_SPLITTER+message, cause);
        this.code= code;
        this.msg =message;
    }
}
