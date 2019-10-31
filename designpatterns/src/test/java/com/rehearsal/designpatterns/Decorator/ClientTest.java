package com.rehearsal.designpatterns.Decorator;

import com.rehearsal.designpatterns.Decorator.ConcreteComponent.Man;
import com.rehearsal.designpatterns.Decorator.ConcreteDecorator.ManDecoratorA;
import com.rehearsal.designpatterns.Decorator.ConcreteDecorator.ManDecoratorB;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ClientTest
 * @date 2019-08-21 10:27
 */
public class ClientTest {

    public static void main(String[] args) {
        Man man = new Man();
        ManDecoratorA md1 = new ManDecoratorA();
        ManDecoratorA md3 = new ManDecoratorA();
        ManDecoratorB md2 = new ManDecoratorB();

        md1.setPerson(man);
        md2.setPerson(md1);
        md2.eat();
        md3.setPerson(md2);
        md3.eat();
    }
}
