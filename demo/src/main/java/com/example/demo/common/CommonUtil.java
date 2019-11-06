package com.example.demo.common;

/**
 * @author Shulin Li
 * @version v1.0
 * @program rehearsal
 * @description 通用工具类
 * @date 2019-11-06 12:12
 */
public class CommonUtil {

    /**
     *  打印消息
     */
    public static void printMessage(Object value) {
        System.out.println(packageMessage(value));
    }
    /**
     *  打印消息
     */
    public static void printMessage(String key, Object value) {
        System.out.println(packageMessage(key, value));
    }

    /**
     * 格式化
     */
    private static String packageMessage(Object value) {
        return String.format("该值为：%s", value);
    }
    /**
     * 格式化
     */
    private static String packageMessage(String key, Object value) {
        return String.format("%s值为：%s", key, value);
    }
}
