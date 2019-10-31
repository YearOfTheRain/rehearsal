package com.rehearsal.designpatterns.AbstractFactory.ConcreteProduct;

import com.rehearsal.designpatterns.AbstractFactory.AbstractProduct.IDog;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description WhiteDog
 * @date 2019-08-20 14:37
 */
public class WhiteDog implements IDog {

    @Override
    public void eat() {
        System.out.println("The white dog is eating!");
    }
}
