package com.example.demo.package6;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 抽象类的构造函数测试
 * @date 2019-10-15 15:52
 */
public class Client {

    public static void main(String[] args) {
        Son son = new Son(12);
        System.out.println(son.getNum());
        AbstractFather father = new AbstractFather(45) {
        };
    }
}
