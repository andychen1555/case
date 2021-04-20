package com.andy.demo.bean;

import lombok.Data;

/**
 * @author andy
 * @version BossxFundStandardParam.java, v0.1 2021/2/26 10:04
 * @Description ���ж�ģ��ת����׼���
 */
@Data
public class BossxFundStandardParam {

    /**
     * ϵͳ
     */
    private String system = "BossxFundRunConstants.SYSTEM";

    /**
     * ����id
     */
    private String taskId;

    /**
     * ҵ����
     */
    private String bizCode;

    /**
     * ҵ������
     */
    private String name;

    /**
     * ҵ�������չ����
     */
    private String extParams;

    /**
     * �������
     */
    private String componentCode = "COMPONENT_CODE";

    /**
     * ���ʵ������
     */
    private String instanceCode = "INSTANCECODE_CODE";

    /**
     * ҵ�����ʹ�ò�Ʒ����
     */
    private String productCodes = "PRODUCTS_CODES";

    /**
     * ������Ե����
     */
    private String strategyCode = "STRATEGY_CODE";

}
