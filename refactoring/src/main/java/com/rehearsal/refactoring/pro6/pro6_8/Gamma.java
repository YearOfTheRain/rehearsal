package com.rehearsal.refactoring.pro6.pro6_8;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description s
 * @date 2019-08-19 14:53
 */
public class Gamma {
    private final Account _account;
    private int inputVal;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;

    public Gamma(Account source, int inputVal, int quantity, int yearToDate) {
        this._account = source;
        this.inputVal = inputVal;
        this.quantity = quantity;
        this.yearToDate = yearToDate;
    }

    int compute() {
        int importantValue1 = (inputVal * quantity) + _account.delta();
        int importantValue2 = (inputVal * yearToDate) + 100;
        importantThing();
        int importantValue3 = importantValue2 * 7;
        // and so on.
        return importantValue3 - 2 * importantValue1;
    }

    private void importantThing() {
        if ((yearToDate - importantValue1) > 100) {
            importantValue2 -= 20;
        }
    }
}
