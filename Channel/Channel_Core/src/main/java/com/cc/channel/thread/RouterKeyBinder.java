package com.cc.channel.thread;

/**
 * @author changcheng
 * @version 2017/6/8
 * @description
 */
public class RouterKeyBinder {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<String>();
    public static final String MAIN_DATASOURCE_KEY = "main_DataSource";
    public static final String LOG_DATASOURCE_KEY = "log_DataSource";

    public static void bindRouterKey(String routerKey) {
        threadLocal.set(routerKey);
    }

    public static String getRouterKey() {
        return threadLocal.get();
    }

    public static void remove() {
        threadLocal.remove();
    }
}
