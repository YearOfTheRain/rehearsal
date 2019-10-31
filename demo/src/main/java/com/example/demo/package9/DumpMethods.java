package com.example.demo.package9;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description DumpMethods
 * @date 2019-10-22 16:53
 */
public class DumpMethods {

   /* public static void main(String[] args) {

        for(int i = 2; i < 64; i++) {
            //计算 8n^2 与 64nlogn 的 大小
//            System.out.println("i = " + i + ",result = " + max(i));
            //计算 100n^2 与 2^n 的 大小
            System.out.println("i = " + i + ",result = " + test2(i));
        }

    }*/

    private static Double log2n(double n) {
        return Math.log(n) / Math.log(2);
    }

    private static Double max(double n) {
        return  n  / (8 * log2n(n));
    }

    private static Double test2(double n) {
        return (100 * n * n) - Math.pow(2, n);
    }

    /*public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        System.out.println(integers.toString());
        int key, j;
        for(int i = 1; i < integers.size(); i++) {
            key = integers.get(i);
            j = i - 1;
            while (j >= 0 && ((integers.get(j) & 1) != 1)) {
                integers.set(j + 1, integers.get(j));
                j--;
            }
            integers.set(j + 1, key);
            *//*if(integers.get(i) == 2 || integers.get(i) == 4) {
                integers.add(integers.get(i));
                integers.set(i,null);
            }*//*
        }
        System.out.println(integers.toString());
       *//* List integers2 = new ArrayList<>();
        integers2.add(null);
        integers.removeAll(integers2);
        List<Integer> integers3 = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.addAll(integers3);
        System.out.println(integers.toString());*//*
    }*/

    public static void main(String[] args) {
        int i = 7;
        i++;
        System.out.println(i++);

    }
}
