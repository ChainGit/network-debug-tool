package com.chain.tcp.log;

import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.chain.tcp.exception.ToolException;

public class ToolLogger {

	private Class<ToolLogger> clz = ToolLogger.class;

	private Map<String, OutputStream> outputStreamMap;
	private Map<String, ToolLoggerConfig> outputStreamConfigMap;

	private ToolLoggerConfig globalLoggerConfig;
	private static final String GLOBAL_LOGGER_CONFIG = "GLOBAL_LOGGER_CONFIG";

	public void addOutput(String outputName, OutputStream os) {
		if (os == null) {
			throw new ToolException(clz, "output stream is null");
		}
		if (outputStreamMap.get(outputName) == os) {
			return;
		}
		removeOutput(outputName);
		outputStreamConfigMap.put(outputName, new ToolLoggerConfig());
		outputStreamMap.put(outputName, os);
	}

	public void removeOutput(String outputName) {
		outputStreamMap.remove(outputName);
		outputStreamConfigMap.remove(outputName);
	}

	public void info(Class<?> clz, String msg) {
		log(TYPE_INFO, clz, msg, null);
	}

	public void error(Class<?> clz, String msg, Throwable e) {
		log(TYPE_INFO, clz, msg, e);
	}

	public void error(Class<?> clz, String msg) {
		log(TYPE_ERROR, clz, msg, null);
	}

	private static final int TYPE_INFO = 1;
	private static final int TYPE_ERROR = 0;

	private static final String TYPE_INFO_VALUE = "INFO";
	private static final String TYPE_ERROR_VALUE = "ERROR";

	private void log(int type, Class<?> clz, String msg, Throwable e) {

	}

	private ToolLogger() {
		outputStreamMap = new ConcurrentHashMap<>();
	}

	private static class Instance {
		private static ToolLogger instance = new ToolLogger();
	}

	public static ToolLogger getInstance() {
		return Instance.instance;
	}

}
