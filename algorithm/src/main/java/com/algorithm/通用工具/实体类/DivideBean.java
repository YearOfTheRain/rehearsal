package com.algorithm.通用工具.实体类;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 分治策略使用的bean
 * @date 2019-11-04 14:52
 */
public class DivideBean {
   private int low;
   private int high;
   private int sum;

    public DivideBean() {
    }

    public DivideBean(int low, int high, int sum) {
        this.low = low;
        this.high = high;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "DivideBean{" +
                "low=" + low +
                ", high=" + high +
                ", sum=" + sum +
                '}';
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
