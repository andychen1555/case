package com.andy.demo.bean;


/**
 * @author andy
 * @version BossxFundOpTmplComponent.java, v0.1 2021/1/25 15:05
 * @Description
 */
public class BossxFundOpTmplComponent {

    /**
     * ���ID
     */
    private String id;

    /**
     * �����ʾ����
     */
    private String labelName;

    /**
     * enum����ı�ѡ
     */
    private String type;

    /**
     * �Ӷ������б�������
     */
    private Object subComponent;

    /**
     * �Ƿ����
     */
    private Boolean required;

    /**
     * ������ֶ��Ƿ����ж���
     */
    private Boolean requireSpmD;

    public String getId() {
        return id;
    }

    public BossxFundOpTmplComponent setId(String id) {
        this.id = id;
        return this;
    }

    public String getLabelName() {
        return labelName;
    }

    public BossxFundOpTmplComponent setLabelName(String labelName) {
        this.labelName = labelName;
        return this;
    }

    public String getType() {
        return type;
    }

    public BossxFundOpTmplComponent setType(String type) {
        this.type = type;
        return this;
    }

    public Object getSubComponent() {
        return subComponent;
    }

    public BossxFundOpTmplComponent setSubComponent(Object subComponent) {
        this.subComponent = subComponent;
        return this;
    }

    public Boolean getRequired() {
        return required;
    }

    public BossxFundOpTmplComponent setRequired(Boolean required) {
        this.required = required;
        return this;
    }

    public Boolean getRequireSpmD() {
        return requireSpmD;
    }

    public BossxFundOpTmplComponent setRequireSpmD(Boolean requireSpmD) {
        this.requireSpmD = requireSpmD;
        return this;
    }
}
