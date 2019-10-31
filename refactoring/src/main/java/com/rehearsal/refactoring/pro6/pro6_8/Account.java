package com.rehearsal.refactoring.pro6.pro6_8;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Replace Method with Method Object（以函数对象取代函数）
 * @date 2019-08-19 14:42
 */
public class Account {

    int gamma(int inputVal, int quantity, int yearToDate) {
        return new Gamma(this, inputVal, quantity, yearToDate).compute();
    }

    int delta() {
        return 333;
    }
}
