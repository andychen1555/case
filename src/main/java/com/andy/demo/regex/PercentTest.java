package com.andy.demo.regex;

import cn.hutool.core.util.ReUtil;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @author: weipeng
 * @create: 2020-04-15 21:15
 * @description:
 */
public class PercentTest {
    public static void main(String[] args) {
        Pattern p = compile("^([0-9.]+)[ ]*%$");

        String s = "ren";

        if (ReUtil.isMatch(p,s)) {

            System.out.println(s);
        } else {
            System.out.println("xxxxxxxxxxxxxxx");
        }
    }
}
