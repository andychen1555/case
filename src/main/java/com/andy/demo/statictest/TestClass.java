package com.andy.demo.statictest;

import cn.hutool.json.JSONUtil;

/**
 * @author andy
 * @version TestClass.java, v0.1 2021/1/2 17:49
 * @Description
 */
public class TestClass {
    public static void main(String[] args) {
        OutClass.InnerClass.SubClass subClass = new OutClass.InnerClass.SubClass();
        subClass.setName("subClass");
        OutClass.InnerClass innerClass = new OutClass.InnerClass();
        innerClass.setName("innerClass");
        innerClass.setSubClass(subClass);
        OutClass outClass = new OutClass();
        outClass.setName("outClass");
        outClass.setInnerClass(innerClass);
        System.out.println(JSONUtil.toJsonStr(outClass));
    }
}
