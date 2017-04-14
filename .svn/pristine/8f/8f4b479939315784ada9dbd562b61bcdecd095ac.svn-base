package com.edp.common.utils;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.MDC;

public class ZgbLogUtil {
	public static final String CYWS_PRODUCT_NAME = "cyws_product_id";

	public static final String CYWS_MODULE_NAME = "cyws_module_id";

	public static final String CYWS_NODE_NAME = "cyws_node_id";

	public static final String CYWS_PROCESS_NAME = "cyws_process_id";
	
	private static Map<String, String> unvariableInfoMap;
	
	static {
		checkAndSet(CYWS_PRODUCT_NAME);
		checkAndSet(CYWS_MODULE_NAME);
		checkAndSet(CYWS_NODE_NAME);
	}
	
	private static void checkAndSet(String infoName) {
		String infoValue = System.getProperty(infoName);
		check(infoName, infoValue);
		if(unvariableInfoMap == null)
			unvariableInfoMap = new HashMap<String, String>();
		unvariableInfoMap.put(infoName, infoValue);
	}
	
	private static void check(String infoName, String infoValue) {
		if(infoValue == null || "".equals(infoValue))
			throw new RuntimeException(infoName + " must be set");		
	}
	
	public static void registerProcessID(String processID) {
		check(CYWS_PROCESS_NAME, processID);
		
		MDC.put("product", unvariableInfoMap.get(CYWS_PRODUCT_NAME));
		MDC.put("module", unvariableInfoMap.get(CYWS_MODULE_NAME));
		MDC.put("node", unvariableInfoMap.get(CYWS_NODE_NAME));
		MDC.put("process", processID);
	}
	
	public static void registerInteractionUUID(String interactionUUID) {
		MDC.put("uuid", interactionUUID);
	}
	
	public static String getProcessID() {
		return MDC.get("process");
	}
	
	public static String getIntetractionUUID() {
		return MDC.get("uuid");
	}
}
