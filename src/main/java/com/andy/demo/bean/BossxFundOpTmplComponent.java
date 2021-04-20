package com.andy.demo.bean;


/**
 * @author andy
 * @version BossxFundOpTmplComponent.java, v0.1 2021/1/25 15:05
 * @Description
 */
public class BossxFundOpTmplComponent {

    /**
     * 组件ID
     */
    private String id;

    /**
     * 组件显示名称
     */
    private String labelName;

    /**
     * enum组件的备选
     */
    private String type;

    /**
     * 子对象、子列表的子组件
     */
    private Object subComponent;

    /**
     * 是否必填
     */
    private Boolean required;

    /**
     * 代表该字段是否是行动点
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
