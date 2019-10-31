package com.algorithm.通用工具.实体类;


/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 二分查找使用的实体
 * @date 2019-10-26 16:31
 */
public class BipartiteBean {

    /*** 待查找的数组*/
    private Integer[] integers;
    /*** 起始位置*/
    private int start;
    /*** 结束位置*/
    private int end;
    /*** 要查找的值*/
    private int value;

    /**
     *  空构造方法
     */
    public BipartiteBean() {
    }

    /**
     * 带参的构造方法
     */
    public BipartiteBean(Integer[] integers, int start, int end, int value) {
        this.integers = integers;
        this.start = start;
        this.end = end;
        this.value = value;
    }

    public Integer[] getIntegers() {
        return integers;
    }

    public void setIntegers(Integer[] integers) {
        this.integers = integers;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
