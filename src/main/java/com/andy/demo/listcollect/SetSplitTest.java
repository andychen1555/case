package com.andy.demo.listcollect;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: weipeng
 * @create: 2020-04-28 10:02
 * @description:
 */
public class SetSplitTest {
    public static void main(String[] args) {
        String t1="111021,11545";
        String t2="111021,119659";
        String t3="642334";
        List<String> strings = CollUtil.newArrayList();
        strings.add(t1);
        strings.add(t2);
        strings.add(t3);
        Set<String> sets = CollUtil.newHashSet();
        strings.stream().forEach(
                i-> sets.addAll(CollUtil.toList(StrUtil.split(i,",")))
        );
        System.out.println(sets);
    }
}
