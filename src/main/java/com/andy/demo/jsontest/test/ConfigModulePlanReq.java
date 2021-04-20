package com.andy.demo.jsontest.test;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author andy
 * @version ConfigModulePlanReq.java, v0.1 2020/12/30 18:24
 * @Description ����ģ�鷽��req
 */
@Data
@Accessors(chain = true)
public class ConfigModulePlanReq {

    private static final long serialVersionUID = 2891213102479052870L;

    /**
     * ģ�鷽����
     */
    private String modulePlanNo;

    /**
     * ģ�鷽�����
     */
    private String modulePlanGroupNo;

    /**
     * ģ������
     */
    private String name;

    /**
     * �Ƿ�Ĭ�϶���ģ��
     */
    private String isDefault;

    /**
     * �Ƿ��������ʵ��
     */
    private String isDarwinEnable;

    /**
     * ����ĳ������
     */
    private String darwinEntrance;

    /**
     * ���ȼ�
     */
    private String priority;

    /**
     * �������б�
     */
    private String whiteList;

    /**
     * ģ�鷽�������б�
     */
    private List<ModulePlanContent> planContents;

    /**
     * ҵ�����
     */
    private RulePlan rulePlan;

    /**
     * ҵ�����
     */
    @Data
    @Accessors(chain = true)
    public static class RulePlan {

        private static final long serialVersionUID = -5052089618740907259L;

        /**
         * ��ʷԼ�����򷽰���
         */
        private String oldRulePlanNo;

        /**
         * �����κ�����(Ȧ��,ҵ�����,ƣ�Ͷȵ�)
         */
        private String rulePlanType;

        /**
         * �߼�������
         */
        private String logicalOperator;

        /**
         * �����鼯��
         */
        private List<RulePlanGroup> planGroups;

        /**
         * ������
         */
        @Data
        @Accessors(chain = true)
        public static class RulePlanGroup {

            private static final long serialVersionUID = -7135853234672251854L;

            /**
             * ����������(�漰��������)
             */
            private String ruleGroupType;

            /**
             * �߼�������
             */
            private String logicalOperator;

            /**
             * Լ��������
             */
            private List<Rule> rules;

            /**
             * Լ������
             */
            @Data
            @Accessors(chain = true)
            public static class Rule{

                private static final long serialVersionUID = -8371602815774281086L;

                /**
                 * ��������(�漰���ú�����ʽ��������)
                 */
                private String ruleType;

                /**
                 * ��������
                 */
                private String content;
            }

        }

    }

    /**
     * ģ�鷽������
     */
    @Data
    @Accessors(chain = true)
    public static class ModulePlanContent {

        private static final long serialVersionUID = -5129342052081743585L;

        /**
         * ģ�鷽����������
         */
        private String name;

        /**
         * ��������
         */
        private String flowRation;

        /**
         * ģ�鷽������
         */
        private String content;

    }
}