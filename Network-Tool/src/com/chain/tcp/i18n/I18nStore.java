package com.chain.tcp.i18n;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang3.StringUtils;

public class I18nStore {

	private Map<String, String> store;

	private static final String I18N_PREFIX = "i18n-";
	private static final String I18N_SUFFIX = ".properties";

	private static final String DEFAULT_LOCALE = "en_US";

	private I18nStore() {
		store = new ConcurrentHashMap<>();
		loadDefault();
		loadSpecific();
	}

	private void loadSpecific() {

	}

	private void loadDefault() {

	}

	public void hotChangeLanguage(String localeName) {

	}

	private String getPropertiesFileName(String localeName) {
		if (StringUtils.isBlank(localeName)) {

		}
		return StringUtils.join(I18N_PREFIX, localeName, I18N_SUFFIX);
	}

	public static Object get(String key) {
		return getInstance().store.get(key);
	}

	public static void set(String key, String val) {
		getInstance().store.put(key, val);
	}

	private static class Instance {
		private static I18nStore instance = new I18nStore();
	}

	public static I18nStore getInstance() {
		return Instance.instance;
	}

}
