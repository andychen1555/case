package com.andy.demo.threadtest;

import lombok.Data;

/**
 * @author: weipeng
 * @create: 2020-04-01 11:19
 * @description:
 */
public class ThreadTest {
    public static void main(String[] args) {
//        Student t = new Student();
//        t.start();
//        System.out.println(t.getName() + "子线程===>" + t.getValue());
//        System.out.println(Thread.currentThread().getName() + " is over!!");
    }

    @Data
    public static class Student extends Thread {
        private static String name;
        private int age = 1;

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                age++;
                try {
                    Thread.sleep(100L);
                    System.out.println(this.age);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
