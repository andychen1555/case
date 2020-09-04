package com.andy.demo.taobao;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author: weipeng
 * @create: 2020-03-27 10:25
 * @description:
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
//        String jsonString = "[{\"propertyValueDefinitionName\":\"2\",\"propertyValueId\":691,\"skuPropertyId\":14},{\"propertyValueDefinitionName\":\"CN\",\"propertyValueId\":201336100,\"skuPropertyId\":200007763}]";
        String jsonString = "[]";
        JSONArray jsonArray = JSONUtil.parseArray(jsonString);
        List<AeopSkuNationalDiscountPrice> aeopSkuNationalDiscountPrices = jsonArray.toList(AeopSkuNationalDiscountPrice.class);
        System.out.println("jsonString======>" + jsonString);
        System.out.println(aeopSkuNationalDiscountPrices.toString());
    }

    @Data
    public static class AeopSkuNationalDiscountPrice {
        private String propertyValueDefinitionName;
        private Long propertyValueId;
        private String skuImage;
        private Long skuPropertyId;
    }

}
