package com.andy.demo.thread;

import cn.hutool.core.collection.CollUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: andychen
 * @date: 2020-07-19 15:52
 * @description:
 **/
public class ListsUtil {

    /**
     * 将一个list均分成n个list,主要通过偏移量来实现的
     *
     * @param list
     * @param step 切分步长
     * @param <T>
     * @return
     */
    public static <T> List<List<T>> subList(List<T> list, int step) {
        if (CollUtil.isEmpty(list)) {
            return CollUtil.newArrayList();
        }
        List<List<T>> result = new ArrayList<>();
        int listSize = list.size();
        for (int i = 0; i < list.size(); i += step) {
            if (i + step > listSize) {
                step = listSize - i;
            }
            List newList = list.subList(i, i + step);
            result.add(newList);
        }
        return result;
    }

    /**
     * 将一个list均分成n个list,主要通过偏移量来实现的. 默认切分步长: 2000
     *
     * @param list
     * @param <T>
     * @return
     */
    public static <T> List<List<T>> subList(List<T> list) {
        return ListsUtil.subList(list, 2000);
    }
}
