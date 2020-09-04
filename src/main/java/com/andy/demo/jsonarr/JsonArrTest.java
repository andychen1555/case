package com.andy.demo.jsonarr;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import java.util.List;

/**
 * @author: weipeng
 * @create: 2020-06-23 14:37
 * @description:
 */
public class JsonArrTest {

    public static void main(String[] args) {
        String prodArr ="[\n" +
                "\t{\n" +
                "\t\t\"id\": 38865,\n" +
                "\t\t\"url\": \"http://tk.longpean.com/4824384106749189.jpeg?imageMogr2/thumbnail/1000x1000!\",\n" +
                "\t\t\"cnProductTitle\": \"圣诞装饰眼镜框\",\n" +
                "\t\t\"lastGoodCate\": \"庆典派对用品(Event & Party Supplies)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"HGWL331\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 15:39:49\",\n" +
                "\t\t\"checkedTime\": \"2019-11-16 16:18:36\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGWL331-1\",\n" +
                "\t\t\t\t\"parentSku\": \"HGWL331\",\n" +
                "\t\t\t\t\"parentSkuId\": 38865,\n" +
                "\t\t\t\t\"colour\": \"1\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 3,\n" +
                "\t\t\t\t\"weight\": 25.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGWL331-2\",\n" +
                "\t\t\t\t\"parentSku\": \"HGWL331\",\n" +
                "\t\t\t\t\"parentSkuId\": 38865,\n" +
                "\t\t\t\t\"colour\": \"2\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 3,\n" +
                "\t\t\t\t\"weight\": 25.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGWL331-3\",\n" +
                "\t\t\t\t\"parentSku\": \"HGWL331\",\n" +
                "\t\t\t\t\"parentSkuId\": 38865,\n" +
                "\t\t\t\t\"colour\": \"3\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 3,\n" +
                "\t\t\t\t\"weight\": 25.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGWL331-4\",\n" +
                "\t\t\t\t\"parentSku\": \"HGWL331\",\n" +
                "\t\t\t\t\"parentSkuId\": 38865,\n" +
                "\t\t\t\t\"colour\": \"4\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 3,\n" +
                "\t\t\t\t\"weight\": 25.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38863,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"两面穿竖条纹精梳棉女中筒袜\",\n" +
                "\t\t\"lastGoodCate\": \"短袜(Socks)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"FALZJ1CC\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 15:27:59\",\n" +
                "\t\t\"checkedTime\": \"2019-11-16 16:08:42\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ1CC-H\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ1CC\",\n" +
                "\t\t\t\t\"parentSkuId\": 38863,\n" +
                "\t\t\t\t\"colour\": \"Black\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 4.4,\n" +
                "\t\t\t\t\"weight\": 45.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ1CC-R\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ1CC\",\n" +
                "\t\t\t\t\"parentSkuId\": 38863,\n" +
                "\t\t\t\t\"colour\": \"Red\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 4.4,\n" +
                "\t\t\t\t\"weight\": 45.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ1CC-Y\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ1CC\",\n" +
                "\t\t\t\t\"parentSkuId\": 38863,\n" +
                "\t\t\t\t\"colour\": \"Yellow\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 4.4,\n" +
                "\t\t\t\t\"weight\": 45.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ1CC-YH\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ1CC\",\n" +
                "\t\t\t\t\"parentSkuId\": 38863,\n" +
                "\t\t\t\t\"colour\": \"Grey\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 4.4,\n" +
                "\t\t\t\t\"weight\": 45.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ1CC-Khaki\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ1CC\",\n" +
                "\t\t\t\t\"parentSkuId\": 38863,\n" +
                "\t\t\t\t\"colour\": \"Khaki\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 4.4,\n" +
                "\t\t\t\t\"weight\": 45.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38861,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"女士长款钱包\",\n" +
                "\t\t\"lastGoodCate\": \"钱包(Wallets)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"XBCLY4B1\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 15:15:18\",\n" +
                "\t\t\"checkedTime\": \"2019-11-16 16:08:42\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBCLY4B1-R\",\n" +
                "\t\t\t\t\"parentSku\": \"XBCLY4B1\",\n" +
                "\t\t\t\t\"parentSkuId\": 38861,\n" +
                "\t\t\t\t\"colour\": \"red\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 11.8,\n" +
                "\t\t\t\t\"weight\": 115.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBCLY4B1-P\",\n" +
                "\t\t\t\t\"parentSku\": \"XBCLY4B1\",\n" +
                "\t\t\t\t\"parentSkuId\": 38861,\n" +
                "\t\t\t\t\"colour\": \"pink\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 11.8,\n" +
                "\t\t\t\t\"weight\": 115.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBCLY4B1-B\",\n" +
                "\t\t\t\t\"parentSku\": \"XBCLY4B1\",\n" +
                "\t\t\t\t\"parentSkuId\": 38861,\n" +
                "\t\t\t\t\"colour\": \"black\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 11.8,\n" +
                "\t\t\t\t\"weight\": 115.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBCLY4B1-L\",\n" +
                "\t\t\t\t\"parentSku\": \"XBCLY4B1\",\n" +
                "\t\t\t\t\"parentSkuId\": 38861,\n" +
                "\t\t\t\t\"colour\": \"blue\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 11.8,\n" +
                "\t\t\t\t\"weight\": 115.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBCLY4B1-Z\",\n" +
                "\t\t\t\t\"parentSku\": \"XBCLY4B1\",\n" +
                "\t\t\t\t\"parentSkuId\": 38861,\n" +
                "\t\t\t\t\"colour\": \"Purple\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 11.8,\n" +
                "\t\t\t\t\"weight\": 115.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBCLY4B1-BN\",\n" +
                "\t\t\t\t\"parentSku\": \"XBCLY4B1\",\n" +
                "\t\t\t\t\"parentSkuId\": 38861,\n" +
                "\t\t\t\t\"colour\": \"brown\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 11.8,\n" +
                "\t\t\t\t\"weight\": 115.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38860,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"创意USB风扇陶瓷杯卡通木盖马克杯水杯办公室学生泡茶咖啡杯子\",\n" +
                "\t\t\"lastGoodCate\": \"马克杯(Mugs)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"HGBC731\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 15:09:31\",\n" +
                "\t\t\"checkedTime\": \"2019-11-16 16:32:01\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGBC731-Blue\",\n" +
                "\t\t\t\t\"parentSku\": \"HGBC731\",\n" +
                "\t\t\t\t\"parentSkuId\": 38860,\n" +
                "\t\t\t\t\"colour\": \"Blue cup pink sheep\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 19.8,\n" +
                "\t\t\t\t\"weight\": 460.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGBC731-Bluecu\",\n" +
                "\t\t\t\t\"parentSku\": \"HGBC731\",\n" +
                "\t\t\t\t\"parentSkuId\": 38860,\n" +
                "\t\t\t\t\"colour\": \"Blue cup grey sheep\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 19.8,\n" +
                "\t\t\t\t\"weight\": 460.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGBC731-Powder\",\n" +
                "\t\t\t\t\"parentSku\": \"HGBC731\",\n" +
                "\t\t\t\t\"parentSkuId\": 38860,\n" +
                "\t\t\t\t\"colour\": \"Powder cup yellow sheep\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 19.8,\n" +
                "\t\t\t\t\"weight\": 460.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGBC731-Pinkcu\",\n" +
                "\t\t\t\t\"parentSku\": \"HGBC731\",\n" +
                "\t\t\t\t\"parentSkuId\": 38860,\n" +
                "\t\t\t\t\"colour\": \"Pink cup blue sheep\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 19.8,\n" +
                "\t\t\t\t\"weight\": 460.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38859,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"牛仔布保护套包收纳包出国护照包\",\n" +
                "\t\t\"lastGoodCate\": \"卡包(Card & ID Holders)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"XBZJK7D1\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 15:04:56\",\n" +
                "\t\t\"checkedTime\": \"2019-11-16 16:33:51\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBZJK7D1-A\",\n" +
                "\t\t\t\t\"parentSku\": \"XBZJK7D1\",\n" +
                "\t\t\t\t\"parentSkuId\": 38859,\n" +
                "\t\t\t\t\"colour\": \"black\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 8.5,\n" +
                "\t\t\t\t\"weight\": 40.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBZJK7D1-B\",\n" +
                "\t\t\t\t\"parentSku\": \"XBZJK7D1\",\n" +
                "\t\t\t\t\"parentSkuId\": 38859,\n" +
                "\t\t\t\t\"colour\": \"red\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 8.5,\n" +
                "\t\t\t\t\"weight\": 40.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBZJK7D1-C\",\n" +
                "\t\t\t\t\"parentSku\": \"XBZJK7D1\",\n" +
                "\t\t\t\t\"parentSkuId\": 38859,\n" +
                "\t\t\t\t\"colour\": \"rose red\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 8.5,\n" +
                "\t\t\t\t\"weight\": 40.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBZJK7D1-D\",\n" +
                "\t\t\t\t\"parentSku\": \"XBZJK7D1\",\n" +
                "\t\t\t\t\"parentSkuId\": 38859,\n" +
                "\t\t\t\t\"colour\": \"dark blue\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 8.5,\n" +
                "\t\t\t\t\"weight\": 40.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38858,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"kt可爱单肩包\",\n" +
                "\t\t\"lastGoodCate\": \"手提/单肩/斜跨包(Handbags)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"XBXF6BD\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 15:03:52\",\n" +
                "\t\t\"checkedTime\": \"2019-12-02 14:51:46\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBXF6BD-H\",\n" +
                "\t\t\t\t\"parentSku\": \"XBXF6BD\",\n" +
                "\t\t\t\t\"parentSkuId\": 38858,\n" +
                "\t\t\t\t\"colour\": \"Black\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 8,\n" +
                "\t\t\t\t\"weight\": 250.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBXF6BD-B\",\n" +
                "\t\t\t\t\"parentSku\": \"XBXF6BD\",\n" +
                "\t\t\t\t\"parentSkuId\": 38858,\n" +
                "\t\t\t\t\"colour\": \"White\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 8,\n" +
                "\t\t\t\t\"weight\": 250.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBXF6BD-FR\",\n" +
                "\t\t\t\t\"parentSku\": \"XBXF6BD\",\n" +
                "\t\t\t\t\"parentSkuId\": 38858,\n" +
                "\t\t\t\t\"colour\": \"Pink\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 8,\n" +
                "\t\t\t\t\"weight\": 250.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBXF6BD-J\",\n" +
                "\t\t\t\t\"parentSku\": \"XBXF6BD\",\n" +
                "\t\t\t\t\"parentSkuId\": 38858,\n" +
                "\t\t\t\t\"colour\": \"Gold\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 8,\n" +
                "\t\t\t\t\"weight\": 250.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBXF6BD-rosered\",\n" +
                "\t\t\t\t\"parentSku\": \"XBXF6BD\",\n" +
                "\t\t\t\t\"parentSkuId\": 38858,\n" +
                "\t\t\t\t\"colour\": \"rose red\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 8,\n" +
                "\t\t\t\t\"weight\": 250.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38857,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"亮色ins网红笑脸小腿袜\",\n" +
                "\t\t\"lastGoodCate\": \"长筒袜(Stockings)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"FALZJ7C3\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 15:01:09\",\n" +
                "\t\t\"checkedTime\": \"2019-11-18 17:57:25\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ7C3-H\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ7C3\",\n" +
                "\t\t\t\t\"parentSkuId\": 38857,\n" +
                "\t\t\t\t\"colour\": \"Black\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 4.4,\n" +
                "\t\t\t\t\"weight\": 50.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ7C3-Y\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ7C3\",\n" +
                "\t\t\t\t\"parentSkuId\": 38857,\n" +
                "\t\t\t\t\"colour\": \"Yellow\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 4.4,\n" +
                "\t\t\t\t\"weight\": 50.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ7C3-L\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ7C3\",\n" +
                "\t\t\t\t\"parentSkuId\": 38857,\n" +
                "\t\t\t\t\"colour\": \"Green\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 4.4,\n" +
                "\t\t\t\t\"weight\": 50.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ7C3-roser\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ7C3\",\n" +
                "\t\t\t\t\"parentSkuId\": 38857,\n" +
                "\t\t\t\t\"colour\": \"rose red \",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 4.4,\n" +
                "\t\t\t\t\"weight\": 50.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38855,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"短款女士钱包 零钱包\",\n" +
                "\t\t\"lastGoodCate\": \"钱包(Wallets)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"XBCLYAE5\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 14:53:48\",\n" +
                "\t\t\"checkedTime\": \"2019-11-18 17:59:39\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBCLYAE5-A\",\n" +
                "\t\t\t\t\"parentSku\": \"XBCLYAE5\",\n" +
                "\t\t\t\t\"parentSkuId\": 38855,\n" +
                "\t\t\t\t\"colour\": \"Coffee\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 9.8,\n" +
                "\t\t\t\t\"weight\": 95.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBCLYAE5-B\",\n" +
                "\t\t\t\t\"parentSku\": \"XBCLYAE5\",\n" +
                "\t\t\t\t\"parentSkuId\": 38855,\n" +
                "\t\t\t\t\"colour\": \"black\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 9.8,\n" +
                "\t\t\t\t\"weight\": 95.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBCLYAE5-C\",\n" +
                "\t\t\t\t\"parentSku\": \"XBCLYAE5\",\n" +
                "\t\t\t\t\"parentSkuId\": 38855,\n" +
                "\t\t\t\t\"colour\": \"red\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 9.8,\n" +
                "\t\t\t\t\"weight\": 95.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBCLYAE5-D\",\n" +
                "\t\t\t\t\"parentSku\": \"XBCLYAE5\",\n" +
                "\t\t\t\t\"parentSkuId\": 38855,\n" +
                "\t\t\t\t\"colour\": \"blue\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 9.8,\n" +
                "\t\t\t\t\"weight\": 95.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBCLYAE5-E\",\n" +
                "\t\t\t\t\"parentSku\": \"XBCLYAE5\",\n" +
                "\t\t\t\t\"parentSkuId\": 38855,\n" +
                "\t\t\t\t\"colour\": \"Pink\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 9.8,\n" +
                "\t\t\t\t\"weight\": 95.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBCLYAE5-F\",\n" +
                "\t\t\t\t\"parentSku\": \"XBCLYAE5\",\n" +
                "\t\t\t\t\"parentSkuId\": 38855,\n" +
                "\t\t\t\t\"colour\": \"Purple\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 9.8,\n" +
                "\t\t\t\t\"weight\": 95.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38853,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"日系学院风女士中筒袜\",\n" +
                "\t\t\"lastGoodCate\": \"长筒袜(Stockings)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"FALZJD46\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 14:44:37\",\n" +
                "\t\t\"checkedTime\": \"2019-11-16 16:33:48\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJD46-H\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJD46\",\n" +
                "\t\t\t\t\"parentSkuId\": 38853,\n" +
                "\t\t\t\t\"colour\": \"Black\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 4.1,\n" +
                "\t\t\t\t\"weight\": 65.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJD46-Y\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJD46\",\n" +
                "\t\t\t\t\"parentSkuId\": 38853,\n" +
                "\t\t\t\t\"colour\": \"Yellow\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 4.1,\n" +
                "\t\t\t\t\"weight\": 65.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJD46-C\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJD46\",\n" +
                "\t\t\t\t\"parentSkuId\": 38853,\n" +
                "\t\t\t\t\"colour\": \"Orange\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 4.1,\n" +
                "\t\t\t\t\"weight\": 65.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJD46-L\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJD46\",\n" +
                "\t\t\t\t\"parentSkuId\": 38853,\n" +
                "\t\t\t\t\"colour\": \"Green\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 4.1,\n" +
                "\t\t\t\t\"weight\": 65.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38852,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"5个装家用成人无痕素色塑料防滑干湿两用晒衣架挂衣撑\",\n" +
                "\t\t\"lastGoodCate\": \"晾衣架(Drying Racks)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"HGQXYEE2\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 14:31:31\",\n" +
                "\t\t\"checkedTime\": \"2019-11-16 16:31:11\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXYEE2-L\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXYEE2\",\n" +
                "\t\t\t\t\"parentSkuId\": 38852,\n" +
                "\t\t\t\t\"colour\": \"Green\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 3.8,\n" +
                "\t\t\t\t\"weight\": 238.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXYEE2-N\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXYEE2\",\n" +
                "\t\t\t\t\"parentSkuId\": 38852,\n" +
                "\t\t\t\t\"colour\": \"Blue\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 3.8,\n" +
                "\t\t\t\t\"weight\": 238.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXYEE2-FR\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXYEE2\",\n" +
                "\t\t\t\t\"parentSkuId\": 38852,\n" +
                "\t\t\t\t\"colour\": \"Pink\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 3.8,\n" +
                "\t\t\t\t\"weight\": 238.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXYEE2-Khaki\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXYEE2\",\n" +
                "\t\t\t\t\"parentSkuId\": 38852,\n" +
                "\t\t\t\t\"colour\": \"Khaki\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 3.8,\n" +
                "\t\t\t\t\"weight\": 238.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38851,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"防水运动双肩包多功能折叠背包户外旅行包男女折叠双肩包\",\n" +
                "\t\t\"lastGoodCate\": \"双肩背包(Backpacks)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"XBBC831\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 14:29:27\",\n" +
                "\t\t\"checkedTime\": \"2019-11-16 16:07:50\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBBC831-H\",\n" +
                "\t\t\t\t\"parentSku\": \"XBBC831\",\n" +
                "\t\t\t\t\"parentSkuId\": 38851,\n" +
                "\t\t\t\t\"colour\": \"Black\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 17,\n" +
                "\t\t\t\t\"weight\": 220.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBBC831-N\",\n" +
                "\t\t\t\t\"parentSku\": \"XBBC831\",\n" +
                "\t\t\t\t\"parentSkuId\": 38851,\n" +
                "\t\t\t\t\"colour\": \"Blue\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 17,\n" +
                "\t\t\t\t\"weight\": 220.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBBC831-L\",\n" +
                "\t\t\t\t\"parentSku\": \"XBBC831\",\n" +
                "\t\t\t\t\"parentSkuId\": 38851,\n" +
                "\t\t\t\t\"colour\": \"Green\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 17,\n" +
                "\t\t\t\t\"weight\": 220.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBBC831-YH\",\n" +
                "\t\t\t\t\"parentSku\": \"XBBC831\",\n" +
                "\t\t\t\t\"parentSkuId\": 38851,\n" +
                "\t\t\t\t\"colour\": \"Grey\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 17,\n" +
                "\t\t\t\t\"weight\": 220.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBBC831-FR\",\n" +
                "\t\t\t\t\"parentSku\": \"XBBC831\",\n" +
                "\t\t\t\t\"parentSkuId\": 38851,\n" +
                "\t\t\t\t\"colour\": \"Pink\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 17,\n" +
                "\t\t\t\t\"weight\": 220.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBBC831-Rosered\",\n" +
                "\t\t\t\t\"parentSku\": \"XBBC831\",\n" +
                "\t\t\t\t\"parentSkuId\": 38851,\n" +
                "\t\t\t\t\"colour\": \"Rose red\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 17,\n" +
                "\t\t\t\t\"weight\": 220.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38850,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"扎染几何图案情侣款滑板潮袜\",\n" +
                "\t\t\"lastGoodCate\": \"长筒袜(Stockings)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"FALZJAE1\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 14:17:17\",\n" +
                "\t\t\"checkedTime\": \"2019-11-16 16:29:33\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJAE1-H\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJAE1\",\n" +
                "\t\t\t\t\"parentSkuId\": 38850,\n" +
                "\t\t\t\t\"colour\": \"Black\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 8.1,\n" +
                "\t\t\t\t\"weight\": 65.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJAE1-Z\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJAE1\",\n" +
                "\t\t\t\t\"parentSkuId\": 38850,\n" +
                "\t\t\t\t\"colour\": \"Purple\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 8.1,\n" +
                "\t\t\t\t\"weight\": 65.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJAE1-N\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJAE1\",\n" +
                "\t\t\t\t\"parentSkuId\": 38850,\n" +
                "\t\t\t\t\"colour\": \"Blue\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 8.1,\n" +
                "\t\t\t\t\"weight\": 65.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJAE1-purpl\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJAE1\",\n" +
                "\t\t\t\t\"parentSkuId\": 38850,\n" +
                "\t\t\t\t\"colour\": \"purple&yellow\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 8.1,\n" +
                "\t\t\t\t\"weight\": 65.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJAE1-redye\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJAE1\",\n" +
                "\t\t\t\t\"parentSkuId\": 38850,\n" +
                "\t\t\t\t\"colour\": \"red&yellow\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 8.1,\n" +
                "\t\t\t\t\"weight\": 65.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38849,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"家用厨房浴室挂式可爱擦手巾不易掉毛干手巾吸水抹布\",\n" +
                "\t\t\"lastGoodCate\": \"毛巾/浴巾（婴儿用的请发布到婴儿毛巾下）(Towel)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"HGQXY0E3\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 14:14:56\",\n" +
                "\t\t\"checkedTime\": \"2019-11-18 13:16:46\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXY0E3-FR\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXY0E3\",\n" +
                "\t\t\t\t\"parentSkuId\": 38849,\n" +
                "\t\t\t\t\"colour\": \"Pink\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 3.68,\n" +
                "\t\t\t\t\"weight\": 40.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXY0E3-light\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXY0E3\",\n" +
                "\t\t\t\t\"parentSkuId\": 38849,\n" +
                "\t\t\t\t\"colour\": \"light brown\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 3.68,\n" +
                "\t\t\t\t\"weight\": 40.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXY0E3-cream\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXY0E3\",\n" +
                "\t\t\t\t\"parentSkuId\": 38849,\n" +
                "\t\t\t\t\"colour\": \"creamywhite\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 3.68,\n" +
                "\t\t\t\t\"weight\": 40.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38848,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"旅行折叠包大容量收纳包时尚运动瑜伽包短途旅行包\",\n" +
                "\t\t\"lastGoodCate\": \"旅行包(Travel Bags)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"XBBC609\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 14:05:03\",\n" +
                "\t\t\"checkedTime\": \"2019-11-16 16:20:17\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBBC609-R\",\n" +
                "\t\t\t\t\"parentSku\": \"XBBC609\",\n" +
                "\t\t\t\t\"parentSkuId\": 38848,\n" +
                "\t\t\t\t\"colour\": \"Red\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 23,\n" +
                "\t\t\t\t\"weight\": 540.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBBC609-H\",\n" +
                "\t\t\t\t\"parentSku\": \"XBBC609\",\n" +
                "\t\t\t\t\"parentSkuId\": 38848,\n" +
                "\t\t\t\t\"colour\": \"Black\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 23,\n" +
                "\t\t\t\t\"weight\": 540.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBBC609-N\",\n" +
                "\t\t\t\t\"parentSku\": \"XBBC609\",\n" +
                "\t\t\t\t\"parentSkuId\": 38848,\n" +
                "\t\t\t\t\"colour\": \"Blue\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 23,\n" +
                "\t\t\t\t\"weight\": 540.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBBC609-YH\",\n" +
                "\t\t\t\t\"parentSku\": \"XBBC609\",\n" +
                "\t\t\t\t\"parentSkuId\": 38848,\n" +
                "\t\t\t\t\"colour\": \"Grey\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 23,\n" +
                "\t\t\t\t\"weight\": 540.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38847,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"彩虹棒棒糖发夹\",\n" +
                "\t\t\"lastGoodCate\": \"头饰（非首饰类头发饰品）(Headwear)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"FAHC5B7\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 13:59:22\",\n" +
                "\t\t\"checkedTime\": \"2019-11-16 16:14:39\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FAHC5B71\",\n" +
                "\t\t\t\t\"parentSku\": \"FAHC5B7\",\n" +
                "\t\t\t\t\"parentSkuId\": 38847,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"1\",\n" +
                "\t\t\t\t\"cost\": 2.48,\n" +
                "\t\t\t\t\"weight\": 20.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FAHC5B72\",\n" +
                "\t\t\t\t\"parentSku\": \"FAHC5B7\",\n" +
                "\t\t\t\t\"parentSkuId\": 38847,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"2\",\n" +
                "\t\t\t\t\"cost\": 2.48,\n" +
                "\t\t\t\t\"weight\": 20.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FAHC5B73\",\n" +
                "\t\t\t\t\"parentSku\": \"FAHC5B7\",\n" +
                "\t\t\t\t\"parentSkuId\": 38847,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"3\",\n" +
                "\t\t\t\t\"cost\": 2.48,\n" +
                "\t\t\t\t\"weight\": 20.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FAHC5B74\",\n" +
                "\t\t\t\t\"parentSku\": \"FAHC5B7\",\n" +
                "\t\t\t\t\"parentSkuId\": 38847,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"4\",\n" +
                "\t\t\t\t\"cost\": 2.48,\n" +
                "\t\t\t\t\"weight\": 20.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FAHC5B75\",\n" +
                "\t\t\t\t\"parentSku\": \"FAHC5B7\",\n" +
                "\t\t\t\t\"parentSkuId\": 38847,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"5\",\n" +
                "\t\t\t\t\"cost\": 2.48,\n" +
                "\t\t\t\t\"weight\": 20.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FAHC5B76\",\n" +
                "\t\t\t\t\"parentSku\": \"FAHC5B7\",\n" +
                "\t\t\t\t\"parentSkuId\": 38847,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"6\",\n" +
                "\t\t\t\t\"cost\": 2.48,\n" +
                "\t\t\t\t\"weight\": 20.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FAHC5B77\",\n" +
                "\t\t\t\t\"parentSku\": \"FAHC5B7\",\n" +
                "\t\t\t\t\"parentSkuId\": 38847,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"7\",\n" +
                "\t\t\t\t\"cost\": 2.48,\n" +
                "\t\t\t\t\"weight\": 20.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FAHC5B78\",\n" +
                "\t\t\t\t\"parentSku\": \"FAHC5B7\",\n" +
                "\t\t\t\t\"parentSkuId\": 38847,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"8\",\n" +
                "\t\t\t\t\"cost\": 2.48,\n" +
                "\t\t\t\t\"weight\": 20.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FAHC5B79\",\n" +
                "\t\t\t\t\"parentSku\": \"FAHC5B7\",\n" +
                "\t\t\t\t\"parentSkuId\": 38847,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"9\",\n" +
                "\t\t\t\t\"cost\": 2.48,\n" +
                "\t\t\t\t\"weight\": 20.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FAHC5B710\",\n" +
                "\t\t\t\t\"parentSku\": \"FAHC5B7\",\n" +
                "\t\t\t\t\"parentSkuId\": 38847,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"10\",\n" +
                "\t\t\t\t\"cost\": 2.48,\n" +
                "\t\t\t\t\"weight\": 20.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38846,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"新款干湿分离化妆包 阳离子旅行收纳包 手提洗漱包便携整理方包\",\n" +
                "\t\t\"lastGoodCate\": \"化妆包(Cosmetic Bags & Cases)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"XBBC960\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 13:45:52\",\n" +
                "\t\t\"checkedTime\": \"2019-11-16 16:04:30\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBBC960-H\",\n" +
                "\t\t\t\t\"parentSku\": \"XBBC960\",\n" +
                "\t\t\t\t\"parentSkuId\": 38846,\n" +
                "\t\t\t\t\"colour\": \"Black\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 14,\n" +
                "\t\t\t\t\"weight\": 150.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBBC960-N\",\n" +
                "\t\t\t\t\"parentSku\": \"XBBC960\",\n" +
                "\t\t\t\t\"parentSkuId\": 38846,\n" +
                "\t\t\t\t\"colour\": \"Blue\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 14,\n" +
                "\t\t\t\t\"weight\": 150.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBBC960-YH\",\n" +
                "\t\t\t\t\"parentSku\": \"XBBC960\",\n" +
                "\t\t\t\t\"parentSkuId\": 38846,\n" +
                "\t\t\t\t\"colour\": \"Grey\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 14,\n" +
                "\t\t\t\t\"weight\": 150.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBBC960-Z\",\n" +
                "\t\t\t\t\"parentSku\": \"XBBC960\",\n" +
                "\t\t\t\t\"parentSkuId\": 38846,\n" +
                "\t\t\t\t\"colour\": \"Purple\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 14,\n" +
                "\t\t\t\t\"weight\": 150.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBBC960-FR\",\n" +
                "\t\t\t\t\"parentSku\": \"XBBC960\",\n" +
                "\t\t\t\t\"parentSkuId\": 38846,\n" +
                "\t\t\t\t\"colour\": \"Pink\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 14,\n" +
                "\t\t\t\t\"weight\": 150.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38845,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"合金蜻蜓U形发叉\",\n" +
                "\t\t\"lastGoodCate\": \"头饰（非首饰类头发饰品）(Headwear)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"FAGXX69B\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 13:37:54\",\n" +
                "\t\t\"checkedTime\": \"2019-11-16 15:55:35\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FAGXX69B-P\",\n" +
                "\t\t\t\t\"parentSku\": \"FAGXX69B\",\n" +
                "\t\t\t\t\"parentSkuId\": 38845,\n" +
                "\t\t\t\t\"colour\": \"Pink\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 2.8,\n" +
                "\t\t\t\t\"weight\": 12.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38844,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"圣诞帽圣诞老人卡通帽子\",\n" +
                "\t\t\"lastGoodCate\": \"帽子(Hats & Caps)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"FACZH77B\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 13:30:34\",\n" +
                "\t\t\"checkedTime\": \"2019-11-16 16:05:37\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FACZH77BA\",\n" +
                "\t\t\t\t\"parentSku\": \"FACZH77B\",\n" +
                "\t\t\t\t\"parentSkuId\": 38844,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"Adult\",\n" +
                "\t\t\t\t\"cost\": 3,\n" +
                "\t\t\t\t\"weight\": 45.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FACZH77BB\",\n" +
                "\t\t\t\t\"parentSku\": \"FACZH77B\",\n" +
                "\t\t\t\t\"parentSkuId\": 38844,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"Children\",\n" +
                "\t\t\t\t\"cost\": 2.5,\n" +
                "\t\t\t\t\"weight\": 35.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38843,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"圣诞帽 印花双层纱帽\",\n" +
                "\t\t\"lastGoodCate\": \"帽子(Hats & Caps)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"FACZH6AE\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 11:55:17\",\n" +
                "\t\t\"checkedTime\": \"2019-11-16 16:22:00\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FACZH6AEA\",\n" +
                "\t\t\t\t\"parentSku\": \"FACZH6AE\",\n" +
                "\t\t\t\t\"parentSkuId\": 38843,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"adults\",\n" +
                "\t\t\t\t\"cost\": 1.5,\n" +
                "\t\t\t\t\"weight\": 30.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FACZH6AEB\",\n" +
                "\t\t\t\t\"parentSku\": \"FACZH6AE\",\n" +
                "\t\t\t\t\"parentSkuId\": 38843,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"children\",\n" +
                "\t\t\t\t\"cost\": 1.5,\n" +
                "\t\t\t\t\"weight\": 30.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38842,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"面霜盒分装瓶束腰瓶\",\n" +
                "\t\t\"lastGoodCate\": \"分装瓶(Refillable Bottles)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"BHCZH187\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 11:29:03\",\n" +
                "\t\t\"checkedTime\": \"2019-11-16 16:11:15\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"BHCZH187-B15G\",\n" +
                "\t\t\t\t\"parentSku\": \"BHCZH187\",\n" +
                "\t\t\t\t\"parentSkuId\": 38842,\n" +
                "\t\t\t\t\"colour\": \"White\",\n" +
                "\t\t\t\t\"size\": \"15G\",\n" +
                "\t\t\t\t\"cost\": 0.75,\n" +
                "\t\t\t\t\"weight\": 20.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"BHCZH187-B30G\",\n" +
                "\t\t\t\t\"parentSku\": \"BHCZH187\",\n" +
                "\t\t\t\t\"parentSkuId\": 38842,\n" +
                "\t\t\t\t\"colour\": \"White\",\n" +
                "\t\t\t\t\"size\": \"30G\",\n" +
                "\t\t\t\t\"cost\": 0.98,\n" +
                "\t\t\t\t\"weight\": 35.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"BHCZH187-B50G\",\n" +
                "\t\t\t\t\"parentSku\": \"BHCZH187\",\n" +
                "\t\t\t\t\"parentSkuId\": 38842,\n" +
                "\t\t\t\t\"colour\": \"White\",\n" +
                "\t\t\t\t\"size\": \"50G\",\n" +
                "\t\t\t\t\"cost\": 1.4,\n" +
                "\t\t\t\t\"weight\": 48.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"BHCZH187-H15G\",\n" +
                "\t\t\t\t\"parentSku\": \"BHCZH187\",\n" +
                "\t\t\t\t\"parentSkuId\": 38842,\n" +
                "\t\t\t\t\"colour\": \"Black\",\n" +
                "\t\t\t\t\"size\": \"15G\",\n" +
                "\t\t\t\t\"cost\": 0.75,\n" +
                "\t\t\t\t\"weight\": 20.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"BHCZH187-H30G\",\n" +
                "\t\t\t\t\"parentSku\": \"BHCZH187\",\n" +
                "\t\t\t\t\"parentSkuId\": 38842,\n" +
                "\t\t\t\t\"colour\": \"Black\",\n" +
                "\t\t\t\t\"size\": \"30G\",\n" +
                "\t\t\t\t\"cost\": 0.98,\n" +
                "\t\t\t\t\"weight\": 35.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"BHCZH187-H50G\",\n" +
                "\t\t\t\t\"parentSku\": \"BHCZH187\",\n" +
                "\t\t\t\t\"parentSkuId\": 38842,\n" +
                "\t\t\t\t\"colour\": \"Black\",\n" +
                "\t\t\t\t\"size\": \"50G\",\n" +
                "\t\t\t\t\"cost\": 1.4,\n" +
                "\t\t\t\t\"weight\": 48.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"BHCZH187-N15G\",\n" +
                "\t\t\t\t\"parentSku\": \"BHCZH187\",\n" +
                "\t\t\t\t\"parentSkuId\": 38842,\n" +
                "\t\t\t\t\"colour\": \"Blue\",\n" +
                "\t\t\t\t\"size\": \"15G\",\n" +
                "\t\t\t\t\"cost\": 0.75,\n" +
                "\t\t\t\t\"weight\": 20.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"BHCZH187-N30G\",\n" +
                "\t\t\t\t\"parentSku\": \"BHCZH187\",\n" +
                "\t\t\t\t\"parentSkuId\": 38842,\n" +
                "\t\t\t\t\"colour\": \"Blue\",\n" +
                "\t\t\t\t\"size\": \"30G\",\n" +
                "\t\t\t\t\"cost\": 0.98,\n" +
                "\t\t\t\t\"weight\": 35.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"BHCZH187-N50G\",\n" +
                "\t\t\t\t\"parentSku\": \"BHCZH187\",\n" +
                "\t\t\t\t\"parentSkuId\": 38842,\n" +
                "\t\t\t\t\"colour\": \"Blue\",\n" +
                "\t\t\t\t\"size\": \"50G\",\n" +
                "\t\t\t\t\"cost\": 1.4,\n" +
                "\t\t\t\t\"weight\": 48.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38841,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"水蜜桃保湿护手霜\",\n" +
                "\t\t\"lastGoodCate\": \"护手霜(Hand Creams & Lotions)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"BHZHB63\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 11:24:34\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 11:25:27\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"BHZHB631\",\n" +
                "\t\t\t\t\"parentSku\": \"BHZHB63\",\n" +
                "\t\t\t\t\"parentSkuId\": 38841,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"1\",\n" +
                "\t\t\t\t\"cost\": 2.7,\n" +
                "\t\t\t\t\"weight\": 30.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"BHZHB632\",\n" +
                "\t\t\t\t\"parentSku\": \"BHZHB63\",\n" +
                "\t\t\t\t\"parentSkuId\": 38841,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"2\",\n" +
                "\t\t\t\t\"cost\": 2.7,\n" +
                "\t\t\t\t\"weight\": 40.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"BHZHB633\",\n" +
                "\t\t\t\t\"parentSku\": \"BHZHB63\",\n" +
                "\t\t\t\t\"parentSkuId\": 38841,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"3\",\n" +
                "\t\t\t\t\"cost\": 2.7,\n" +
                "\t\t\t\t\"weight\": 50.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"BHZHB634\",\n" +
                "\t\t\t\t\"parentSku\": \"BHZHB63\",\n" +
                "\t\t\t\t\"parentSkuId\": 38841,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"4\",\n" +
                "\t\t\t\t\"cost\": 2.7,\n" +
                "\t\t\t\t\"weight\": 30.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"BHZHB635\",\n" +
                "\t\t\t\t\"parentSku\": \"BHZHB63\",\n" +
                "\t\t\t\t\"parentSkuId\": 38841,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"5\",\n" +
                "\t\t\t\t\"cost\": 2.7,\n" +
                "\t\t\t\t\"weight\": 30.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38840,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"百搭斜挎包磨砂包\",\n" +
                "\t\t\"lastGoodCate\": \"手提/单肩/斜跨包(Handbags)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"XBCZH02D\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 11:07:39\",\n" +
                "\t\t\"checkedTime\": \"2019-11-16 15:57:35\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBCZH02D-H\",\n" +
                "\t\t\t\t\"parentSku\": \"XBCZH02D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38840,\n" +
                "\t\t\t\t\"colour\": \"Black\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 45.8,\n" +
                "\t\t\t\t\"weight\": 439.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBCZH02D-R\",\n" +
                "\t\t\t\t\"parentSku\": \"XBCZH02D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38840,\n" +
                "\t\t\t\t\"colour\": \"Red\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 45.8,\n" +
                "\t\t\t\t\"weight\": 439.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBCZH02D-N\",\n" +
                "\t\t\t\t\"parentSku\": \"XBCZH02D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38840,\n" +
                "\t\t\t\t\"colour\": \"Blue\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 45.8,\n" +
                "\t\t\t\t\"weight\": 439.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBCZH02D-KH\",\n" +
                "\t\t\t\t\"parentSku\": \"XBCZH02D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38840,\n" +
                "\t\t\t\t\"colour\": \"KH\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 45.8,\n" +
                "\t\t\t\t\"weight\": 439.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38839,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"绳头绳发饰BB夹\",\n" +
                "\t\t\"lastGoodCate\": \"发夹（造型辅助发夹，非装饰性发夹）(Hair Clips)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"BHCZH35D\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 10:35:54\",\n" +
                "\t\t\"checkedTime\": \"2019-11-16 15:58:57\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"BHCZH35DA\",\n" +
                "\t\t\t\t\"parentSku\": \"BHCZH35D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38839,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"A\",\n" +
                "\t\t\t\t\"cost\": 4.7,\n" +
                "\t\t\t\t\"weight\": 35.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"BHCZH35DB\",\n" +
                "\t\t\t\t\"parentSku\": \"BHCZH35D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38839,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"B\",\n" +
                "\t\t\t\t\"cost\": 5.2,\n" +
                "\t\t\t\t\"weight\": 35.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38838,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"不锈钢一体成型奶油裱花嘴\",\n" +
                "\t\t\"lastGoodCate\": \"烘培与面点工具(Baking & Pastry Tools)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"HGWYY995\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-15 10:22:32\",\n" +
                "\t\t\"checkedTime\": \"2019-12-02 18:13:08\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGWYY995-1672\",\n" +
                "\t\t\t\t\"parentSku\": \"HGWYY995\",\n" +
                "\t\t\t\t\"parentSkuId\": 38838,\n" +
                "\t\t\t\t\"colour\": \"1672\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 2.5,\n" +
                "\t\t\t\t\"weight\": 20.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGWYY995-1660\",\n" +
                "\t\t\t\t\"parentSku\": \"HGWYY995\",\n" +
                "\t\t\t\t\"parentSkuId\": 38838,\n" +
                "\t\t\t\t\"colour\": \"1660\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 2.5,\n" +
                "\t\t\t\t\"weight\": 20.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGWYY995-1665\",\n" +
                "\t\t\t\t\"parentSku\": \"HGWYY995\",\n" +
                "\t\t\t\t\"parentSkuId\": 38838,\n" +
                "\t\t\t\t\"colour\": \"1665\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 2.5,\n" +
                "\t\t\t\t\"weight\": 20.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGWYY995-1668\",\n" +
                "\t\t\t\t\"parentSku\": \"HGWYY995\",\n" +
                "\t\t\t\t\"parentSkuId\": 38838,\n" +
                "\t\t\t\t\"colour\": \"1668\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 2.5,\n" +
                "\t\t\t\t\"weight\": 20.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGWYY995-1671\",\n" +
                "\t\t\t\t\"parentSku\": \"HGWYY995\",\n" +
                "\t\t\t\t\"parentSkuId\": 38838,\n" +
                "\t\t\t\t\"colour\": \"1671\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 2.5,\n" +
                "\t\t\t\t\"weight\": 20.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGWYY995-1667\",\n" +
                "\t\t\t\t\"parentSku\": \"HGWYY995\",\n" +
                "\t\t\t\t\"parentSkuId\": 38838,\n" +
                "\t\t\t\t\"colour\": \"1667\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 2.5,\n" +
                "\t\t\t\t\"weight\": 20.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGWYY995-1669\",\n" +
                "\t\t\t\t\"parentSku\": \"HGWYY995\",\n" +
                "\t\t\t\t\"parentSkuId\": 38838,\n" +
                "\t\t\t\t\"colour\": \"1669\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 2.5,\n" +
                "\t\t\t\t\"weight\": 20.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38836,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"腋下专用超薄吸汗贴止汗贴吸汗除臭\",\n" +
                "\t\t\"lastGoodCate\": \"止汗(Deodorants)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"BHYJ566\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 20:06:18\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 10:31:42\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"BHYJ566-B\",\n" +
                "\t\t\t\t\"parentSku\": \"BHYJ566\",\n" +
                "\t\t\t\t\"parentSkuId\": 38836,\n" +
                "\t\t\t\t\"colour\": \"White\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 12,\n" +
                "\t\t\t\t\"weight\": 85.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"BHYJ566-Skinco\",\n" +
                "\t\t\t\t\"parentSku\": \"BHYJ566\",\n" +
                "\t\t\t\t\"parentSkuId\": 38836,\n" +
                "\t\t\t\t\"colour\": \"Skin color\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 12,\n" +
                "\t\t\t\t\"weight\": 85.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38834,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"婚礼手套珠片珠子勾指手套礼仪新娘手套舞会缎面绸缎手套防晒\",\n" +
                "\t\t\"lastGoodCate\": \"手臂套(Arm Warmers)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"FAHLYDFD\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 19:58:03\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 10:34:37\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FAHLYDFD1\",\n" +
                "\t\t\t\t\"parentSku\": \"FAHLYDFD\",\n" +
                "\t\t\t\t\"parentSkuId\": 38834,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"1\",\n" +
                "\t\t\t\t\"cost\": 9.9,\n" +
                "\t\t\t\t\"weight\": 50.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FAHLYDFD2\",\n" +
                "\t\t\t\t\"parentSku\": \"FAHLYDFD\",\n" +
                "\t\t\t\t\"parentSkuId\": 38834,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"2\",\n" +
                "\t\t\t\t\"cost\": 9.9,\n" +
                "\t\t\t\t\"weight\": 50.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FAHLYDFD3\",\n" +
                "\t\t\t\t\"parentSku\": \"FAHLYDFD\",\n" +
                "\t\t\t\t\"parentSkuId\": 38834,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"3\",\n" +
                "\t\t\t\t\"cost\": 9.9,\n" +
                "\t\t\t\t\"weight\": 50.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FAHLYDFD4\",\n" +
                "\t\t\t\t\"parentSku\": \"FAHLYDFD\",\n" +
                "\t\t\t\t\"parentSkuId\": 38834,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"4\",\n" +
                "\t\t\t\t\"cost\": 9.9,\n" +
                "\t\t\t\t\"weight\": 50.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38833,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"加厚吸水成人珊瑚绒浴帽素色速干毛巾干发帽\",\n" +
                "\t\t\"lastGoodCate\": \"毛巾/浴巾（婴儿用的请发布到婴儿毛巾下）(Towel)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"HGQXY780\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 19:43:45\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 10:35:02\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXY780-Z\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXY780\",\n" +
                "\t\t\t\t\"parentSkuId\": 38833,\n" +
                "\t\t\t\t\"colour\": \"Purple\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 5,\n" +
                "\t\t\t\t\"weight\": 88.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXY780-FR\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXY780\",\n" +
                "\t\t\t\t\"parentSkuId\": 38833,\n" +
                "\t\t\t\t\"colour\": \"Pink\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 5,\n" +
                "\t\t\t\t\"weight\": 88.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXY780-L\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXY780\",\n" +
                "\t\t\t\t\"parentSkuId\": 38833,\n" +
                "\t\t\t\t\"colour\": \"Green\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 5,\n" +
                "\t\t\t\t\"weight\": 88.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXY780-Khaki\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXY780\",\n" +
                "\t\t\t\t\"parentSkuId\": 38833,\n" +
                "\t\t\t\t\"colour\": \"Khaki\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 5,\n" +
                "\t\t\t\t\"weight\": 88.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38832,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"山地自行车多功能组合工具 内六角16合1折叠维修工具修车工具\",\n" +
                "\t\t\"lastGoodCate\": \"手动工具组合(Hand Tool Sets)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"GJHLYDC8\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 19:37:01\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 10:48:21\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"GJHLYDC81\",\n" +
                "\t\t\t\t\"parentSku\": \"GJHLYDC8\",\n" +
                "\t\t\t\t\"parentSkuId\": 38832,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"1\",\n" +
                "\t\t\t\t\"cost\": 3.9,\n" +
                "\t\t\t\t\"weight\": 260.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38831,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"牙刷置物架免打孔漱口杯刷牙杯挂墙式卫生间吸壁式壁挂牙缸架\",\n" +
                "\t\t\"lastGoodCate\": \"浴室置物架、盒(Storage Shelves & Holders)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"HGMJJ659\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 19:33:29\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 10:48:36\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGMJJ659-N\",\n" +
                "\t\t\t\t\"parentSku\": \"HGMJJ659\",\n" +
                "\t\t\t\t\"parentSkuId\": 38831,\n" +
                "\t\t\t\t\"colour\": \"Blue\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 7.6,\n" +
                "\t\t\t\t\"weight\": 250.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGMJJ659-YH\",\n" +
                "\t\t\t\t\"parentSku\": \"HGMJJ659\",\n" +
                "\t\t\t\t\"parentSkuId\": 38831,\n" +
                "\t\t\t\t\"colour\": \"Grey\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 7.6,\n" +
                "\t\t\t\t\"weight\": 250.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGMJJ659-FR\",\n" +
                "\t\t\t\t\"parentSku\": \"HGMJJ659\",\n" +
                "\t\t\t\t\"parentSkuId\": 38831,\n" +
                "\t\t\t\t\"colour\": \"Pink\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 7.6,\n" +
                "\t\t\t\t\"weight\": 250.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38830,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"卫生间马桶刷创意双面塑料多用无死角长柄洁厕刷清洁刷\",\n" +
                "\t\t\"lastGoodCate\": \"马桶刷(Toilet Brush Holders)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"HZQXY400\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 19:30:13\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 10:41:50\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HZQXY400-N\",\n" +
                "\t\t\t\t\"parentSku\": \"HZQXY400\",\n" +
                "\t\t\t\t\"parentSkuId\": 38830,\n" +
                "\t\t\t\t\"colour\": \"Blue\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 1.7,\n" +
                "\t\t\t\t\"weight\": 95.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HZQXY400-RoseR\",\n" +
                "\t\t\t\t\"parentSku\": \"HZQXY400\",\n" +
                "\t\t\t\t\"parentSkuId\": 38830,\n" +
                "\t\t\t\t\"colour\": \"Rose Red\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 1.7,\n" +
                "\t\t\t\t\"weight\": 95.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HZQXY400-Fluor\",\n" +
                "\t\t\t\t\"parentSku\": \"HZQXY400\",\n" +
                "\t\t\t\t\"parentSkuId\": 38830,\n" +
                "\t\t\t\t\"colour\": \"Fluorescent green\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 1.7,\n" +
                "\t\t\t\t\"weight\": 95.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38829,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"仙人掌系列磁性书签\",\n" +
                "\t\t\"lastGoodCate\": \"书签(Bookmark)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"WJHLZ166\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 19:18:45\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 10:43:40\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"WJHLZ166\",\n" +
                "\t\t\t\t\"parentSku\": \"WJHLZ166\",\n" +
                "\t\t\t\t\"parentSkuId\": 38829,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 2,\n" +
                "\t\t\t\t\"weight\": 18.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38828,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"礼品盒黑色牛皮纸盒\",\n" +
                "\t\t\"lastGoodCate\": \"收纳盒和收纳箱（有关婴儿食品储存的请发布到婴儿食品存储盒下）(Storage Boxes & Bins)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"HGWXQD56\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 19:16:03\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 10:45:15\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGWXQD5665653cm\",\n" +
                "\t\t\t\t\"parentSku\": \"HGWXQD56\",\n" +
                "\t\t\t\t\"parentSkuId\": 38828,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"6.5*6.5*3cm\",\n" +
                "\t\t\t\t\"cost\": 0.55,\n" +
                "\t\t\t\t\"weight\": 350.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGWXQD56964cm\",\n" +
                "\t\t\t\t\"parentSku\": \"HGWXQD56\",\n" +
                "\t\t\t\t\"parentSkuId\": 38828,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"9*6*4cm\",\n" +
                "\t\t\t\t\"cost\": 0.75,\n" +
                "\t\t\t\t\"weight\": 350.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGWXQD56106864\",\n" +
                "\t\t\t\t\"parentSku\": \"HGWXQD56\",\n" +
                "\t\t\t\t\"parentSkuId\": 38828,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"10.6*8.6*4cm\",\n" +
                "\t\t\t\t\"cost\": 0.85,\n" +
                "\t\t\t\t\"weight\": 350.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGWXQD561473cm\",\n" +
                "\t\t\t\t\"parentSku\": \"HGWXQD56\",\n" +
                "\t\t\t\t\"parentSkuId\": 38828,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"14*7*3cm\",\n" +
                "\t\t\t\t\"cost\": 0.8,\n" +
                "\t\t\t\t\"weight\": 350.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38827,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"韩国成人可爱蝴蝶结加厚浴帽擦头发速干毛巾吸水干发巾\",\n" +
                "\t\t\"lastGoodCate\": \"毛巾/浴巾（婴儿用的请发布到婴儿毛巾下）(Towel)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"HGQXYA02\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 19:07:29\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 10:57:36\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXYA02-Khaki\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXYA02\",\n" +
                "\t\t\t\t\"parentSkuId\": 38827,\n" +
                "\t\t\t\t\"colour\": \"Khaki\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 7.2,\n" +
                "\t\t\t\t\"weight\": 82.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXYA02-Lotus\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXYA02\",\n" +
                "\t\t\t\t\"parentSkuId\": 38827,\n" +
                "\t\t\t\t\"colour\": \"Lotus color\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 7.2,\n" +
                "\t\t\t\t\"weight\": 82.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXYA02-coffee\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXYA02\",\n" +
                "\t\t\t\t\"parentSkuId\": 38827,\n" +
                "\t\t\t\t\"colour\": \"coffee\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 7.2,\n" +
                "\t\t\t\t\"weight\": 82.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38826,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"塑料盒透明小盒子 收纳盒 气垫粉扑盒\",\n" +
                "\t\t\"lastGoodCate\": \"收纳盒和收纳箱（有关婴儿食品储存的请发布到婴儿食品存储盒下）(Storage Boxes & Bins)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"HGWXQ57D\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 18:45:03\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 10:58:30\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGWXQ57D-B\",\n" +
                "\t\t\t\t\"parentSku\": \"HGWXQ57D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38826,\n" +
                "\t\t\t\t\"colour\": \"White\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 0.6,\n" +
                "\t\t\t\t\"weight\": 40.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38825,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"女可爱速干吸水毛巾干发帽包头巾\",\n" +
                "\t\t\"lastGoodCate\": \"毛巾/浴巾（婴儿用的请发布到婴儿毛巾下）(Towel)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"HGQXY348\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 18:42:32\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 10:59:24\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXY348-FR\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXY348\",\n" +
                "\t\t\t\t\"parentSkuId\": 38825,\n" +
                "\t\t\t\t\"colour\": \"Pink\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 5.6,\n" +
                "\t\t\t\t\"weight\": 72.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXY348-YH\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXY348\",\n" +
                "\t\t\t\t\"parentSkuId\": 38825,\n" +
                "\t\t\t\t\"colour\": \"Grey\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 5.6,\n" +
                "\t\t\t\t\"weight\": 72.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXY348-N\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXY348\",\n" +
                "\t\t\t\t\"parentSkuId\": 38825,\n" +
                "\t\t\t\t\"colour\": \"Blue\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 5.6,\n" +
                "\t\t\t\t\"weight\": 72.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXY348-light\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXY348\",\n" +
                "\t\t\t\t\"parentSkuId\": 38825,\n" +
                "\t\t\t\t\"colour\": \"light purple\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 5.6,\n" +
                "\t\t\t\t\"weight\": 72.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38824,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"新款流行镶钻水钻双桃心项链耳环套装\",\n" +
                "\t\t\"lastGoodCate\": \"首饰套装(Jewelry Sets)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"JEWCM3FF\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 18:33:11\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 10:59:57\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"JEWCM3FF-J\",\n" +
                "\t\t\t\t\"parentSku\": \"JEWCM3FF\",\n" +
                "\t\t\t\t\"parentSkuId\": 38824,\n" +
                "\t\t\t\t\"colour\": \"Gold\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 4.3,\n" +
                "\t\t\t\t\"weight\": 15.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"JEWCM3FF-Silver\",\n" +
                "\t\t\t\t\"parentSku\": \"JEWCM3FF\",\n" +
                "\t\t\t\t\"parentSkuId\": 38824,\n" +
                "\t\t\t\t\"colour\": \"Silver\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 4.3,\n" +
                "\t\t\t\t\"weight\": 15.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38821,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"旅行包三件套\",\n" +
                "\t\t\"lastGoodCate\": \"化妆包(Cosmetic Bags & Cases)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"XBXF4CD\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 17:28:02\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 11:03:11\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBXF4CD-L\",\n" +
                "\t\t\t\t\"parentSku\": \"XBXF4CD\",\n" +
                "\t\t\t\t\"parentSkuId\": 38821,\n" +
                "\t\t\t\t\"colour\": \"Green\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 8.5,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBXF4CD-FR\",\n" +
                "\t\t\t\t\"parentSku\": \"XBXF4CD\",\n" +
                "\t\t\t\t\"parentSkuId\": 38821,\n" +
                "\t\t\t\t\"colour\": \"Pink\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 8.5,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBXF4CD-N\",\n" +
                "\t\t\t\t\"parentSku\": \"XBXF4CD\",\n" +
                "\t\t\t\t\"parentSkuId\": 38821,\n" +
                "\t\t\t\t\"colour\": \"Blue\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 8.5,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBXF4CD-Z\",\n" +
                "\t\t\t\t\"parentSku\": \"XBXF4CD\",\n" +
                "\t\t\t\t\"parentSkuId\": 38821,\n" +
                "\t\t\t\t\"colour\": \"Purple\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 8.5,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBXF4CD-YH\",\n" +
                "\t\t\t\t\"parentSku\": \"XBXF4CD\",\n" +
                "\t\t\t\t\"parentSkuId\": 38821,\n" +
                "\t\t\t\t\"colour\": \"Grey\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 8.5,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBXF4CD-Navy\",\n" +
                "\t\t\t\t\"parentSku\": \"XBXF4CD\",\n" +
                "\t\t\t\t\"parentSkuId\": 38821,\n" +
                "\t\t\t\t\"colour\": \"Navy\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 8.5,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38820,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"女士成人长发洗澡沐浴防水头套厨房帽子防油烟帽\",\n" +
                "\t\t\"lastGoodCate\": \"浴帽（婴儿的请发布到婴儿洗头帽下）(Shower Caps)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"HGQXY640\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 17:20:17\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 11:07:59\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXY640-YH\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXY640\",\n" +
                "\t\t\t\t\"parentSkuId\": 38820,\n" +
                "\t\t\t\t\"colour\": \"Grey\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 2.2,\n" +
                "\t\t\t\t\"weight\": 26.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXY640-FR\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXY640\",\n" +
                "\t\t\t\t\"parentSkuId\": 38820,\n" +
                "\t\t\t\t\"colour\": \"Pink\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 2.2,\n" +
                "\t\t\t\t\"weight\": 26.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXY640-champ\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXY640\",\n" +
                "\t\t\t\t\"parentSkuId\": 38820,\n" +
                "\t\t\t\t\"colour\": \"champagne\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 2.2,\n" +
                "\t\t\t\t\"weight\": 26.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38819,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"秋冬爆款性感长袖t恤打底上衣\",\n" +
                "\t\t\"lastGoodCate\": \"长内衣裤(Long Johns)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"FALZJ96D\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 17:19:00\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 11:08:32\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ96D-HS\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ96D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38819,\n" +
                "\t\t\t\t\"colour\": \"Black\",\n" +
                "\t\t\t\t\"size\": \"S\",\n" +
                "\t\t\t\t\"cost\": 21,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ96D-HM\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ96D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38819,\n" +
                "\t\t\t\t\"colour\": \"Black\",\n" +
                "\t\t\t\t\"size\": \"M\",\n" +
                "\t\t\t\t\"cost\": 21,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ96D-HL\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ96D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38819,\n" +
                "\t\t\t\t\"colour\": \"Black\",\n" +
                "\t\t\t\t\"size\": \"L\",\n" +
                "\t\t\t\t\"cost\": 21,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ96D-HXL\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ96D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38819,\n" +
                "\t\t\t\t\"colour\": \"Black\",\n" +
                "\t\t\t\t\"size\": \"XL\",\n" +
                "\t\t\t\t\"cost\": 21,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ96D-RS\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ96D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38819,\n" +
                "\t\t\t\t\"colour\": \"Red\",\n" +
                "\t\t\t\t\"size\": \"S\",\n" +
                "\t\t\t\t\"cost\": 21,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ96D-RM\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ96D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38819,\n" +
                "\t\t\t\t\"colour\": \"Red\",\n" +
                "\t\t\t\t\"size\": \"M\",\n" +
                "\t\t\t\t\"cost\": 21,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ96D-RL\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ96D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38819,\n" +
                "\t\t\t\t\"colour\": \"Red\",\n" +
                "\t\t\t\t\"size\": \"L\",\n" +
                "\t\t\t\t\"cost\": 21,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ96D-RXL\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ96D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38819,\n" +
                "\t\t\t\t\"colour\": \"Red\",\n" +
                "\t\t\t\t\"size\": \"XL\",\n" +
                "\t\t\t\t\"cost\": 21,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ96D-BS\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ96D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38819,\n" +
                "\t\t\t\t\"colour\": \"White\",\n" +
                "\t\t\t\t\"size\": \"S\",\n" +
                "\t\t\t\t\"cost\": 21,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ96D-BM\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ96D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38819,\n" +
                "\t\t\t\t\"colour\": \"White\",\n" +
                "\t\t\t\t\"size\": \"M\",\n" +
                "\t\t\t\t\"cost\": 21,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ96D-BL\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ96D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38819,\n" +
                "\t\t\t\t\"colour\": \"White\",\n" +
                "\t\t\t\t\"size\": \"L\",\n" +
                "\t\t\t\t\"cost\": 21,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ96D-BXL\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ96D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38819,\n" +
                "\t\t\t\t\"colour\": \"White\",\n" +
                "\t\t\t\t\"size\": \"XL\",\n" +
                "\t\t\t\t\"cost\": 21,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ96D-NS\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ96D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38819,\n" +
                "\t\t\t\t\"colour\": \"Blue\",\n" +
                "\t\t\t\t\"size\": \"S\",\n" +
                "\t\t\t\t\"cost\": 21,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ96D-NM\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ96D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38819,\n" +
                "\t\t\t\t\"colour\": \"Blue\",\n" +
                "\t\t\t\t\"size\": \"M\",\n" +
                "\t\t\t\t\"cost\": 21,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ96D-NL\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ96D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38819,\n" +
                "\t\t\t\t\"colour\": \"Blue\",\n" +
                "\t\t\t\t\"size\": \"L\",\n" +
                "\t\t\t\t\"cost\": 21,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ96D-NXL\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ96D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38819,\n" +
                "\t\t\t\t\"colour\": \"Blue\",\n" +
                "\t\t\t\t\"size\": \"XL\",\n" +
                "\t\t\t\t\"cost\": 21,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ96D-LS\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ96D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38819,\n" +
                "\t\t\t\t\"colour\": \"Green\",\n" +
                "\t\t\t\t\"size\": \"S\",\n" +
                "\t\t\t\t\"cost\": 21,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ96D-LM\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ96D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38819,\n" +
                "\t\t\t\t\"colour\": \"Green\",\n" +
                "\t\t\t\t\"size\": \"M\",\n" +
                "\t\t\t\t\"cost\": 21,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ96D-LL\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ96D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38819,\n" +
                "\t\t\t\t\"colour\": \"Green\",\n" +
                "\t\t\t\t\"size\": \"L\",\n" +
                "\t\t\t\t\"cost\": 21,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"FALZJ96D-LXL\",\n" +
                "\t\t\t\t\"parentSku\": \"FALZJ96D\",\n" +
                "\t\t\t\t\"parentSkuId\": 38819,\n" +
                "\t\t\t\t\"colour\": \"Green\",\n" +
                "\t\t\t\t\"size\": \"XL\",\n" +
                "\t\t\t\t\"cost\": 21,\n" +
                "\t\t\t\t\"weight\": 180.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38817,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"家用素雅防水粘扣式马桶垫圈加厚舒适保暖坐便套贴\",\n" +
                "\t\t\"lastGoodCate\": \"马桶盖套(Toilet Seat Cover)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"HGQXYEFC\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 17:08:20\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 11:09:38\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXYEFC-Z\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXYEFC\",\n" +
                "\t\t\t\t\"parentSkuId\": 38817,\n" +
                "\t\t\t\t\"colour\": \"Purple\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 4.99,\n" +
                "\t\t\t\t\"weight\": 120.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXYEFC-N\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXYEFC\",\n" +
                "\t\t\t\t\"parentSkuId\": 38817,\n" +
                "\t\t\t\t\"colour\": \"Blue\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 4.99,\n" +
                "\t\t\t\t\"weight\": 120.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXYEFC-FR\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXYEFC\",\n" +
                "\t\t\t\t\"parentSkuId\": 38817,\n" +
                "\t\t\t\t\"colour\": \"Pink\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 4.99,\n" +
                "\t\t\t\t\"weight\": 120.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38816,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"桃心人造貂毛耳环耳钉\",\n" +
                "\t\t\"lastGoodCate\": \"耳饰(Earrings)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"JEYJ448\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 17:01:12\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 11:27:34\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"JEYJ448-B\",\n" +
                "\t\t\t\t\"parentSku\": \"JEYJ448\",\n" +
                "\t\t\t\t\"parentSkuId\": 38816,\n" +
                "\t\t\t\t\"colour\": \"White\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 6.5,\n" +
                "\t\t\t\t\"weight\": 5.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"JEYJ448-Y\",\n" +
                "\t\t\t\t\"parentSku\": \"JEYJ448\",\n" +
                "\t\t\t\t\"parentSkuId\": 38816,\n" +
                "\t\t\t\t\"colour\": \"Yellow\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 6.5,\n" +
                "\t\t\t\t\"weight\": 5.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"JEYJ448-L\",\n" +
                "\t\t\t\t\"parentSku\": \"JEYJ448\",\n" +
                "\t\t\t\t\"parentSkuId\": 38816,\n" +
                "\t\t\t\t\"colour\": \"Green\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 6.5,\n" +
                "\t\t\t\t\"weight\": 5.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"JEYJ448-FR\",\n" +
                "\t\t\t\t\"parentSku\": \"JEYJ448\",\n" +
                "\t\t\t\t\"parentSkuId\": 38816,\n" +
                "\t\t\t\t\"colour\": \"Pink\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 6.5,\n" +
                "\t\t\t\t\"weight\": 5.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38815,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"加厚粘扣式超柔水貂绒压花马桶垫坐便套\",\n" +
                "\t\t\"lastGoodCate\": \"马桶盖套(Toilet Seat Cover)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"HGQXYAC8\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 16:59:39\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 11:27:43\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXYAC8-R\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXYAC8\",\n" +
                "\t\t\t\t\"parentSkuId\": 38815,\n" +
                "\t\t\t\t\"colour\": \"Red\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 5,\n" +
                "\t\t\t\t\"weight\": 120.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXYAC8-N\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXYAC8\",\n" +
                "\t\t\t\t\"parentSkuId\": 38815,\n" +
                "\t\t\t\t\"colour\": \"Blue\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 5,\n" +
                "\t\t\t\t\"weight\": 120.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXYAC8-Khaki\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXYAC8\",\n" +
                "\t\t\t\t\"parentSkuId\": 38815,\n" +
                "\t\t\t\t\"colour\": \"Khaki\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 5,\n" +
                "\t\t\t\t\"weight\": 120.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXYAC8-Violet\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXYAC8\",\n" +
                "\t\t\t\t\"parentSkuId\": 38815,\n" +
                "\t\t\t\t\"colour\": \"Violet\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 5,\n" +
                "\t\t\t\t\"weight\": 120.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38814,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"perfect for you 钱包女拉链零钱包\",\n" +
                "\t\t\"lastGoodCate\": \"钱包(Wallets)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"XBZJK7F7\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 16:59:20\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 11:28:39\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBZJK7F7-A\",\n" +
                "\t\t\t\t\"parentSku\": \"XBZJK7F7\",\n" +
                "\t\t\t\t\"parentSkuId\": 38814,\n" +
                "\t\t\t\t\"colour\": \"black\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 18,\n" +
                "\t\t\t\t\"weight\": 85.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBZJK7F7-B\",\n" +
                "\t\t\t\t\"parentSku\": \"XBZJK7F7\",\n" +
                "\t\t\t\t\"parentSkuId\": 38814,\n" +
                "\t\t\t\t\"colour\": \"pink\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 18,\n" +
                "\t\t\t\t\"weight\": 85.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBZJK7F7-C\",\n" +
                "\t\t\t\t\"parentSku\": \"XBZJK7F7\",\n" +
                "\t\t\t\t\"parentSkuId\": 38814,\n" +
                "\t\t\t\t\"colour\": \"grey\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 18,\n" +
                "\t\t\t\t\"weight\": 85.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBZJK7F7-D\",\n" +
                "\t\t\t\t\"parentSku\": \"XBZJK7F7\",\n" +
                "\t\t\t\t\"parentSkuId\": 38814,\n" +
                "\t\t\t\t\"colour\": \"green\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 18,\n" +
                "\t\t\t\t\"weight\": 85.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBZJK7F7-E\",\n" +
                "\t\t\t\t\"parentSku\": \"XBZJK7F7\",\n" +
                "\t\t\t\t\"parentSkuId\": 38814,\n" +
                "\t\t\t\t\"colour\": \"blue\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 18,\n" +
                "\t\t\t\t\"weight\": 85.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"XBZJK7F7-F\",\n" +
                "\t\t\t\t\"parentSku\": \"XBZJK7F7\",\n" +
                "\t\t\t\t\"parentSkuId\": 38814,\n" +
                "\t\t\t\t\"colour\": \"wine red\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 18,\n" +
                "\t\t\t\t\"weight\": 85.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38813,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"家用粘扣式防水加厚保暖座便器套马桶坐垫贴\",\n" +
                "\t\t\"lastGoodCate\": \"马桶盖套(Toilet Seat Cover)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"HGQXY06E\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 16:49:19\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 11:28:50\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXY06E-R\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXY06E\",\n" +
                "\t\t\t\t\"parentSkuId\": 38813,\n" +
                "\t\t\t\t\"colour\": \"Red\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 5.5,\n" +
                "\t\t\t\t\"weight\": 130.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXY06E-Z\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXY06E\",\n" +
                "\t\t\t\t\"parentSkuId\": 38813,\n" +
                "\t\t\t\t\"colour\": \"Purple\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 5.5,\n" +
                "\t\t\t\t\"weight\": 130.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXY06E-YH\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXY06E\",\n" +
                "\t\t\t\t\"parentSkuId\": 38813,\n" +
                "\t\t\t\t\"colour\": \"Grey\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 5.5,\n" +
                "\t\t\t\t\"weight\": 130.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXY06E-Khaki\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXY06E\",\n" +
                "\t\t\t\t\"parentSkuId\": 38813,\n" +
                "\t\t\t\t\"colour\": \"Khaki\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 5.5,\n" +
                "\t\t\t\t\"weight\": 130.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38812,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"陶瓷水果刀削皮器菜板砧板家用厨房三件套\",\n" +
                "\t\t\"lastGoodCate\": \"餐具套装(Dinnerware Sets)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"HGBCEAE\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 16:39:42\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 11:31:12\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGBCEAE-N\",\n" +
                "\t\t\t\t\"parentSku\": \"HGBCEAE\",\n" +
                "\t\t\t\t\"parentSkuId\": 38812,\n" +
                "\t\t\t\t\"colour\": \"Blue\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 4.9,\n" +
                "\t\t\t\t\"weight\": 190.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGBCEAE-L\",\n" +
                "\t\t\t\t\"parentSku\": \"HGBCEAE\",\n" +
                "\t\t\t\t\"parentSkuId\": 38812,\n" +
                "\t\t\t\t\"colour\": \"Green\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 4.9,\n" +
                "\t\t\t\t\"weight\": 190.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGBCEAE-FR\",\n" +
                "\t\t\t\t\"parentSku\": \"HGBCEAE\",\n" +
                "\t\t\t\t\"parentSkuId\": 38812,\n" +
                "\t\t\t\t\"colour\": \"Pink\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 4.9,\n" +
                "\t\t\t\t\"weight\": 190.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38811,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"唯美软面抄小本子\",\n" +
                "\t\t\"lastGoodCate\": \"笔记本(Notebook)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"WJHLZ9A6\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 16:39:20\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 11:32:05\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"WJHLZ9A6C\",\n" +
                "\t\t\t\t\"parentSku\": \"WJHLZ9A6\",\n" +
                "\t\t\t\t\"parentSkuId\": 38811,\n" +
                "\t\t\t\t\"colour\": \"cactus series\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 0.21,\n" +
                "\t\t\t\t\"weight\": 15.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"WJHLZ9A6P\",\n" +
                "\t\t\t\t\"parentSku\": \"WJHLZ9A6\",\n" +
                "\t\t\t\t\"parentSkuId\": 38811,\n" +
                "\t\t\t\t\"colour\": \"plant series\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 0.21,\n" +
                "\t\t\t\t\"weight\": 15.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"WJHLZ9A6B\",\n" +
                "\t\t\t\t\"parentSku\": \"WJHLZ9A6\",\n" +
                "\t\t\t\t\"parentSkuId\": 38811,\n" +
                "\t\t\t\t\"colour\": \"pineapple series\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 0.21,\n" +
                "\t\t\t\t\"weight\": 15.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"WJHLZ9A6F\",\n" +
                "\t\t\t\t\"parentSku\": \"WJHLZ9A6\",\n" +
                "\t\t\t\t\"parentSkuId\": 38811,\n" +
                "\t\t\t\t\"colour\": \"fruit series\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 0.21,\n" +
                "\t\t\t\t\"weight\": 15.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"WJHLZ9A6H\",\n" +
                "\t\t\t\t\"parentSku\": \"WJHLZ9A6\",\n" +
                "\t\t\t\t\"parentSkuId\": 38811,\n" +
                "\t\t\t\t\"colour\": \"flamingo series\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 0.21,\n" +
                "\t\t\t\t\"weight\": 15.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"WJHLZ9A6Y\",\n" +
                "\t\t\t\t\"parentSku\": \"WJHLZ9A6\",\n" +
                "\t\t\t\t\"parentSkuId\": 38811,\n" +
                "\t\t\t\t\"colour\": \"cherry blossom series\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 0.21,\n" +
                "\t\t\t\t\"weight\": 15.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38810,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"裂可宁霜 手脚防冻防裂防干燥滋润护手霜\",\n" +
                "\t\t\"lastGoodCate\": \"护手霜(Hand Creams & Lotions)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"BHZHED8\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 16:28:55\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 11:32:41\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"BHZHED833g\",\n" +
                "\t\t\t\t\"parentSku\": \"BHZHED8\",\n" +
                "\t\t\t\t\"parentSkuId\": 38810,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"33g\",\n" +
                "\t\t\t\t\"cost\": 1.7,\n" +
                "\t\t\t\t\"weight\": 33.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"BHZHED855g\",\n" +
                "\t\t\t\t\"parentSku\": \"BHZHED8\",\n" +
                "\t\t\t\t\"parentSkuId\": 38810,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"55g\",\n" +
                "\t\t\t\t\"cost\": 2.3,\n" +
                "\t\t\t\t\"weight\": 55.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"BHZHED885g\",\n" +
                "\t\t\t\t\"parentSku\": \"BHZHED8\",\n" +
                "\t\t\t\t\"parentSkuId\": 38810,\n" +
                "\t\t\t\t\"colour\": null,\n" +
                "\t\t\t\t\"size\": \"85g\",\n" +
                "\t\t\t\t\"cost\": 2.8,\n" +
                "\t\t\t\t\"weight\": 85.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38808,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"创意磨砂插画大肚杯可爱卡通不锈钢保温杯儿童水杯\",\n" +
                "\t\t\"lastGoodCate\": \"水瓶和水壶(Water Bottles)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"HGBCE25\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 15:15:12\",\n" +
                "\t\t\"checkedTime\": \"2019-11-16 09:30:33\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGBCE25-L\",\n" +
                "\t\t\t\t\"parentSku\": \"HGBCE25\",\n" +
                "\t\t\t\t\"parentSkuId\": 38808,\n" +
                "\t\t\t\t\"colour\": \"Green\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 6.78,\n" +
                "\t\t\t\t\"weight\": 260.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGBCE25-MH\",\n" +
                "\t\t\t\t\"parentSku\": \"HGBCE25\",\n" +
                "\t\t\t\t\"parentSkuId\": 38808,\n" +
                "\t\t\t\t\"colour\": \"Beige\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 6.78,\n" +
                "\t\t\t\t\"weight\": 260.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGBCE25-FR\",\n" +
                "\t\t\t\t\"parentSku\": \"HGBCE25\",\n" +
                "\t\t\t\t\"parentSkuId\": 38808,\n" +
                "\t\t\t\t\"colour\": \"Pink\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 6.78,\n" +
                "\t\t\t\t\"weight\": 260.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGBCE25-greybl\",\n" +
                "\t\t\t\t\"parentSku\": \"HGBCE25\",\n" +
                "\t\t\t\t\"parentSkuId\": 38808,\n" +
                "\t\t\t\t\"colour\": \"grey&blue\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 6.78,\n" +
                "\t\t\t\t\"weight\": 260.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38806,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"糖果色创意自行车闹钟学生礼品\",\n" +
                "\t\t\"lastGoodCate\": \"闹钟(Alarm Clocks)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"HGBC018\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 14:47:02\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 11:39:01\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGBC018-N\",\n" +
                "\t\t\t\t\"parentSku\": \"HGBC018\",\n" +
                "\t\t\t\t\"parentSkuId\": 38806,\n" +
                "\t\t\t\t\"colour\": \"Blue\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 5.9,\n" +
                "\t\t\t\t\"weight\": 155.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGBC018-L\",\n" +
                "\t\t\t\t\"parentSku\": \"HGBC018\",\n" +
                "\t\t\t\t\"parentSkuId\": 38806,\n" +
                "\t\t\t\t\"colour\": \"Green\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 5.9,\n" +
                "\t\t\t\t\"weight\": 155.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGBC018-FR\",\n" +
                "\t\t\t\t\"parentSku\": \"HGBC018\",\n" +
                "\t\t\t\t\"parentSkuId\": 38806,\n" +
                "\t\t\t\t\"colour\": \"Pink\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 5.9,\n" +
                "\t\t\t\t\"weight\": 155.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\": 38805,\n" +
                "\t\t\"url\": null,\n" +
                "\t\t\"cnProductTitle\": \"多功能创意桌面浴室防水家用纸巾盒竹炭包马卡龙色抽纸盒\",\n" +
                "\t\t\"lastGoodCate\": \"纸巾盒(Tissue Boxes)\",\n" +
                "\t\t\"sourceType\": 1,\n" +
                "\t\t\"sku\": \"HGQXY7A1\",\n" +
                "\t\t\"platformIdIn13\": 0,\n" +
                "\t\t\"tort\": 0,\n" +
                "\t\t\"severityTort\": 0,\n" +
                "\t\t\"createdTime\": \"2019-11-14 14:33:07\",\n" +
                "\t\t\"checkedTime\": \"2019-11-15 11:39:13\",\n" +
                "\t\t\"productVos\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXY7A1-Cherr\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXY7A1\",\n" +
                "\t\t\t\t\"parentSkuId\": 38805,\n" +
                "\t\t\t\t\"colour\": \"Cherry powder\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 13.5,\n" +
                "\t\t\t\t\"weight\": 478.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXY7A1-Azure\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXY7A1\",\n" +
                "\t\t\t\t\"parentSkuId\": 38805,\n" +
                "\t\t\t\t\"colour\": \"Azure blue\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 13.5,\n" +
                "\t\t\t\t\"weight\": 478.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"sku\": \"HGQXY7A1-Nordi\",\n" +
                "\t\t\t\t\"parentSku\": \"HGQXY7A1\",\n" +
                "\t\t\t\t\"parentSkuId\": 38805,\n" +
                "\t\t\t\t\"colour\": \"Nordic green\",\n" +
                "\t\t\t\t\"size\": null,\n" +
                "\t\t\t\t\"cost\": 13.5,\n" +
                "\t\t\t\t\"weight\": 478.0,\n" +
                "\t\t\t\t\"number\": null,\n" +
                "\t\t\t\t\"used\": \"0\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"platformTortList\": null\n" +
                "\t}\n" +
                "]";


//        JSONObject jsonObject = JSONUtil.parseObj(prodArr);
        List<String> pskus = CollUtil.newArrayList();
        List<Integer> pskuIds = CollUtil.newArrayList();
        List<String> usrls = CollUtil.newArrayList();
        JSONArray jsonArray = JSONUtil.parseArray(prodArr);
        for (Object o:jsonArray){
            JSONObject j1 = JSONUtil.parseObj(o);
            Integer id = j1.getInt("id");
            String psku = j1.getStr("sku");
            String url = j1.getStr("url");
            pskuIds.add(id);
            pskus.add(psku);
            usrls.add(url);
        }
        System.out.println(pskuIds +"\n" +"pskuIds size:"+pskuIds.size());
        System.out.println(pskus+"\n" +"pskus size:"+pskus.size());
        System.out.println(usrls+"\n" +"usrls size:"+usrls.size());
    }

}
