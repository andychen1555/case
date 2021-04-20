package com.andy.demo.bean;

/**
 * @author andy
 * @version HashTest.java, v0.1 2021/1/20 15:20
 * @Description
 */
public class HashTest {
    public static void main(String[] args) {
        Apple a1 = new Apple();
        a1.setMoney(11L)
                .setName("apple");
        Apple a2 = new Apple();
        a2.setMoney(11L)
                .setName("apple");

        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
    }
}
