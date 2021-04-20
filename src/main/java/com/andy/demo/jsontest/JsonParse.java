package com.andy.demo.jsontest;

/**
 * @author andy
 * @version JsonParse.java, v0.1 2021/3/31 20:52
 * @Description
 */
public class JsonParse {
    public static void main(String[] args) {
        String LANGUAGE_PREFIX = "language=";
        String MODULE_GROUP_PLAN_CONTENTS_PREFIX = "modulePlanNo=";
        System.out.println(buildPreConditon(LANGUAGE_PREFIX,"zh-Hans",MODULE_GROUP_PLAN_CONTENTS_PREFIX,"MP00001"));
    }

    /**
     * 构造第三层模型条件表达式
     * 规则: prefix1=val1;prefix2=val2
     */
    public static String buildPreConditon(String... params) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= params.length - 1; i++) {
            sb.append(params[i]);
            if (i % 2 == 1 && i != params.length - 1) {
                sb.append("&&");
            }
        }
        return sb.toString();
    }
}
