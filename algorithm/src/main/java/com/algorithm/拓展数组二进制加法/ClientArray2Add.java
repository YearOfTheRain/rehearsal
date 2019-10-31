package com.algorithm.拓展数组二进制加法;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 数组二进制加法
 * @date 2019-10-26 16:16
 */
public class ClientArray2Add {

    /**
     * 方法描述: 数组表示二进制数的加法运算（数组长度相同 不足可用数字 0 补充）
     *
     * @param num1 数组1
     * @param num2 数组2
     * @return java.lang.Integer[] 返回加法运算后生成的新的数组
     * @author LiShuLin
     * @date 2019/10/24
     */
    public static Integer[] sum(Integer[] num1, Integer[] num2) {
        //根据题目可知，两个数组长度是相同的
        int length = num1.length;
        //返回的结果长度 比当前长度 +1
        int arraySize = length + 1;
        //声明返回数组
        Integer[] sum = new Integer[arraySize];

        //full 满足进位时 该值 +1
        int full = 0;
        //totalValue 两个数组对应下标相加后的值
        int totalValue;
        //curValue 当前 value 值 包括计算的值 和 后一位进位的值
        int curValue;
        //sum 数组的下标 倒序
        int sumIndex;
        for (int i = length - 1; i >= 0; i--) {
            totalValue = num1[i] + num2[i];
            curValue = totalValue + full;
            sumIndex = i + 1;
            //如果是最后一次循环 则需判断是否进位
            if (i == 0) {
                sum[0] = 0;
                //需进位,则 sum 数组下标为 0 的值 = 1
                if (curValue > 1) {
                    sum[0] = 1;
                }
            }
            //需要进位
            if (curValue > 1) {
                //进位后，当前值是 0b10
                full = 1;
                //sum[i + 1] 从最后一位开始向前写入值
                sum[sumIndex] = 0;
                //进位后，当前值是 0b11
                if (curValue > 2) {
                    sum[sumIndex] = 1;
                }
                continue;
            }
            //不需要进位
            sum[sumIndex] = totalValue;
            //后一位进位了，但是当前值不满足进位
            if (full > 0) {
                sum[sumIndex] = totalValue + 1;
                full = 0;
            }
        }
        return sum;
    }

    /**
     * 方法描述: 拓展 1 将数组的值提取为字符串
     *     然后转为 10 进制进行运算，完成后再转二进制
     *     最后整合为 Integer 类型的数组
     *
     * @param num1 数组1
     * @param num2 数组2
     * @return java.lang.Integer[]
     * @author LiShuLin
     * @date 2019/10/24
     */
    public static Integer[] expandOne(Integer[] num1, Integer[] num2) {
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        int length = num1.length;
        //数据遍历 封装成字符串（StringBuilder）
        for (int i = 0; i < length; i++) {
            builder1.append(num1[i]);
            builder2.append(num2[i]);
        }
        //转为 10 进制
        Integer integer1 = Integer.valueOf(builder1.toString(), 2);
        Integer integer2 = Integer.valueOf(builder2.toString(), 2);
        //进行运算并转为二进制字符串
        String binaryString = Integer.toBinaryString(integer1 + integer2);
        char[] chars = binaryString.toCharArray();
        int charLength = chars.length;
        Integer[] sum = new Integer[charLength];
        for (int i = 0; i < charLength; i++) {
            //这里直接将 chars 转 int 会读成 单字符 比如 ‘0’ 会变成 48
            //所以这里先将 char 转 string, 然后将 string 转 int
            sum[i] = Integer.parseInt(String.valueOf(chars[i]));
        }
        return sum;
    }
}
