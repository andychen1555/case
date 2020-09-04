package com.andy.demo.listcollect;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: weipeng
 * @create: 2020-05-07 16:46
 * @description:
 */
public class OptionalTest {
    public static void main(String[] args) {
//        List<String> groupIdsList = null;
//        Set<Long> groupIdsSet = new TreeSet<>();
//
//        groupIdsList.forEach(i -> groupIdsSet.addAll(Arrays.stream(i.split(","))
//                .map(s -> Long.parseLong(StrUtil.isBlank(s) ? "0" : s.trim())).collect(Collectors.toList())));
        String s="123456789";
        System.out.println(s.substring(0,s.length()-2));

        ArrayList<TSmtProductGroups> groups = CollUtil.newArrayList();

        Map<String, String> groupsMap = groups.stream().collect(
                Collectors.toMap(TSmtProductGroups::getGroupId, TSmtProductGroups::getGroupName, (x1, x2) -> x1));
        System.out.println("xxxxxx=====>"+JSONUtil.toJsonStr(groupsMap));
    }

}
