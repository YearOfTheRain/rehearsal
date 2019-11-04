package com.algorithm.冒泡排序;

import com.algorithm.通用工具.工具类.CommonUtil;
import com.algorithm.通用工具.抽象类.AbstractTestMethod;
import com.algorithm.通用工具.枚举类.SortMethodType;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 冒泡排序
 * @date 2019-10-29 10:50
 */
public class ClientBubble extends AbstractTestMethod {

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{4, 10, 5, 41, 34, 22, 18, 5, 31, 14};
        bubbleSort(integers);
        CommonUtil.printArray(integers);
    }

    /**
     * 方法描述:  冒泡排序 核心方法
     *
     * @param integers 待排序的数组
     * @author LiShuLin
     * @date 2019/10/29
     */
    private static void bubbleSort(Integer[] integers) {
        int length = integers.length;
        int maxIndex = length - 1;
        int temp;
        for (int i = 0; i < length - 1; i++) {
            for (int j = maxIndex; j > i; j--) {
                //冒泡 核心交换方法，将大的数向后排
                if (integers[i] > integers[j]) {
                    temp = integers[i];
                    integers[i] = integers[j];
                    integers[j] = temp;
                }
            }
        }
    }

    /**
     * 方法描述:  待实现的抽象排序方法
     *
     * @param integers   待排序的数组
     * @param methodType 切换不同的方法
     * @author LiShuLin
     * @date 2019/10/26
     */
    @Override
    protected void sortMethod(Integer[] integers, SortMethodType methodType) {
        bubbleSort(integers);
    }
}
