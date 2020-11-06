package com.andy.demo.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: weipeng
 * @create: 2020-11-06 12:01
 * @description:
 */
@Data
@AllArgsConstructor
public class UserCheck {
    private String date;
    private String name;
    private Integer num;
    private String money;
}
