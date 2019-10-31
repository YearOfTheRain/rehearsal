package com.example.demo;

/**
 * @program: rehearsal
 * @description: Son
 * @author: LiShuLin
 * @create: 2019-08-16 10:44
 **/
public class Son extends Father {
    /*public Son(int i) {
        super(i);
    }*/
    int i = 999;


    @Override
    int f() {
        i = super.i + 1;
        return super.f() + i;
    }

    static char g(){
        return 'B';
    }
}
