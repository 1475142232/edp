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
package com.edp.serviceI.exception;


import com.edp.common.exception.EbizRuntimeException;

/**
 * ClassName: EbizRuntimeException <br/>
 * Function: 自定义非检查异常 <br/>
 * date: 2015年3月2日 下午1:10:44 <br/>
 * 
 * @author st-sb3915
 * @version
 * @since JDK 1.6
 */
public class ZgbRuntimeException extends EbizRuntimeException {
	private static final long serialVersionUID = -1217980756384733301L;

	public ZgbRuntimeException(Throwable e) {
		super("", e.getMessage());
	}

	public ZgbRuntimeException(String msg) {
		super("", msg);
	}

	public ZgbRuntimeException(String msg, Throwable e) {
		super("", msg);
	}

	public ZgbRuntimeException(String code, String message) {
		super(code, message);
	}

	public ZgbRuntimeException(String code, String message, Throwable cause) {
		super(code, message, cause);
	}
}
