package com.andy.demo.defaultvalue;

import cn.hutool.core.util.StrUtil;

/**
 * @author: weipeng
 * @create: 2020-04-22 11:39
 * @description:
 */
public class DefaultValueTest {
    public static void main(String[] args) {
//        String s = "";
        Integer i = null;
        Integer s1 = DefaultValue.setStrDefaultValue(i);
        System.out.println(s1);
    }

    public static class DefaultValue {
        /**
         * 对空参做 默认值处理 返回 0
         *
         * @return
         */
        private static <T> T setStrDefaultValue(T param) {
            if (param instanceof String) {
                String str = (String) param;
                if (StrUtil.isBlank(str)) {
                    str = "0";
                }
                return (T) str;
            }
            return null;
        }
    }

}
