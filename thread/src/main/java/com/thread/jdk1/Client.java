package com.thread.jdk1;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 客户端
 * @date 2019-10-11 16:49
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("main Thread: " + Thread.currentThread().getId());
        Runnable first = new TheFirst("first");
        new Thread(first).start();

        Runnable second = new TheSecond("second");
        new Thread(second).start();
        System.out.println("main end");
    }
}

class TheFirst implements Runnable {

    private String name;

    public TheFirst(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("TheFirst -- before");
        try {
            System.out.println("TheFirst Thread: " + Thread.currentThread().getId());
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("TheFirst -- end");
    }
}
class TheSecond implements Runnable {

    private String name;

    public TheSecond(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("TheSecond -- before");
        try {
            System.out.println("TheSecond Thread: " + Thread.currentThread().getId());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("TheSecond -- end");
    }
}
