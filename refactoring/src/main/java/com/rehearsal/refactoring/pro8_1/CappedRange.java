package com.rehearsal.refactoring.pro8_1;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description subclass
 * @date 2019-08-17 15:59
 **/
public class CappedRange extends IntRangeNew {

    private int cap;

    public CappedRange(int low, int high, int cap) {
        super(low, high);
        this.cap = cap;
    }

    public int getCap() {
        return cap;
    }

    @Override
    public int getHigh() {
        return Math.min(super.getHigh(), getCap());
    }
}
