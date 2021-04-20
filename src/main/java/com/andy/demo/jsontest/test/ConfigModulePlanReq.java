package com.andy.demo.jsontest.test;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author andy
 * @version ConfigModulePlanReq.java, v0.1 2020/12/30 18:24
 * @Description 配置模块方案req
 */
@Data
@Accessors(chain = true)
public class ConfigModulePlanReq {

    private static final long serialVersionUID = 2891213102479052870L;

    /**
     * 模块方案号
     */
    private String modulePlanNo;

    /**
     * 模块方案组号
     */
    private String modulePlanGroupNo;

    /**
     * 模块名称
     */
    private String name;

    /**
     * 是否默认兜底模块
     */
    private String isDefault;

    /**
     * 是否开启达尔文实验
     */
    private String isDarwinEnable;

    /**
     * 达尔文场景入口
     */
    private String darwinEntrance;

    /**
     * 优先级
     */
    private String priority;

    /**
     * 白名单列表
     */
    private String whiteList;

    /**
     * 模块方案内容列表
     */
    private List<ModulePlanContent> planContents;

    /**
     * 业务规则
     */
    private RulePlan rulePlan;

    /**
     * 业务规则
     */
    @Data
    @Accessors(chain = true)
    public static class RulePlan {

        private static final long serialVersionUID = -5052089618740907259L;

        /**
         * 历史约束规则方案号
         */
        private String oldRulePlanNo;

        /**
         * 用于任何类型(圈人,业务过滤,疲劳度等)
         */
        private String rulePlanType;

        /**
         * 逻辑操作符
         */
        private String logicalOperator;

        /**
         * 规则组集合
         */
        private List<RulePlanGroup> planGroups;

        /**
         * 规则组
         */
        @Data
        @Accessors(chain = true)
        public static class RulePlanGroup {

            private static final long serialVersionUID = -7135853234672251854L;

            /**
             * 规则组类型(涉及解析策略)
             */
            private String ruleGroupType;

            /**
             * 逻辑操作符
             */
            private String logicalOperator;

            /**
             * 约束规则结合
             */
            private List<Rule> rules;

            /**
             * 约束规则
             */
            @Data
            @Accessors(chain = true)
            public static class Rule{

                private static final long serialVersionUID = -8371602815774281086L;

                /**
                 * 规则类型(涉及到用合作方式解析规则)
                 */
                private String ruleType;

                /**
                 * 规则内容
                 */
                private String content;
            }

        }

    }

    /**
     * 模块方案内容
     */
    @Data
    @Accessors(chain = true)
    public static class ModulePlanContent {

        private static final long serialVersionUID = -5129342052081743585L;

        /**
         * 模块方案内容名称
         */
        private String name;

        /**
         * 流量比例
         */
        private String flowRation;

        /**
         * 模块方案内容
         */
        private String content;

    }
}