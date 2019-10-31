package com.rehearsal.designpatterns.PrototypeTest;

import com.rehearsal.designpatterns.Prototype.ConcretePrototype;
import com.rehearsal.designpatterns.Prototype.Prototype;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ClientTest
 * @date 2019-08-20 16:10
 */
public class ClientTest {

    public static void main(String[] args) {
        Prototype pro = new ConcretePrototype("ss5s54h");
        Prototype pro2 = (Prototype)pro.clone();
        System.out.println(pro.getName());
        System.out.println(pro2.getName());
    }
}
