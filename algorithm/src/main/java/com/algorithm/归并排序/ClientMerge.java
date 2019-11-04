package com.algorithm.归并排序;

import com.algorithm.通用工具.工具类.CommonUtil;
import com.algorithm.通用工具.抽象类.AbstractTestMethod;
import com.algorithm.通用工具.枚举类.SortMethodType;
import com.algorithm.插入排序.ClientInsert;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 归并排序
 *   将大数组拆分成小数组以至于拆分成一个一个小单元，然后递归排序
 * @date 2019-10-25 10:56
 */
public class ClientMerge extends AbstractTestMethod {

    public static void main(String[] args) {
        Integer[] integers = buildArray();
        mergeSort(integers, 0, integers.length);
        CommonUtil.printArray(integers);
    }

    /**
     *  参数构建
     */
    private static Integer[] buildArray() {
        return new Integer[]{2, 8, 6, 4, 10, 13, 1, 11, 5, 9, 7, 3,16,14,15};
    }


    /**
     * 方法描述:  归并排序
     *
     * @param integers 待排序的数组
     * @param startIndex 数组起始下标
     * @param length 数组长度
     * @author LiShuLin
     * @date 2019/10/25
     */
    private static void mergeSort(Integer[] integers, int startIndex, int length) {
        //拒绝入参为 (0，1) 等类似参数 因为这样的数据无效
        if (startIndex < length - 1) {
            int middle = ((startIndex + length) / 2);
            //递归调用获得最小单元 如 0,2
            mergeSort(integers, startIndex, middle);
            mergeSort(integers, middle, length );
            //调用核心排序方法
            merge(integers, startIndex, middle, length);
        }
    }

    /**
     * 方法描述:  归并排序
     *
     * @param integers 待排序的数组
     * @param startIndex 数组起始下标
     * @param length 数组长度
     * @author LiShuLin
     * @date 2019/10/25
     */
    private static void mergeSortOne(Integer[] integers, int startIndex, int length) {
        //拒绝入参为0，1 等类似参数 因为这样的数据无效
        if (startIndex < length - 1) {
            int middle = ((startIndex + length) / 2);
            //递归调用获得最小单元 如 0,2
            mergeSortOne(integers, startIndex, middle);
            mergeSortOne(integers, middle, length );
            //调用核心排序方法
            mergeOne(integers, startIndex, middle, length);
        }
    }

    /**
     * 方法描述:  归并排序 拓展二 联合插入排序，使树的叶子变粗
     *   以 500 条数据为界限  小于 500 的使用基础插入排序  PS: 貌似使用二分更会拖缓速度
     *                        大于 500 的使用二分插入排序
     *
     * @param integers 待排序的数组
     * @param startIndex 数组起始下标
     * @param length 数组长度
     * @author LiShuLin
     * @date 2019/10/25
     */
    private static void mergeSortTwo(Integer[] integers, int startIndex, int length) {
        //拒绝入参为0，1 等类似参数 因为这样的数据无效
        if (startIndex + 81 < length - 1) {
            int middle = ((startIndex + length) / 2);
            //递归调用获得最小单元 如 0,2
            mergeSortTwo(integers, startIndex, middle);
            mergeSortTwo(integers, middle, length);
            //调用核心排序方法
            merge(integers, startIndex, middle, length);
        }else {
            ClientInsert.insertSort(integers, startIndex, length);
        }
    }

    /**
     * 方法描述:  归并排序核心方法，拒绝 0,0,1 的类似入参 因为无意义
     *
     * @param integers 待归并的数组
     * @param startIndex 起始下标
     * @param middle 分割位置
     * @param length 数组长度
     * @author LiShuLin
     * @date 2019/10/25
     */
    private static void merge(Integer[] integers, int startIndex, int middle, int length) {
        //计算切割后数组长度
        int leftLength = middle - startIndex;
        int rightLength = length - middle;
        //构建两个子数组，并且长度 + 1
        Integer[] leftArray = new Integer[leftLength + 1];
        Integer[] rightArray = new Integer[rightLength + 1];
        //数组赋值
        System.arraycopy(integers, startIndex,leftArray, 0, leftLength);
        System.arraycopy(integers, middle,rightArray, 0, rightLength);

        //构建子数组最后一位数，最好是 正无穷大 这里我使用的是 int 的最大值
        leftArray[leftLength] = Integer.MAX_VALUE;
        rightArray[rightLength] = Integer.MAX_VALUE;
        int i = 0, j = 0;
        //开始替换 原数组 的值
        for (int k = startIndex; k < length; k++) {
            //比较两个子数组，将较小的先写入原数组中
            if (leftArray[i] <= rightArray[j] ) {
                integers[k] = leftArray[i];
                i++;
            }else {
                integers[k] = rightArray[j];
                j++;
            }
        }
    }
    /**
     * 经测试 貌似这个拓展不能加快排序时间
     * 方法描述:  归并排序的核心方法拓展
     *   拓展的地方是 去掉数组最后自定义的最大位
     *   改为判断左或右边的数组，谁先读完那么就将另一个
     *   数组中剩余的值复制到原数组中
     *
     * @param integers 待归并的数组
     * @param startIndex 起始下标
     * @param middle 分割位置
     * @param length 数组长度
     * @author LiShuLin
     * @date 2019/10/26
     */
    private static void mergeOne(Integer[] integers, int startIndex, int middle, int length) {
        //计算切割后数组长度
        int leftLength = middle - startIndex;
        int rightLength = length - middle;
        //构建两个子数组，并且长度
        Integer[] leftArray = new Integer[leftLength];
        Integer[] rightArray = new Integer[rightLength];
        //用系统 copy 方法 取代遍历赋值
        System.arraycopy(integers, startIndex,leftArray, 0, leftLength);
        System.arraycopy(integers, middle,rightArray, 0, rightLength);
//        for (int i = 0; i < leftLength; i++) {
//            leftArray[i] = integers[startIndex + i];
//        }
//        for (int i = 0; i < rightLength; i++) {
//            rightArray[i] = integers[middle + i];
//        }
        Integer i = 0, j = 0;
        //开始替换 原数组 的值
        for (int k = startIndex; k < length; k++) {
            //当左边数组已经全部放入原数组后那么便可将右边数组剩下的全部放入原数组
            if(i == leftLength) {
                //array_copy 方法参数解释 1:待复制数组 2:复制数组的起始位置 3:复制数组放入数组 4:复制数组要放入的位置 5:要复制的长度
                //所以这里需要拿到剩下的数组长度 length - 1
                System.arraycopy(rightArray, j, integers, k, rightLength - j);
                break;
            }
            //当右边数组已经全部放入原数组后那么便可将左边数组剩下的全部放入原数组
            if(j == rightLength) {
                //array_copy 方法参数解释 1:待复制数组 2:复制数组的起始位置 3:复制数组放入数组 4:复制数组要放入的位置 5:要复制的长度
                //所以这里需要拿到剩下的数组长度 length - 1
                System.arraycopy(leftArray, i, integers, k, leftLength - i);
                break;
            }
            //比较两个子数组，将较小的先写入原数组中
            if (leftArray[i] <= rightArray[j] ) {
                integers[k] = leftArray[i];
                i++;
                continue;
            }
            integers[k] = rightArray[j];
            j++;
        }
    }

   /**
    * 方法描述:  初始化数组
    *
    * @param integers 原数组
    * @param length 新建数组长度
    * @param index 数组开始下标
    * @return java.lang.Integer[]
    * @author LiShuLin
    * @date 2019/10/26
    */
    private static Integer[] initArray(Integer[] integers, int length, int index) {
        Integer[] arrays = new Integer[length];
        for (int i = 0; i < length; i++) {
            arrays[i] = integers[index + i];
        }
        return arrays;
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
        if (SortMethodType.BASIS == methodType) {
            mergeSort(integers, 0, integers.length);
        }else {
            mergeSortTwo(integers, 0, integers.length);
        }
    }
}
