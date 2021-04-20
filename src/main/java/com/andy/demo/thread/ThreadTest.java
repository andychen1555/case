package com.andy.demo.thread;

import cn.hutool.core.thread.ThreadFactoryBuilder;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author: weipeng
 * @create: 2020-09-03 9:50
 * @description:
 */
public class ThreadTest {
    private static ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNamePrefix("thread-call-runner-").build();
    private static ExecutorService executor = new ThreadPoolExecutor(10, 20, 200L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(), namedThreadFactory);

    public static void main(String[] args) {
//        List<Integer> list = CollUtil.newArrayList();
//        Random r = new Random();
//        for (int i = 0; i < 100000; i++) {
//            list.add(r.nextInt(1000));
//        }
//        List<List<Integer>> lists = ListsUtil.subList(list, 10000);
//        lists.forEach(i -> {
//            executor.submit(() -> {
//                System.out.println(Thread.currentThread().getName() + " : " + i);
//            });
//        });
        List<Integer> list = IntStream.rangeClosed(1, 28).boxed().collect(Collectors.toList());
        List<Integer> list0 = ListsUtil.subList(list, 0, 10);
        List<Integer> list1 = ListsUtil.subList(list, 1, 10);
        List<Integer> list2 = ListsUtil.subList(list, 2, 10);
        List<Integer> list3 = ListsUtil.subList(list, 3, 10);
        System.out.println(list0);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
//        System.out.println(list);
    }
}
