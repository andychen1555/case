package com.andy.demo.jsontest;

import cn.hutool.json.JSONUtil;

/**
 * @author: weipeng
 * @create: 2020-05-11 21:37
 * @description:
 */
public class TestParse {
    public static void main(String[] args) {
        String json = "{\n" +
                "\t\"version\": \"2.0.0\",\n" +
                "\t\"moduleList\": [{\n" +
                "\t\t\"type\": \"html\",\n" +
                "\t\t\"html\": {\n" +
                "\t\t\t\"content\": \"<p style=\\\"margin-left: auto; margin-right: auto;\\\">\\n\\tGreat for DIY and adding finishing touches to bags, jackets, scarves, hats, jumpers and much more.<br \\/>\\n\\tWidely used and can be used for cloth, kids DIY crafts,ornaments, ornaments headdress, clothing, etc...<br \\/>\\n\\t<br \\/>\\n\\tNotice:<br \\/>\\n\\t1. Due to the light and screen difference, the item&#39;s color may be slightly different<br \\/>\\n\\tfrom the pictures. Please understand. Make sure you don&#39;t mind before you bid.<br \\/>\\n\\t2. Please allow 0.5-1mm differences due to manual measurement.\\n<\\/p>\\n<p style=\\\"margin-left: auto; margin-right: auto;\\\">\\n\\t100% Brand New and High quality<br \\/>\\n\\tMaterial: Resin<br \\/>\\n\\tSize(Approx): Diameter 9mm,11mm ,12mm<br \\/>\\n\\tColor: Random Color<br \\/>\\n\\tShapes: Round<br \\/>\\n\\tPackage included :100*buttons\\n<\\/p>\\n<p style=\\\"margin-left: auto; margin-right: auto;\\\">\\n\\tokokok\\n<\\/p>\\n<p>\\n\\t<img src=\\\"http:\\/\\/pspk.longpean.com\\/epean\\/Public\\/images\\/upload\\/W5P_3832484834_753782208.400x400.jpg\\\" style=\\\"width: 1000px; height: auto; display: block; margin-left: auto; margin-right: auto;\\\" \\/>\\n<\\/p>\\n<p>\\n\\t<img src=\\\"http:\\/\\/pspk.longpean.com\\/epean\\/Public\\/images\\/upload\\/7HP_100-Pcs-Beautiful-Resin-Round-Buttons-Sewing-DIY-Scrapbooking-Decals-for-Kids-Crafts-Accessories-NO08-WXV.jpg\\\" style=\\\"width: 1000px; height: auto; display: block; margin-left: auto; margin-right: auto;\\\" \\/>\\n<\\/p>\\n<p>\\n\\t<img src=\\\"http:\\/\\/pspk.longpean.com\\/epean\\/Public\\/images\\/upload\\/BXN_3831727806_753782208.400x400.jpg\\\" style=\\\"width: 1000px; height: auto; display: block; margin-left: auto; margin-right: auto;\\\" \\/>\\n<\\/p>\\n<p>\\n\\t<img src=\\\"http:\\/\\/pspk.longpean.com\\/epean\\/Public\\/images\\/upload\\/MYJ_3834183951_753782208.400x400.jpg\\\" style=\\\"width: 1000px; height: auto; display: block; margin-left: auto; margin-right: auto;\\\" \\/>\\n<\\/p>\\n<p>\\n\\t<img src=\\\"http:\\/\\/pspk.longpean.com\\/epean\\/Public\\/images\\/upload\\/H2B_3834186741_753782208.400x400.jpg\\\" style=\\\"width: 1000px; height: auto; display: block; margin-left: auto; margin-right: auto;\\\" \\/>\\n<\\/p>\\n<p>\\n\\t<img src=\\\"http:\\/\\/pspk.longpean.com\\/epean\\/Public\\/images\\/upload\\/BG8_3834186741_753782208.400x400.jpg\\\" style=\\\"width: 1000px; height: auto; display: block; margin-left: auto; margin-right: auto;\\\" \\/>\\n<\\/p>\"\n" +
                "\t\t}\n" +
                "\t}]\n" +
                "}";
//        Object content = JSONUtil.parseObj(
//                                JSONUtil.parseObj(
//                                        JSONUtil.parseArray(JSONUtil.parseObj(json).get("moduleList")).get(0)
//                                ).get("html")
//                        ).get("content");
//        System.out.println(content);

        String className = Thread.currentThread().getStackTrace()[1].getClassName();
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        test(className+methodName);
    }

    static void test(String value){
//        System.out.println(Thread.currentThread().getStackTrace()[1].getClassName());
//        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println(value);
    }
}
