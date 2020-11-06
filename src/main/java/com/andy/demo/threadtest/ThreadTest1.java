package com.andy.demo.threadtest;

import cn.hutool.core.date.DateUtil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * @author: weipeng
 * @create: 2020-09-09 14:04
 * @description:
 */
public class ThreadTest1 {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println(ThreadTest1.threadTest());
        System.out.println(DateUtil.lastMonth());
    }

    private static int threadTest() throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger();
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        IntStream.rangeClosed(1,20).parallel().forEach(
                i->{
                    executorService.execute(()->increment(atomicInteger));
                }
        );
        //提交关闭线程池申请，等待之前所有任务执行完成
         executorService.shutdown();
         executorService.awaitTermination(1, TimeUnit.HOURS);
        return atomicInteger.get();
    }

    private static void increment(AtomicInteger atomicInteger) {
        atomicInteger.incrementAndGet();
        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
