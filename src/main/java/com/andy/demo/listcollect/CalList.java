package com.andy.demo.listcollect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: weipeng
 * @create: 2020-04-01 10:43
 * @description:
 */
public class CalList {
    public static void main(String[] args) {

        User u1 = new User("ming", 10);
        User u2 = new User("ling", 18);
        User u3 = new User("xu", 13);
        User u4 = new User("du", 14);
        User u5 = new User("", 0);


        List<User> oldUsers = new ArrayList<>();
        oldUsers.add(u1);
        oldUsers.add(u2);
        oldUsers.add(u3);
        oldUsers.add(u4);
        List<User> newUsers = new ArrayList<>();
        newUsers.add(u1);
        newUsers.add(u2);
        newUsers.add(u3);
        newUsers.add(u5);

//        List<Integer> deleteSkuIds = oldSkuIds.stream().filter(item -> !newSkuIds.contains(item)).collect(Collectors.toList());

        Map<String, List<User>> newSkusMap = newUsers.stream().collect(Collectors.groupingBy(User::getName));
        List<User> deleteUsers = oldUsers.stream().filter(item -> !newSkusMap.containsKey(item.name)).collect(Collectors.toList());
        System.out.println(deleteUsers);
        System.out.println(oldUsers);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class User {
        private String name;
        private int age;
    }

}
