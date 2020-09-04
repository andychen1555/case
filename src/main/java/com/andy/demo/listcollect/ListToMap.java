package com.andy.demo.listcollect;

import lombok.Data;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

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
        User u2 = new User();
        u2.setName("tom");
        u2.setAge(15);
        ArrayList<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        Map<Integer, User> map = list.stream().collect(Collectors.toMap(User::getAge, Function.identity()));

//        Map<Integer, User> map = list.stream().collect(Collectors.toMap(User::getAge, user -> user));
        System.out.println(map);
    }

    @Data
    public static class User {
        private String name;
        private Integer age;
    }
}
