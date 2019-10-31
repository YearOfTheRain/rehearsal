package com.example.demo.package2;

import com.example.demo.package1.Test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @program rehearsal
 * @description test
 * @author LiShuLin
 * @create 2019-08-16 11:39
 **/
public class Test2 extends Test1 {

    /**
     * @title
     * @description
     * @param named
     * @return
     * @author LiShuLin
     * @date 2019/8/16
     */
    public  Test2(String named) {
        super(named);
    }

    /**
     * @title
     * @description
     * @param
     * @return java.lang.String
     * @author LiShuLin
     * @date 2019/8/16
     */
    @Override
    public String getName() {
        return "B: " + name;
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2("13123");
        System.out.println(test2.getName());

    }
}
