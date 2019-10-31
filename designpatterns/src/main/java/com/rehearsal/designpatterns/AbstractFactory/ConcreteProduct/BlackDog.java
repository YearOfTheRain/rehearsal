package com.rehearsal.designpatterns.AbstractFactory.ConcreteProduct;

import com.rehearsal.designpatterns.AbstractFactory.AbstractProduct.IDog;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description BlackDog
 * @date 2019-08-20 14:36
 */
public class BlackDog implements IDog {

    @Override
    public void eat() {
        System.out.println("The black dog is eating");
    }
}
