package com.example.demo.package1;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description client
 * @date 2019-09-10 17:08
 */
public class Client {

    public static void main(String[] args) {
        IFather father = new Father();
        ((Father) father).C();
    }
}
