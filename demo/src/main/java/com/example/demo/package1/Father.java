package com.example.demo.package1;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description father
 * @date 2019-09-10 17:06
 */
public class Father implements IFather {

    @Override
    public void A() {
        System.out.println("a");
    }

    @Override
    public void B() {
        System.out.println("b");
    }

    public void C() {
        System.out.println("c");
    }
}
