package com.andy.demo.regex;

import java.util.regex.Pattern;

/**
 * @author andy
 * @version HanziRegex.java, v0.1 2021/3/30 10:06
 * @Description
 */
public class HanziRegex {
    public static void main(String[] args) {
        String line = "111";
        /**
         * ^ 与字符串开始的地方匹配
         *
         * (?!_)　　不能以_开头
         *
         * (?!.*?_$)　　不能以_结尾
         *
         * [0-9_\u4e00-\u9fa5]+　　至少一个汉字、数字、下划线
         *
         * $　　与字符串结束的地方匹配
         */

        String pattern2 = "^(?!_)(?!.*?_$)[0-9_\u4e00-\u9fa5]+$";
        String pattern3 = "^(?!_)(?!.*?_$)[a-zA-Z0-9_\u4e00-\u9fa5]+$";
        System.out.println(Pattern.matches(pattern3, line));
    }
}
