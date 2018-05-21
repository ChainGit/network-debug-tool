package com.chain.tcp.constants;

public class ToolGuiConstants {

	public static final int GUI_WINDOW_WIDTH = 800;
	public static final int GUI_WINDOW_HEIGHT = 700;

	public static final Integer GUI_REGISTER_JFRAME = 1;

	public static final Integer GUI_REGISTER_JBUTTON_CLEAR_UNSENDED = 2;
	public static final Integer GUI_REGISTER_JBUTTON_LANGUAGE = 3;
	public static final Integer GUI_REGISTER_JBUTTON_SEND = 4;
	public static final Integer GUI_REGISTER_JBUTTON_UPGRADE = 5;
	public static final Integer GUI_REGISTER_JBUTTON_CLEAR_LOG_OUT = 6;
	public static final Integer GUI_REGISTER_JBUTTON_CONNECT_OR_LISTEN = 7;

	public static final Integer GUI_REGISTER_JCOMBOBOX_CONTENT_FORMAT = 8;
	public static final Integer GUI_REGISTER_JCOMBOBOX_SESSION_LIST = 9;

	public static final Integer GUI_REGISTER_JTEXTFIELD_IP_ADDRESS = 10;
	public static final Integer GUI_REGISTER_JTEXTFIELD_PORT_NUMBER = 11;
	public static final Integer GUI_REGISTER_JTEXTFIELD_CHARSET_CONTENT = 12;

	public static final Integer GUI_REGISTER_JTEXTAREA_SEND_CONTENT = 13;
	public static final Integer GUI_REGISTER_JTEXTAREA_LOG_OUT_CONTENT = 14;
	public static final Integer GUI_REGISTER_JTEXTAREA_RECV_CONTENT = 15;

	public static final Integer GUI_REGISTER_JRADIOBUTTON_SEND_MODE = 16;
	public static final Integer GUI_REGISTER_JRADIOBUTTON_RECV_MODE = 17;
	public static final Integer GUI_REGISTER_JRADIOBUTTON_SHOT_CONNECT_MODE = 18;
	public static final Integer GUI_REGISTER_JRADIOBUTTON_LONG_CONNECT_MODE = 19;
	public static final Integer GUI_REGISTER_JRADIOBUTTON_TCP_MODE = 20;
	public static final Integer GUI_REGISTER_JRADIOBUTTON_UDP_MODE = 21;

	public static final Integer GUI_REGISTER_JCHECKBOX_ENABLE_LOG_OUT = 22;
	public static final Integer GUI_REGISTER_JCHECKBOX_IGNORE_WHEN_UNCONNECTED = 23;

	public static final Integer GUI_REGISTER_JLABEL_BRIEF_INFO = 24;

	private ToolGuiConstants() {
	}

	private static class Instance {
		private static ToolGuiConstants instance = new ToolGuiConstants();
	}

	public static ToolGuiConstants getInstance() {
		return Instance.instance;
	}
}
