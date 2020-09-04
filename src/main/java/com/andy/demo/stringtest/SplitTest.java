package com.andy.demo.stringtest;

import cn.hutool.core.util.StrUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author: weipeng
 * @create: 2020-04-09 13:48
 * @description:
 */
public class SplitTest {
    public static void main(String[] args) {
//        String s = "CHK_LOCK_FIELD_CAN_NOT_EDIT:Locked fields skuPrice cannot be edited from 2.84 to 2.83";
////        String s = "qrqw   iqq asd";
//        System.out.println(StrUtil.containsAny(s,"CHK_LOCK_FIELD_CAN_NOT_EDITq"));
        List<Integer> a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(a.stream().filter(i->i==1).collect(Collectors.toList()));
    }
    /**
     * 通过逗号分隔字符串 返回List<String>
     *
     * @return List<String>
     */
    public static List<String> getListBySplitComma(String s) {
        if (Objects.isNull(s)) {
            return null;
        }
        String stripString = StringUtils.strip(s.replaceAll("\\s+", ""));
        return Arrays.asList(StringUtils.split(stripString, ","));
    }
}
