package com.chain.tcp.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ToolGlobalRegister {

	private Map<Integer, Object> store;

	private ToolGlobalRegister() {
		store = new ConcurrentHashMap<>();
	}

	public static Object get(Integer key) {
		return getInstance().store.get(key);
	}

	public static void set(Integer key, Object val) {
		getInstance().store.put(key, val);
	}

	private static class Instance {
		private static ToolGlobalRegister instance = new ToolGlobalRegister();
	}

	public static ToolGlobalRegister getInstance() {
		return Instance.instance;
	}

}
