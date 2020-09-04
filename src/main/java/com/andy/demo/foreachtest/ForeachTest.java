package com.andy.demo.foreachtest;

import cn.hutool.core.collection.CollUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author: weipeng
 * @create: 2020-05-18 10:22
 * @description:
 */
@Slf4j
public class ForeachTest {
    public static void main(String[] args) {
        List<Integer> list = CollUtil.newArrayList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
        list.forEach(i->{
            System.out.println(111);
        });

//        list.forEach(i -> {
//            if (list.indexOf(i) == 1) {
//                list.set(i,11);
//            }
//        });
//
//        System.out.println(list);

//        List<Integer> l = null;
//        for (int i:l){
//            System.out.println(i);
//        }

//        System.out.println(list.contains(3));
    }
}
