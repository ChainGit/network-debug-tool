package com.chain.tcp.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ToolGuiRegister {

	private Map<Integer, Object> store;

	private ToolGuiRegister() {
		store = new ConcurrentHashMap<>();
	}

	public static Object get(Integer key) {
		return getInstance().store.get(key);
	}

	public static void set(Integer key, Object val) {
		getInstance().store.put(key, val);
	}

	private static class Instance {
		private static ToolGuiRegister instance = new ToolGuiRegister();
	}

	public static ToolGuiRegister getInstance() {
		return Instance.instance;
	}

}
