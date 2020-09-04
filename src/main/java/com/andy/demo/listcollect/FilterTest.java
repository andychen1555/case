package com.andy.demo.listcollect;

import cn.hutool.core.collection.CollUtil;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author: weipeng
 * @create: 2020-04-29 15:51
 * @description:
 */
public class FilterTest {
    public static void main(String[] args) {
//        List<String> strs =CollUtil.newArrayList();
//        strs.add("");
//        strs.add("0");
//        strs.add("1");
//
        Set<String> sets = new HashSet<>();
        sets.add("1");
        sets.add("3");

        Set<String> sets1 = new HashSet<>();
        sets1.add("1");
        sets1.add("3");
        sets1.add("5");
//        strs = strs.stream().filter(i -> !sets.contains(i)).collect(Collectors.toList());
//        System.out.println(strs);
        sets1.removeAll(sets);
        System.out.println(sets1);
//        System.out.println(StrUtil.concat(true,"111",null,"222","","333"));


//        List<String> strs = CollUtil.newArrayList();
//        strs.add("");
//        strs.add("0");
//        strs.add("1");
//        List<String> filterStrs = strs.stream().filter(i -> i.equals("0")).collect(Collectors.toList());
//        System.out.println(strs);
//        System.out.println(filterStrs);
    }
}
