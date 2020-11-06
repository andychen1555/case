package com.andy.demo.regex;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.RandomUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author: weipeng
 * @create: 2020-10-19 14:36
 * @description:
 */
public class StrConvert {
    public static void main(String[] args) {
        List<Integer> lists = CollUtil.newArrayList();
        for (int i=0;i<3000;i++){
            lists.add(RandomUtil.randomInt(1,100000));
        }
        System.out.println(lists);
    }
}
