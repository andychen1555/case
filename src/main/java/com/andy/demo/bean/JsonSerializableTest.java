package com.andy.demo.bean;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Objects;

/**
 * @author andy
 * @version JsonSerializableTest.java, v0.1 2021/1/25 15:15
 * @Description
 */
public class JsonSerializableTest {
    public static void main(String[] args) {
        String json ="[\n" +
                "\t{\n" +
                "\t\t\"requireSpmD\": false,\n" +
                "\t\t\"id\": \"key\",\n" +
                "\t\t\"type\": \"object\",\n" +
                "\t\t\"labelName\": \"描述\",\n" +
                "\t\t\"subComponent\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"requireSpmD\": true,\n" +
                "\t\t\t\t\"id\": \"k1\",\n" +
                "\t\t\t\t\"labelName\": \"m1\",\n" +
                "\t\t\t\t\"type\": \"text\",\n" +
                "\t\t\t\t\"required\": true\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"value\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"requireSpmD\": true,\n" +
                "\t\t\t\t\"id\": \"k1\",\n" +
                "\t\t\t\t\"labelName\": \"m1\",\n" +
                "\t\t\t\t\"type\": \"text\",\n" +
                "\t\t\t\t\"value\": \"\",\n" +
                "\t\t\t\t\"required\": true\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"required\": false\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"requireSpmD\": true,\n" +
                "\t\t\"id\": \"k2\",\n" +
                "\t\t\"labelName\": \"m2\",\n" +
                "\t\t\"type\": \"text\",\n" +
                "\t\t\"value\": \"\",\n" +
                "\t\t\"required\": true\n" +
                "\t}\n" +
                "]";

//        List<BossxFundOpTmplComponent> components = JSON.parseArray(json, BossxFundOpTmplComponent.class);
//        for (BossxFundOpTmplComponent component : components) {
//            if (Objects.nonNull(component.getSubComponent())){
//                List<BossxFundOpTmplComponent> components1 = JSON.parseArray(JSONUtil.toJsonStr(component.getSubComponent()), BossxFundOpTmplComponent.class);
//                System.out.println(JSONUtil.toJsonStr(components1));
//            }
//        }
//        System.out.println(JSONUtil.toJsonStr(components));
        List<String> spmdList = assembleComponentList(CollUtil.newArrayList(), json);
        System.out.println(spmdList);
    }
    /**
     * 组装模版申请 spmD 活动点位元素 list
     */
    private static List<String> assembleComponentList(List<String> spmdList, String tmplComponents) {
        List<BossxFundOpTmplComponent> components = JSON.parseArray(tmplComponents, BossxFundOpTmplComponent.class);
        for (BossxFundOpTmplComponent component : components) {
            if (component.getRequireSpmD()){
                spmdList.add(component.getId());
                continue;
            }
            if (Objects.nonNull(component.getSubComponent())){
                assembleComponentList(spmdList,JSONUtil.toJsonStr(component.getSubComponent()));
            }
        }
        return spmdList;
    }
}
