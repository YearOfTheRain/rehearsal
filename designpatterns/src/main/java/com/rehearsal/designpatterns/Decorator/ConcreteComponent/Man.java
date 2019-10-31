package com.rehearsal.designpatterns.Decorator.ConcreteComponent;

import com.rehearsal.designpatterns.Decorator.Component.Person;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Man
 * @date 2019-08-21 10:19
 */
public class Man implements Person {
    @Override
    public void eat() {
        System.out.println("男人在吃");
    }
}
