package com.algorithm.插入排序;

import com.algorithm.通用工具.实体类.BipartiteBean;
import com.algorithm.通用工具.抽象类.AbstractTestMethod;
import com.algorithm.通用工具.工具类.CommonUtil;
import com.algorithm.通用工具.枚举类.SortMethodType;
import com.algorithm.线性查找方法.ClientLine;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 插入排序客户端
 * 什么是插入排序 类似打扑克牌 摸牌后按照顺序排列自己的手牌
 * @date 2019-10-23 16:14
 */
public class ClientInsert extends AbstractTestMethod {

    public static void main(String[] args) {
        //获得待排序的 list
        List<Integer> linkedList = buildLinkedList();
        System.out.println(linkedList.toString());
        //降序
        insertSort(linkedList);
        System.out.println(linkedList.toString());

        //获得待排序的 array
        Integer[] integers = buildIntegerArray();
        System.out.println(Arrays.asList(integers).toString());
        //升序
        insertSortBy2(integers);
        System.out.println(Arrays.asList(integers).toString());
    }

    /**
     * 方法描述: linkedList 插入排序 (降序)
     *
     * @param linkedList 待排序的数据
     * @author LiShuLin
     * @date 2019/10/23
     */
    private static void insertSort(List<Integer> linkedList) {
        //定义要使用的变量
        int key, j;
        for (int i = 1; i < linkedList.size(); i++) {
            key = linkedList.get(i);
            j = i - 1;
            //降序与升序的代码基本一致 唯一不同的就是 while 循环的判断条件变为小于 <
            while (j >= 0 && linkedList.get(j) < key) {
                linkedList.set(j + 1, linkedList.get(j));
                j--;
            }
            linkedList.set(j + 1, key);
        }
    }

    /**
     * 方法描述: 数组的插入排序方法(升序)
     *
     * @param integers 待排序的数组
     * @author LiShuLin
     * @date 2019/10/23
     */
    private static void insertSort(Integer[] integers) {
        insertSort(integers, 0, integers.length);
    }

    /**
     * 方法描述: 数组的插入排序方法(升序)
     *
     * @param integers 待排序的数组
     * @author LiShuLin
     * @date 2019/10/23
     */
    public static void insertSort(Integer[] integers, int start,int length) {
        //用来存储当前下标值
        int key;
        //用来存储比当前下标小的值
        int j;
        //从第二位开始循环
        for (int i = start + 1; i < length; i++) {
            //存储当前下标值
            key = integers[i];
            //获取前一位下标
            j = i - 1;
            //开始比较前一位与当前值的大小
            while (j >= start && integers[j] > key) {
                //如果前一位的值比较大，则将前一位的值 赋值给当前下标
                integers[j + 1] = integers[j];
                //下标减 1 继续进行下一次的 while 循环
                j--;
            }
            //将当前存储的值（也就是比较小的值）放置在比当前小的值后面
            integers[j + 1] = key;
        }
    }
    /**
     * 方法描述:  带二分查找法的 插入排序
     *
     * @param integers 待排序的数组
     * @author LiShuLin
     * @date 2019/10/26
     */
    private static void insertSortBy2(Integer[] integers) {
        insertSortBy2(integers, 0);
    }
    /**
     * 方法描述:  带二分查找法的 插入排序
     *
     * @param integers 待排序的数组
     * @author LiShuLin
     * @date 2019/10/26
     */
    public static void insertSortBy2(Integer[] integers, int start) {
        //用来存储当前下标值
        int key;
        //用来存储比当前下标小的值
        int j;
        for (int i = start + 1; i < integers.length; i++) {
            //存储当前下标值
            key = integers[i];
            int value = ClientLine.findBy2Core(new BipartiteBean(integers, start, i, key), 1);
            for (j = i; j > value; j--) {
                integers[j] = integers[j - 1];
            }
            integers[value] = key;
        }
    }

    /**
     * 方法描述: 构建一个 linkedList
     *
     * @return java.util.List<java.lang.Integer>
     * @author LiShuLin
     * @date 2019/10/23
     */
    private static Integer[] buildIntegerArray() {
        return new Integer[]{4, 10, 41, 34, 22, 18, 5, 31, 14};
    }

    /**
     * 方法描述: 构建一个 linkedList
     *
     * @return java.util.List<java.lang.Integer>
     * @author LiShuLin
     * @date 2019/10/23
     */
    private static List<Integer> buildLinkedList() {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(4);
        linkedList.add(10);
        linkedList.add(41);
        linkedList.add(34);
        linkedList.add(22);
        linkedList.add(18);
        linkedList.add(5);
        linkedList.add(31);
        linkedList.add(14);
        return linkedList;
    }

    //选择算法 暂未写出
    private static void selectSort(Integer[] integers) {
//        min(integers);
    }

    /**
     * 方法描述:  获得数组中最小的值
     *
     * @param integers 数组
     * @author LiShuLin
     * @date 2019/10/25
     */
    private static void min(Integer[] integers) {
        int result = integers[0];
        for (int i = 1, length = integers.length; i < length; i++) {
            result = CommonUtil.getMin(result, integers[i]);
        }
//        findValue(integers, result);
        System.out.println(result);
    }


    /**
     * 方法描述:  待实现的抽象排序方法
     *
     * @param integers 待排序的数组
     * @param methodType 切换不同的方法
     * @author LiShuLin
     * @date 2019/10/26
     */
    @Override
    protected void sortMethod(Integer[] integers, SortMethodType methodType) {
        if (methodType == SortMethodType.BASIS ) {
            insertSort(integers);
        }else {
            insertSortBy2(integers);
        }
    }
}
