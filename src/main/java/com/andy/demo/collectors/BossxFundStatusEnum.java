package com.andy.demo.collectors;

/**
 * @author andy
 * @version PageGroupStatusEnum.java, v0.1 2020/12/28 15:58
 * @Description 页面方案组状态枚举
 */
public enum BossxFundStatusEnum {
    /** 编辑 */
    EDIT("EDIT", "编辑"),

    /** 暂停 */
    PAUSE("PAUSE", "暂停"),

    /** 预发 */
    PRE("PRE", "预发"),

    /** 灰度 */
    GRAY("GRAY", "灰度"),

    /** 内灰*/
    INNER_GRAY("INNER_GRAY", "内灰"),

    /** 发布 */
    PROD("PROD", "发布"),

    /** 发布保持状态（用在繁星场景，其它场景不能使用） */
    KEEP("KEEP", "发布保持"),

    /** 下线状态 */
    OFF_LINE("OFF_LINE", "下线"),

    /** 验证中状态*/
    VALIDATING("VALIDATING", "验证中");

    /** 类型编码 */
    private String code;

    /** 描述 */
    private String desc;

    /**
     *
     * @param code
     */
    BossxFundStatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     *
     * @param code
     * @return
     */
    public static BossxFundStatusEnum find(String code) {
        for (BossxFundStatusEnum temp : values()) {
            if (temp.getCode().equals(code)) {
                return temp;
            }
        }
        return null;
    }

    /**
     * Getter method for property <tt>code</tt>.
     *
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Getter method for property desc.
     *
     * @return property value of desc
     */
    public String getDesc() {
        return desc;
    }
}
