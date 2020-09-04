package com.andy.demo.thread;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.thread.ThreadFactoryBuilder;

import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @author: weipeng
 * @create: 2020-09-03 9:50
 * @description:
 */
public class ThreadTest {
    private static ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNamePrefix("thread-call-runner-").build();
    private static ExecutorService executor = new ThreadPoolExecutor(10, 20, 200L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(), namedThreadFactory);

    public static void main(String[] args) {
        List<Integer> list = CollUtil.newArrayList();
        Random r = new Random();
        for (int i = 0; i < 100000; i++) {
            list.add(r.nextInt(1000));
        }
        List<List<Integer>> lists = ListsUtil.subList(list, 10000);
        lists.forEach(i -> {
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            });
        });
    }
}
