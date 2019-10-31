package com.rehearsal.refactoring.pro7.pro7_1;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Move Method（搬移函数）
 * @date 2019-08-19 15:29
 */
public class Account {

    public static void main(String[] args) {
         double d = 0.3;
        System.out.println(d); // 精心挑选的，避免显示难看的表示
        double d2 = 0.2;
// 应该是-0.1，但打印出来的是-0.09999999999999998
        System.out.println(  d2 - d);
    }
}
