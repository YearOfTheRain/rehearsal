package com.thread.jdk7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 客户端方法
 * @date 2019-10-11 17:36
 */
public class Client extends RecursiveTask<Integer> {

    private static final int THRESHOLD = 5;

    private int beginning;
    private int ending;

    public Client(int beginning, int ending) {
        super();
        this.beginning = beginning;
        this.ending = ending;
    }

    @Override
    protected Integer compute() {
        int sum = 0;
        boolean canCompute = (ending - beginning) <= THRESHOLD;

        if (canCompute) {
            System.out.println("no need fork " + Thread.currentThread().getId());
            System.out.println("beginning: " + beginning + ". ending: " + ending);
            for (int i = beginning; i <= ending; i++) {
                sum += i;
            }
            return sum;
        }else {
            int interim = (beginning + ending) / 2;
            System.out.println("need fork " + Thread.currentThread().getId());
            System.out.println("need interim " + interim);

            Client left = new Client(beginning, interim);
            Client right = new Client(interim + 1, ending);
            left.fork();
            right.fork();

            return left.join() + right.join();
        }
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        Client client = new Client(1, 100);
        ForkJoinTask<Integer> result = forkJoinPool.submit(client);
        try {
            System.out.println("main result " + result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
