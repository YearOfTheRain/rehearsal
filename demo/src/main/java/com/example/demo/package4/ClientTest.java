package com.example.demo.package4;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 客户端
 * @date 2019-09-07 11:15
 */
public class ClientTest {

    private static int count = 0;

    public static void recursion() {
        count++;
        recursion();
    }

    /*public static void main(String[] args) {
        System.out.println("2423423");
    }*/

    public static void main(String[] args) {
        try {
            recursion();
        } catch (Throwable e) {
            System.out.println("deep of calling =" + count);
            e.printStackTrace();
        }

    }

}
