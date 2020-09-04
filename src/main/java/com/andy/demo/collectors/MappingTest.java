package com.andy.demo.collectors;

import cn.hutool.core.collection.CollUtil;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: weipeng
 * @create: 2020-08-14 14:42
 * @description:
 */
public class MappingTest {

    public static void main(String[] args) {
        Apple a1 = new Apple();
        a1.setP1(1);
        a1.setP2(1);
        Apple a2 = new Apple();
        a2.setP1(1);
        a2.setP2(2);
        Apple a3 = new Apple();
        a3.setP1(2);
        a3.setP2(1);
        Apple a4 = new Apple();
        a4.setP1(2);
        a4.setP2(1);
        Apple a5 = new Apple();
        a5.setP1(2);
        a5.setP2(2);
        List<Apple> list = CollUtil.newArrayList();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        System.out.println(list.toString());
//        increTriggerLogs.stream()
//                .collect(Collectors.groupingBy(PyTriggerLog::getOp_type, Collectors.mapping(PyTriggerLog::getNid, Collectors.toList())));
        Map<Integer, List<Integer>> map = list.stream()
                .collect(Collectors.groupingBy(Apple::getP1, Collectors.mapping(Apple::getP2, Collectors.toList())));
        Map<Integer, List<Integer>> map1 = list.stream()
                .collect(Collectors.groupingBy(Apple::getP1, Collectors.mapping(Apple::getP2, Collectors.collectingAndThen(Collectors.toList(), v -> v.stream().distinct().collect(Collectors.toList())))));
        System.out.println(map);
        System.out.println(map1);
    }



    @Data
    public static class Apple {
        private Integer p1;
        private Integer p2;
    }
}
