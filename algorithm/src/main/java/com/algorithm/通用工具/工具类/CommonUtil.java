package com.algorithm.通用工具.工具类;

import java.util.Arrays;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 通用工具类
 * @date 2019-10-26 14:24
 */
public class CommonUtil {

    /**
     *  打印数组
     * @param integers 待打印的数组
     */
    public static void printArray(Integer[] integers) {
        System.out.println(Arrays.asList(integers).toString());
    }

    /**
     *  构建一个指定长度的测试数组
     * @param length 待指定的长度
     */
    public static Integer[] buildTestArray(int length) {
        int min = 1;
        Integer[] integers = new Integer[length];
        for (int i = 0; i < length; i++) {
            integers[i] = (int)(Math.random() * (length - min) + min);
        }
        return integers;
    }

    /**
     * 方法描述:  获取两个数中较小的数
     *
     * @param num1 数字1
     * @param num2 数字2
     * @return int 返回较小的数字
     * @author LiShuLin
     * @date 2019/10/25
     */
    public static int getMin(int num1, int num2) {
        return num1 < num2 ? num1 : num2;
    }
}
