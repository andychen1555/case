package com.andy.demo.nullcase;

import cn.hutool.core.collection.CollUtil;

import java.util.HashMap;

/**
 * @author andy
 * @version NullCase.java, v0.1 2021/5/14 10:03
 * @Description
 */
public class NullCase {
    public static void main(String[] args) {
        HashMap<Object, Object> map = CollUtil.newHashMap();
        String componentNo = (String) map.get("xxx");
        System.out.println(componentNo);
    }
}
