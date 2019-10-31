package com.rehearsal.refactoring.pro8_1;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Self Encapsulate Field（自封装值域）
 * @date 2019-08-17 15:41
 **/
public class IntRange {

    private int low, high;

    public IntRange(int low, int high) {
        this.low = low;
        this.high = high;
    }

    boolean includes(int arg) {
        return arg >= low && arg <= high;
    }

    void grow(int factor) {
        this.high = this.high * factor;
    }

}

/*-------------------------------after-----------------------------------*/
class IntRangeNew {

    private int low, high;

    public IntRangeNew(int low, int high) {
        initialize(low, high);
    }

    boolean includes(int arg) {
        return arg >= getLow() && arg <= getHigh();
    }

    void grow(int factor) {
        this.high = this.high * factor;
    }

    private void initialize(int low, int high) {
        this.low = low;
        this.high = high;
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
}
