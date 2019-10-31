package com.example.demo;

import java.util.Collections;

/**
 * @program: rehearsal
 * @description: test
 * @author: LiShuLin
 * @create: 2019-08-15 15:35
 **/
public class Test {

    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.i);
        System.out.println(son.f());
        System.out.println(Son.g());
        System.out.println(Father.g());


        /*String s1 = "o";
        String s2 = "hello";
        String s4 = "hell";
        String s3 = "hell" + s1;
        String s5 = s4 + "o";
        String s6 = new String("hello");
        String s7 = new String("hello");
        String s8= "hell" + "o";
        System.out.println(s2 == s3);
        System.out.println(s2 == s8);
5039493.8
7936317.6

4519701
26666315.4
        System.out.println(s5 == s3);
        System.out.println(s6 == s7);
        System.out.println(s2 == s5);*/

/*        for (int i = 0; i < 5; i++) {
            Runnable big2Small = new Big2Small();
            new Thread(big2Small).start();

            Runnable small2Big = new Small2Big();
            new Thread(small2Big).start();
        }*/

    }
    public static void add() {
        System.out.println("----------------外小内大耗时----------------");
        long stratTime = System.nanoTime();

        for (int i = 0; i <10000 ; i++) {
            for (int j = 0; j < 10000000; j++) {

            }
        }
        long endTime = System.nanoTime();
        System.out.println("外小内大耗时："+ (endTime - stratTime));

        stratTime = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            for (int j = 0; j < 10000; j++) {

            }
        }
        endTime = System.nanoTime();
        System.out.println("外大内小耗时："+(endTime - stratTime));
        System.out.println("--------------------------------");
    }
}

class Small2Big implements Runnable {

    @Override
    public void run() {

        long stratTime = System.nanoTime();

        for (int i = 0; i <100 ; i++) {
            for (int j = 0; j < 10000000; j++) {

            }
        }
        long endTime = System.nanoTime();
        System.out.println("外小内大耗时："+ (endTime - stratTime));
    }
}

class Big2Small implements Runnable {

    @Override
    public void run() {
        long stratTime = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            for (int j = 0; j < 100; j++) {

            }
        }
        long endTime = System.nanoTime();
        System.out.println("外大内小耗时："+(endTime - stratTime));
    }
}
