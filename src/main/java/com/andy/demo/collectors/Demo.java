package com.andy.demo.collectors;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.lang.UUID;

import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author andy
 * @version Demo.java, v0.1 2020/12/22 20:20
 * @Description
 */
public class Demo {
    public static void main(String[] args) {
        Set<String> sets = CollUtil.newHashSet();
//        ExecutorService service = Executors.newFixedThreadPool(10);
//        for (int f = 0; f < 10; f++) {
//            service.execute(() -> {
                for (int i = 0; i < 100; i++) {
                    UUID uuid = UUID.randomUUID();
                    String id = String.valueOf(uuid.getMostSignificantBits());
                    String substring = id.substring(id.length() - 4);
                    Random random = new Random();
                    int t = random.nextInt(99999999 - 10000000) + 10000000;
                    sets.add(substring+t);
                    System.out.println(substring+t);
                }
//            });
//        }
//        service.shutdown();
//        while (!service.isTerminated()) {
//
//        }
        System.out.println(sets.size());
    }
}
