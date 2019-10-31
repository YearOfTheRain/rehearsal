package com.thread.jdk5;

import org.springframework.scheduling.concurrent.CustomizableThreadFactory;

import java.util.concurrent.*;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 客户端
 * @date 2019-10-11 17:03
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("main Thread start: " + Thread.currentThread().getId());
        ThreadFactory namedThreadFactory = new CustomizableThreadFactory("jdk5-thread-%d");

        ExecutorService executorService = new ThreadPoolExecutor(20, 200,
                300, TimeUnit.MILLISECONDS,
                new SynchronousQueue<Runnable>(),namedThreadFactory);

        Callable<String> first = new TheFirstTask();
        Callable<Integer> second = new TheSecondTask();

        Future<String> firstSubmit = executorService.submit(first);
        Future<Integer> secontSubmit = executorService.submit(second);
        executorService.shutdown();
        System.out.println("executorService shutdown Thread: " + Thread.currentThread().getId());

        try {
            String result = firstSubmit.get();
            System.out.println("firstSubmit Thread: " + Thread.currentThread().getId());
            System.out.println("value " + result);

            Integer integer = secontSubmit.get();
            System.out.println("secontSubmit Thread: " + Thread.currentThread().getId());
            System.out.println("value " + integer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}

class TheFirstTask implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("TheFirstTask Thread start: " + Thread.currentThread().getId());
        Thread.sleep(3000);
        System.out.println("TheFirstTask Thread end: " + Thread.currentThread().getId());
        return "TheFirstTask";
    }
}

class TheSecondTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("TheSecondTask Thread start: " + Thread.currentThread().getId());
        Thread.sleep(8000);
        System.out.println("TheSecondTask Thread end: " + Thread.currentThread().getId());
        return 9;
    }
}
