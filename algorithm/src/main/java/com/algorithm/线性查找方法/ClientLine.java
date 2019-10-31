package com.algorithm.线性查找方法;

import com.algorithm.通用工具.实体类.BipartiteBean;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 线性查找方法的客户端
 * @date 2019-10-26 16:10
 */
public class ClientLine {

    public static int findValue(Integer[] integers, int value) {
        for (int i = 0, size = integers.length; i < size; i++) {
            if (integers[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 方法描述:  如果该数组是已排好序的数组，可采用 二分法 进行查找
     *
     * @param integers 已排好序的数组
     * @param value 待查找的值
     * @return java.lang.Object
     * @author LiShuLin
     * @date 2019/10/25
     */
    public static int findValueBy2(Integer[] integers, int value) {
        //定义初始位置
        int start = 0;
        int end = integers.length - 1;
        return findBy2Core(new BipartiteBean(integers, start, end, value));
    }

    public static int findBy2Core(BipartiteBean bean) {
        return findBy2Core(bean, 0);
    }

    /**
     * 方法描述: 二分查找法的核心方法
     *
     * @param bean 二分查找 bean
     * @param status 返回结果值
     * @return int 如果找到值，返回该值对应的下标
     * @author LiShuLin
     * @date 2019/10/26
     */
    public static int findBy2Core(BipartiteBean bean, int status) {
        int start = bean.getStart();
        int end = bean.getEnd();
        int round;
        Integer[] integers = bean.getIntegers();
        //当查找的数组只剩一个值，则结束循环
        while (start <= end) {
            //采用位移完成 除2 的操作
            round = (start + end) >>> 1;
            //对值的判断,找到则返回对应下标
            if(bean.getValue() == integers[round]) {
                return round;
                //如果该值比中间值要小
            }else if(bean.getValue() < integers[round]) {
                //取前半部分继续查找
                end = round - 1;
            }else {
                //否则就取后半部分
                start = round + 1;
            }
        }
        //用个状态值，将二分的核心方法写的更灵活 --有更好的想法可以修改
        if(status == 0) {
            return  -1;
        }else {
            return start;
        }

    }
}
