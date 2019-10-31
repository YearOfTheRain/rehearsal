package com.rehearsal.designpatterns.Decorator.ConcreteDecorator;

import com.rehearsal.designpatterns.Decorator.Decorator.Decorator;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ManDecoratorA
 * @date 2019-08-21 10:22
 */
public class ManDecoratorA extends Decorator {

    @Override
    public void eat() {
        super.eat();
        reEat();
        System.out.println("ManDecoratorA class");
    }


    public void reEat() {
        System.out.println("再吃一顿饭");
    }
}
