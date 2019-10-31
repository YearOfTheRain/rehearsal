package com.rehearsal.designpatterns.Flyweight.ConcreteFlyweight;

import com.rehearsal.designpatterns.Flyweight.Flyweight.Flyweight;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description FlyweightImpl
 * @date 2019-08-21 10:52
 */
public class FlyweightImpl implements Flyweight {
    @Override
    public void action(int arg) {
        System.out.println("参数值: " + arg);
    }
}
