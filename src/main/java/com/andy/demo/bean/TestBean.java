package com.andy.demo.bean;

import cn.hutool.core.collection.CollUtil;

import java.util.ArrayList;

/**
 * @author andy
 * @version TestBean.java, v0.1 2021/1/14 13:57
 * @Description
 */
public class TestBean {
    public static void main(String[] args) throws IllegalAccessException {
        Apple apple = new Apple();
        apple.setName("")
                .setMoney(null);
        ArrayList<Object> objects = CollUtil.newArrayList();
        System.out.println(BeanUtils.checkFieldHasValue(objects));
        BossxFundStandardParam param = new BossxFundStandardParam();
        System.out.println(BeanUtils.checkFieldHasValue(param));

        MyClass myClass = new MyClass();
        System.out.println(BeanUtils.checkFieldHasValue(myClass));
        System.out.println(CollUtil.isEmpty(objects));
    }
}
