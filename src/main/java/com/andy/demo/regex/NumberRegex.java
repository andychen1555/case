package com.andy.demo.regex;

import cn.hutool.core.util.ReUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @author: weipeng
 * @create: 2020-04-15 12:00
 * @description:
 */
public class NumberRegex {
    public static void main(String[] args) {
        getBigdecimalString();
//        getIntByString();
    }

    private static void getIntByString(){
        Integer integer = Integer.valueOf("0");
        System.out.println(integer);
    }

    private static void getBigdecimalString(){
       String s = "0";
        System.out.println(new BigDecimal(s));
    }


    private void numberRegex(){
        Pattern p = compile("\\d+");
        String s = "  t180tab192";
        String result = ReUtil.get(p, s, 0);
        System.out.println(result);
    }

    public static void getSplitResult(){
        List<String> list = new ArrayList<>();
        String str = "\n\t\t\t\t\t\t\t$:59.99";
         str = str.trim();
        String[] split = str.split(":");
        for (String result:split){
            list.add(result);
        }
        System.out.println(list.toString());
    }
}
