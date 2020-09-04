package com.andy.demo.jsontest;

import cn.hutool.json.JSONUtil;
import lombok.Data;

/**
 * @author: weipeng
 * @create: 2020-04-17 16:30
 * @description:
 */
public class StationTest {
    public static void main(String[] args) {
        String s = "{\n" +
                "\t\"prod_desc\": \"Designed for high endurance so you can record for up to 20,000 hours with no worries (Actual hours of video saved less. Up to 20,000 hours for 256GB; 10,000 hours for 128GB; 5,000 hours for 64GB; and 2,500 hours for 32GB.)\\r\\nBuilt for and tested in harsh conditions; temperature-proof, waterproof, shockproof and x-ray-proof(2)\\r\\nSave more videos with capacities up to 256GB (1GB = 1,000,000,000 bytes. Actual user storage less.)\\r\\nRecord and save more Full HD or 4K videos(3) with capacities up to 256GB (Compatible device required. Full HD (1920x1080) and/or 4K UHD (3840x2160) video support may vary based on host device, file attributes, usage conditions and other factors.)\",\n" +
                "\t\"createdByName\": \"李华田\",\n" +
                "\t\"prod_country\": \"Russian Federation\",\n" +
                "\t\"create_time\": \"2020-04-17 16:25:48\",\n" +
                "\t\"prod_url\": \"https://www.vova.com/Zozo-Maxv-Micro-Sd-Card-32gb-High-Speed-Class-10-Memory-Card-With-SN1561373529877110939425220-g9878604-m11283661/\",\n" +
                "\t\"prod_price\": \"240,09:руб.\",\n" +
                "\t\"img_list\": \"['https://image-tb.vova.com/image/1000_1000/filler/60/62/28811dfffa786210e769c5001f2b6062.jpg', 'https://image-tb.vova.com/image/1000_1000/filler/a8/45/38a5d0347214ba1d5f8af18a3a58a845.jpg', 'https://image-tb.vova.com/image/1000_1000/filler/9b/69/e3c4a1f88421479c882c394df00c9b69.jpg', 'https://image-tb.vova.com/image/1000_1000/filler/4d/70/6a1730ee688fb07028ba27948f5d4d70.jpg']\",\n" +
                "\t\"prod_lang\": \"EN\",\n" +
                "\t\"prod_title\": \"ZOZO MAXV Micro SD Card 32GB High Speed Class 10 Memory Card with Adapter Standard Packaging High Performance Choice for Camera, Cell Phone, Tablets, Smartphones, Laptops, Pictures,Videos,Store Data\",\n" +
                "\t\"prod_id\": \"11283661\",\n" +
                "\t\"platform\": \"vova\",\n" +
                "\t\"url\": \"https://www.vova.com/Zozo-Maxv-Micro-Sd-Card-32gb-High-Speed-Class-10-Memory-Card-With-SN1561373529877110939425220-g9878604-m11283661\",\n" +
                "\t\"prod_cate\": \"Home>>Mobile Phones & Accessories>>Microsd Cards\",\n" +
                "\t\"prod_rate_num\": \"19\",\n" +
                "\t\"post_url\": \"http://47.97.191.82:18111/spider/spiderCallBack\",\n" +
                "\t\"prod_rate\": \"93%\",\n" +
                "\t\"prod_cate_id\": \"/-/Mobile-Phones-Accessories-r10045/-/Microsd-Cards-r10065/\",\n" +
                "\t\"station\": \"\",\n" +
                "\t\"store_name\": \"Gusen E-commerce Co., Ltd.\",\n" +
                "\t\"main_img\": \"https://image-tb.vova.com/image/1000_1000/filler/60/62/28811dfffa786210e769c5001f2b6062.jpg\",\n" +
                "\t\"operationType\": \"3\",\n" +
                "\t\"sku\": \"0651fe44808511ea910f00163e01399f\",\n" +
                "\t\"createdById\": 842818\n" +
                "}";
        VovaProduct vovaProduct = JSONUtil.toBean(s, VovaProduct.class);

        VovaUsed vovaUsed = new VovaUsed();
        vovaUsed.setStation(vovaProduct.getStation());
        System.out.println(vovaUsed);
        System.out.println(JSONUtil.toJsonStr(vovaProduct));
    }

    @Data
    public static class VovaUsed {
        private String station;
    }

    @Data
    public static class VovaProduct {
        private String sku;
        private String prod_url;
        private String prod_id;
        private String prod_lang;
        private String prod_country;
        private String prod_cate;
        private String prod_cate_id;
        private String prod_title;
        private String prod_price;
        private String store_name;
        private String prod_rate;
        private String prod_rate_num;
        private String prod_desc;
        private String main_img;
        private String img_list;
        private String platform;
        private String post_url;
        private String station;
        private Integer createdById;
        private String createdByName;
        private String operationType;
        private String url;
        private String create_time;
    }
}
