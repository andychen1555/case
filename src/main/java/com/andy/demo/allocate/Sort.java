package com.andy.demo.allocate;

import cn.hutool.core.collection.CollUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: weipeng
 * @create: 2020-07-20 11:59
 * @description:
 */
public class Sort {

        //降序
        public static void SortDesc(List<Integer> list) {
            for (int i = 0; i < list.size() - 1; i++) {
                int maxindex = i;
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(maxindex) < list.get(j)) {
                        maxindex = j;
                    }
                }
                int t = list.get(i);
                list.set(i, list.get(maxindex));
                list.set(maxindex, t);
            }

        }


    public static void main(String[] args) {
//       List<Integer> integers = CollUtil.newArrayList(1, 0, 4, 5, 3);
//        Sort.SortDesc(integers);
//        System.out.println(integers);
//


        Map<Integer, Integer> map = CollUtil.newHashMap();
        map.put(1,101);
        map.put(2,159);
        map.put(3,689);
        List<Integer> collect = new ArrayList<>(map.keySet());
        Integer i = collect.stream().max(Integer::compare).get();
        System.out.println(i);
    }
}
