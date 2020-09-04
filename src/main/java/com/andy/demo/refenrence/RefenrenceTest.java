package com.andy.demo.refenrence;

import cn.hutool.core.collection.CollUtil;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: weipeng
 * @create: 2020-04-24 19:44
 * @description:
 */
public class RefenrenceTest {
    public static void main(String[] args) {
        User u = new User();
        u.setName("tom");
        User u1 = new User();
        u1.setName("jack");
        List<User> userList = CollUtil.newArrayList();
        userList.add(u);
        userList.add(u1);
        setAge(18, userList);
        System.out.println(userList);
    }

    private static void setAge(Integer age, List<User> userList) {
        userList.forEach(
                u->u.setAge(age)
        );
    }

    @Data
    @NoArgsConstructor
    public static class User {
        String name;
        int age;
    }
}
