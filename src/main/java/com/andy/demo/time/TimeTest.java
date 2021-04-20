package com.andy.demo.time;

import cn.hutool.core.date.DateUtil;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * @author andy
 * @version TimeTest.java, v0.1 2021/2/23 13:44
 * @Description
 */
public class TimeTest {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String date = DateUtil.format(DateUtil.date(), sdf);
        System.out.println(date);

    }



}
