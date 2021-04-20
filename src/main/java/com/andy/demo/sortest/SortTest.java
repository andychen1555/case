package com.andy.demo.sortest;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.json.JSONUtil;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author andy
 * @version SortTest.java, v0.1 2021/1/4 18:13
 * @Description
 */
public class SortTest {
    public static void main(String[] args) {
        Demo a = new Demo("A", "1.0");
        Demo b = new Demo("B", "2.0");
        Demo c = new Demo("C", "11.0");
        List<Demo> list = CollUtil.newArrayList();
        list.add(b);
        list.add(a);
        list.add(c);
        List<Demo> demos = list.stream()
                .sorted(
                        Comparator.comparing(
                                Demo::getVersion, (e1, e2) -> {
                                    int s1 = Double.valueOf(e1).intValue();
                                    int s2 = Double.valueOf(e2).intValue();
                                    return s2-s1;
                                })).collect(Collectors.toList());

        System.out.println(JSONUtil.toJsonStr(demos));
    }
}
