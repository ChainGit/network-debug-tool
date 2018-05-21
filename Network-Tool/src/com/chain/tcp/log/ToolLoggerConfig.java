package com.chain.tcp.log;

public class ToolLoggerConfig {

	private ToolLogLevel logLevel = ToolLogLevel.NONE;

	private boolean showClass = true;
	private boolean showTime = true;
	private boolean showException = true;
	private boolean showExceptionDetail = true;

	private Object lock = new Object();

	public boolean isShowClass() {
		return showClass;
	}

	public void setShowClass(boolean showClass) {
		synchronized (lock) {
			this.showClass = showClass;
		}
	}

	public boolean isShowTime() {
		return showTime;
	}

	public void setShowTime(boolean showTime) {
		synchronized (lock) {
			this.showTime = showTime;
		}
	}

	public boolean isShowException() {
		return showException;
	}

	public void setShowException(boolean showException) {
		synchronized (lock) {
			this.showException = showException;
		}
	}

	public boolean isShowExceptionDetail() {
		return showExceptionDetail;
	}

	public void setShowExceptionDetail(boolean showExceptionDetail) {
		synchronized (lock) {
			this.showExceptionDetail = showExceptionDetail;
		}
	}

	public ToolLogLevel getLogLevel() {
		return logLevel;
	}

	public void setLogLevel(ToolLogLevel logLevel) {
		synchronized (lock) {
			this.logLevel = logLevel;
		}
	}

}
