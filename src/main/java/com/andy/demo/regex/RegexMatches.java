package com.andy.demo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: weipeng
 * @create: 2020-07-23 20:59
 * @description:
 */
public class RegexMatches {
    public static void main(String args[]) {

        // 按指定模式在字符串查找
//        String line = "This order was placed for QT3000! OK?";
//        String line = "https://detail.1688.com/offer/619742493019.html?spm=a312h.2018_new_sem.dh_002.15.57f75b4aBVRxMo&tracelog=p4p&click";
        String line = "https://blog.csdn.net/easonjake/article/details/102556221?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-2.channel_param&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-2.channel_param";//        String pattern = "(\\D*)(\\d+)(.*)";
        String pattern = "(?<=detail.1688.com/offer/).*(?=.html)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
//            System.out.println("Found value: " + m.group(1));
//            System.out.println("Found value: " + m.group(2));
//            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }
    }
}
