package com.andy.demo.bean;

import lombok.Data;

/**
 * @author andy
 * @version BossxFundStandardParam.java, v0.1 2021/2/26 10:04
 * @Description 运行端模型转换标准入参
 */
@Data
public class BossxFundStandardParam {

    /**
     * 系统
     */
    private String system = "BossxFundRunConstants.SYSTEM";

    /**
     * 工单id
     */
    private String taskId;

    /**
     * 业务码
     */
    private String bizCode;

    /**
     * 业务名称
     */
    private String name;

    /**
     * 业务身份拓展配置
     */
    private String extParams;

    /**
     * 组件代码
     */
    private String componentCode = "COMPONENT_CODE";

    /**
     * 组件实例代码
     */
    private String instanceCode = "INSTANCECODE_CODE";

    /**
     * 业务身份使用产品集合
     */
    private String productCodes = "PRODUCTS_CODES";

    /**
     * 组件策略点编码
     */
    private String strategyCode = "STRATEGY_CODE";

}
