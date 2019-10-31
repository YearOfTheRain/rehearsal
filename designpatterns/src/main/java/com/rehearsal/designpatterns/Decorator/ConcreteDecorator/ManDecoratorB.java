package com.rehearsal.designpatterns.Decorator.ConcreteDecorator;

import com.rehearsal.designpatterns.Decorator.Decorator.Decorator;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ManDecoratorB
 * @date 2019-08-21 10:25
 */
public class ManDecoratorB extends Decorator {

    @Override
    public void eat() {
        super.eat();
        System.out.println("===============");
        System.out.println("ManDecoratorB类");
    }
}
