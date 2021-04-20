package com.andy.demo.listcollect;

import cn.hutool.core.collection.CollUtil;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: weipeng
 * @create: 2020-04-22 16:13
 * @description:
 */
public class ListToMap {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setName("amy");
        u1.setAge(11);
        u1.setPhones(CollUtil.newArrayList("iphone12", "iphone12Pro"));
        User u2 = new User();
        u2.setName("tom");
        u2.setAge(15);
        u2.setPhones(CollUtil.newArrayList("iphone7", "iphone7Pro"));
        ArrayList<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
//        Map<Integer, User> map = list.stream().collect(Collectors.toMap(User::getAge, Function.identity()));

//        Map<Integer, User> map = list.stream().collect(Collectors.toMap(User::getAge, user -> user));
        List<String> pageContents = list.stream().map(User::getPhones).collect(ArrayList::new, ArrayList::addAll, ArrayList::addAll);
        System.out.println(pageContents);


        String ssss = buildPreConditon("xxx", "111","ttt","222");
        System.out.println(ssss);

    }

    @Data
    public static class User {
        private String name;
        private Integer age;
        private List<String> phones;
    }


    public static String buildPreConditon(String... params) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= params.length - 1; i++) {
            sb.append(params[i]);
            if (i % 2 == 1 && i != params.length - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }
}
