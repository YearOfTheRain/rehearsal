package com.rehearsal.designpatterns.Flyweight;

import com.rehearsal.designpatterns.Flyweight.Flyweight.Flyweight;
import com.rehearsal.designpatterns.Flyweight.FlyweightFactory.FlyweightFactory;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ClientTest
 * @date 2019-08-21 11:20
 */
public class ClientTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Flyweight fly1 = FlyweightFactory.getFlyweight("a");
        fly1.action(1);

        Flyweight fly2 = FlyweightFactory.getFlyweight("a");
        fly2.action(23);
        System.out.println(fly1 == fly2);

        Flyweight fly3 = FlyweightFactory.getFlyweight("b");
        fly3.action(2);

        Flyweight fly4 = FlyweightFactory.getFlyweight("c");
        fly4.action(3);

        Flyweight fly5 = FlyweightFactory.getFlyweight("d");
        fly4.action(4);

        System.out.println(FlyweightFactory.getSize());
    }

}
