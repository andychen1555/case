package com.andy.demo.maptest;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author: weipeng
 * @create: 2020-10-15 17:13
 * @description:
 */
@Data
@Accessors(chain = true)
public class Apple {
    private int id;
    private String name;
    private String color;
}
