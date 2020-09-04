package com.andy.demo.keywordstest;

/**
 * @author: weipeng
 * @create: 2020-04-14 17:54
 * @description:
 */
public class ReturnTest {

    public static void main(String[] args) {
        System.out.println("1111");
        test();
        System.out.println("333");
    }

    private static void test() {
        System.out.println("22222");
        return;
    }
}
