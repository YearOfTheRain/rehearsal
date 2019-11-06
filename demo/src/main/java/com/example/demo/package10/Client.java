package com.example.demo.package10;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description extend 和 super 测试
 * @date 2019-11-04 11:50
 */
public class Client {

    /*public static void main(String[] args) {
        List<Father> fatherList = new ArrayList<>();
        List<Son> sonList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();
        List<? extends Father> fathers1 = fatherList;
        //List<? extends Father> fathers2 = objectList;
        List<? extends Father> fathers3 = sonList;
    }*/

    /*public static void main(String[] args) {
        List<Father> fatherList = new ArrayList<>();
        List<Son> sonList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();
        List<? super Father> fathers1 = fatherList;
        List<? super Father> fathers2 = objectList;
        //List<? super Father> fathers3 = sonList;
    }*/

    public static void main(String[] args) {
        System.out.println(6>>1);
    }

}
