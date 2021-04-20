package com.andy.demo.bean;

import cn.hutool.core.collection.CollUtil;
import lombok.Data;

import java.util.List;

/**
 * @author andy
 * @version MyClass.java, v0.1 2021/3/10 19:32
 * @Description
 */
@Data
public class MyClass {
    private List<String> sss = CollUtil.newArrayList();
}
