package com.andy.demo.listcollect;

import cn.hutool.core.util.StrUtil;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author: weipeng
 * @create: 2020-05-20 11:12
 * @description:
 */
public class SetTest {
    public static void main(String[] args) {
        String url = "/login/login";
        Set<String> set = new HashSet<>();
        set.add("/swagger-resources/configuration/ui");
        set.add("/swagger-ui.html");
        set.add("/swagger-resources");
        set.add("/v2/api-docs");
        set.add("/swagger-resources/configuration/security");
        set.add("/login/login");

//        if (set.contains(url)) {
////            return false;
//            System.out.println("1111111111");
//        }

//        for (Iterator<String> iterator = set.iterator(); iterator.hasNext(); ) {
////            System.out.println(iterator.hasNext());
//            if (url.indexOf(iterator.next()) != -1) {
//                System.out.println(url);
//                System.out.println(111);
//            }
//        }

        String s ="ewei*1";
        String[] split = StrUtil.split(s, "*");
        System.out.println(split[0]);
//        System.out.println(s.substring(0, s.indexOf("*")));
    }
}
