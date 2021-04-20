package com.andy.demo.jsontest.test;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.json.JSONUtil;
import com.andy.demo.jsontest.test.ConfigModulePlanReq.ModulePlanContent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author andy
 * @version TestJson.java, v0.1 2021/1/5 21:29
 * @Description
 */
public class TestJson {

    public static void main(String[] args) {
        ConfigModulePlanReq req = new ConfigModulePlanReq();
        ModulePlanContent p1 = new ModulePlanContent();
        ModulePlanContent p2 = new ModulePlanContent();
        p1.setName("modulePlanConten1");
        p1.setFlowRation("1");
        p1.setContent("xxxx1");
        p2.setName("modulePlanConten2");
        p2.setFlowRation("2");
        p2.setContent("xxx2");
        List<ModulePlanContent> contents = CollUtil.newArrayList();
        contents.add(p1);
        contents.add(p2);
        req.setPlanContents(contents);
        req.setName("name1")
                .setDarwinEntrance("en")
                .setPriority("1");
        ConfigModulePlanReq.RulePlan rulePlan = new ConfigModulePlanReq.RulePlan();
        req.setRulePlan(rulePlan);
        ConfigModulePlanReq.RulePlan.RulePlanGroup c1 = new ConfigModulePlanReq.RulePlan.RulePlanGroup();
        ConfigModulePlanReq.RulePlan.RulePlanGroup c2 = new ConfigModulePlanReq.RulePlan.RulePlanGroup();
        List<ConfigModulePlanReq.RulePlan.RulePlanGroup> c = CollUtil.newArrayList();
        c.add(c1);
        c.add(c2);
        rulePlan.setPlanGroups(c);
        ConfigModulePlanReq.RulePlan.RulePlanGroup.Rule r1 = new ConfigModulePlanReq.RulePlan.RulePlanGroup.Rule();
        ConfigModulePlanReq.RulePlan.RulePlanGroup.Rule r2 = new ConfigModulePlanReq.RulePlan.RulePlanGroup.Rule();
        ConfigModulePlanReq.RulePlan.RulePlanGroup.Rule r3 = new ConfigModulePlanReq.RulePlan.RulePlanGroup.Rule();
        ConfigModulePlanReq.RulePlan.RulePlanGroup.Rule r4 = new ConfigModulePlanReq.RulePlan.RulePlanGroup.Rule();
        List<ConfigModulePlanReq.RulePlan.RulePlanGroup.Rule> rr1 = CollUtil.newArrayList();
        List<ConfigModulePlanReq.RulePlan.RulePlanGroup.Rule> rr2 = CollUtil.newArrayList();
        rr1.add(r1);
        rr1.add(r2);
        rr2.add(r3);
        rr2.add(r4);
        c1.setRules(rr1);
        c2.setRules(rr2);
        System.out.println(JSONUtil.toJsonStr(req));
    }

}
