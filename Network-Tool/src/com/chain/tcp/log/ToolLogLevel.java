package com.chain.tcp.log;

public enum ToolLogLevel {

	DEBUG(9, "DEBUG"), NONE(0, "NONE"), INFO(1, "INFO"), ERROR(2, "ERROR");

	private int level;
	private String content;

	private ToolLogLevel(int level, String content) {
		this.level = level;
		this.content = content;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
