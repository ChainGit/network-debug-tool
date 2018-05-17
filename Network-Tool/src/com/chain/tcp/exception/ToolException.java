package com.chain.tcp.exception;

import com.chain.tcp.log.ToolLogger;

public class ToolException extends RuntimeException {

	private static final long serialVersionUID = 2262718710239553537L;

	private static Class<ToolException> clz = ToolException.class;

	private ToolLogger logger = ToolLogger.getInstance();

	public ToolException(Class<?> clz, String msg, Throwable e) {
		super(msg, e);
		logger.error(clz, msg, e);
	}

	public ToolException(Class<?> clz, String msg) {
		super(msg);
		logger.error(clz, msg);
	}

	public ToolException(Class<?> clz) {
		super();
		logger.error(clz, null);
	}

	public ToolException() {
		super();
		logger.error(clz, null);
	}

}
