package com.example.demo.package5;

import com.example.demo.package6.AbstractFather;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 客户端
 * @date 2019-09-09 10:48
 */
public class Client {

    /*public static void main(String[] args) {
        System.out.println(toSun(1));
        System.out.println(Math.pow(2, 3));
    }

    private static int toSun(int num) {
        if (num == 0) {
            return 1;
        }
        int sum = 0;
        for (int i = num; i >= 0; i--) {
            sum += Math.pow(2, num);
        }
        return sum;
    }*/

    public static void main(String[] args) {
        String s1 = "我是谁";
        System.out.println(s1.hashCode());

        System.out.println("gdejicbegh".hashCode());
        System.out.println("hgebcijedg".hashCode());

        System.out.println("0123456789".hashCode());
        System.out.println("9876543210".hashCode());
    }
}
