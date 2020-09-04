package com.andy.demo.enums;

import cn.hutool.core.util.StrUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: weipeng
 * @create: 2020-05-12 16:03
 * @description:
 */
@AllArgsConstructor
@Getter
public enum AeProdDescEnum {
    /**
     * 第一级字段只有version和moduleList，version必须等于2.0.0，moduleList的值是一个数组，每一个数组对象都是一个module
     * 节点信息
     */
    //第一级节点
    MODULE_LIST("moduleList"),

    //第二级节点
    TYPE("type"),
    TEXTS("texts"),
    IMAGES("images"),
    REFERENCE("reference"),

    //第三级节点 属性信息
    //texts & html
    CONTENT("content"),
    CLASS("class"),
    //images
    URL("url"),
    STYLE("style"),
    //media
    MEDIAID("mediaId"),
    PREVIEWIMAGE("previewImage"),
    //dynamic
    MODULEID("moduleId"),

    /**
     * 每个module包含type字段，type的可选值如下表所示：
     * image    图片模块，pc详描和无线详描都可以包含此模块
     * text	    文本模块，pc详描和无线详描都可以包含此模块
     * text-image	图文模块，pc详描和无线详描都可以包含此模块
     * media	视频模块，pc详描和无线详描都可以包含此模块
     * dynamic	产品信息模块，可以是关联模块和自定义模块，只有pc详描可以包含此模块
     * html	    富文本模块，只有pc详描可以包含此模块
     */
    //二级节点对应类型
    IMAGE("image"),
    TEXT( "text"),
    TEXT_IMAGE("text-image"),
    MEDIA("media"),
    DYNAMIC("dynamic"),
    HTML("html"),

    //第四级节点
    //type=image style
    WIDTH("width"),
    HEIGHT("height"),
    HASMARGIN("hasMargin");

    private String desc;

    public static AeProdDescEnum getProdDesc(String desc) {
        for (AeProdDescEnum prodDesc : values()) {
            if (StrUtil.equals(prodDesc.desc, desc)) {
                return prodDesc;
            }
        }
        return null;
    }
}
