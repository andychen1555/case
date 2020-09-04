package com.andy.demo.jsontest;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author: huawei
 * @create: 2020-03-04
 * @description: 速卖通-图片信息表
 */
@Data
@Accessors(chain = true)
public class TSmtProductFile implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 唯一标识
     */
    private Long id;


    /**
     * 文件链接
     */
    private String url;


    /**
     * 父sku（t_smt_shop_product_parent）
     */
    private String shopParentSku;


    /**
     * 父sku的id（t_smt_shop_product_parent）
     */
    private Integer shopParentSkuId;


    /**
     * 0.图片 1.视频
     */
    private Boolean fileType;


    /**
     * 0.主图 1.缩略图  2.其他
     */
    private Integer imgFlag;


    /**
     * 站点编号
     */
    private String stationCode;


    /**
     * 创建时间
     */
    private LocalDateTime createdTime;


    /**
     * 创建人id
     */
    private Integer createdBy;


    /**
     * 创建人名字
     */
    private String createdByName;


    /**
     * 来源:1.供应商2.第三方提供3.自拍4.本地上传
     */
    private Integer sourceType;


    /**
     * 1.有效 0.无效 默认1 有效
     */
    private Integer enable;


    /**
     * 店铺变体sku
     */
    private String shopVariaSku;


    /**
     * 对应的图片银行的图片链接--
     */
    private String photobankUrl;


    /**
     * 是否是从线上拿下来的数据（1.是 0.不是）
     */
    private Integer isOnlineData;


}
