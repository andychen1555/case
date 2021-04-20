package com.andy.demo.statictest;

import lombok.Data;

/**
 * @author andy
 * @version OutClass.java, v0.1 2021/1/2 17:46
 * @Description
 */
@Data
public class OutClass {

    private String name;

    private InnerClass innerClass;

    @Data
    public static class InnerClass {

        private String name;

        private SubClass subClass;

        @Data
        public static class SubClass {
            private String name;
        }

    }

}
