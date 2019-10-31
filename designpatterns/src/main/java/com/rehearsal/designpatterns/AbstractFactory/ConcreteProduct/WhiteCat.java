package com.rehearsal.designpatterns.AbstractFactory.ConcreteProduct;

import com.rehearsal.designpatterns.AbstractFactory.AbstractProduct.ICat;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description WhiteCat
 * @date 2019-08-20 14:35
 */
public class WhiteCat implements ICat {

    @Override
    public void eat() {
        System.out.println("The white cat is eating!");
    }
}
