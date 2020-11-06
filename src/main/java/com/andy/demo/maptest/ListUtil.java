package com.andy.demo.maptest;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: huatl
 * @create: 2019-10-12 17:39
 * @description: list操作工具类
 */
@Slf4j
public class ListUtil {

    /**
     * 获取两个List的相同元素
     *
     * @param list1 第一个list
     * @param list2 第二个list
     * @return List<Integer>
     */
    public static List<Integer> getSame(List<Integer> list1, List<Integer> list2) {
        List<Integer> same = new ArrayList<>();
        for (Integer str : list1) {
            if (list2.contains(str)) {
                same.add(str);
            }
        }
        return same;
    }


    /**
     * 获取从富文本中提取的文字列表
     *
     * @param desc 富文本内容
     * @return List<String>translateOne
     */
    public static Map<String, String> getStrs(String desc) {
        Document htmlDoc = Jsoup.parse(desc);
        List<Element> element = htmlDoc.getAllElements();
        Map<String, String> map = new LinkedHashMap<>();
        final int[] index = {1};
        element.forEach(e -> {
            if (StrUtil.isNotBlank(e.ownText())) {
                map.put("param_" + index[0], e.ownText());
                e.text("param_" + index[0]);
                index[0]++;
            }
        });
        return map;
    }

    /**
     * 翻译后的结果替换处理
     *
     * @param productDesc 商品描述
     * @param map         map
     * @return String
     */
    public static String dealDesc(String productDesc, Map<String, String> map) {
        log.error("oooooooooooo翻译之前的数据为：" + productDesc);
        for (String k : map.keySet()) {
            productDesc = productDesc.replace(k, map.get(k));
        }
        log.error("llllllllllll翻译之后的数据为：" + productDesc);
        return productDesc;
    }

    public static void main(String[] args) {
        String strs = "<p style=\"text-align: center;\">\n" +
                "    <span style=\"font-size: 18pt;\">Type:Hair Claws</span>\n" +
                "    <br />\n" +
                "    <span style=\"font-size: 18pt;\">Material: Plastic/resin</span>\n" +
                "    <br />\n" +
                "    <span style=\"font-size: 18pt;\">Pattern Type:Solid</span>\n" +
                "    <br />\n" +
                "    <span style=\"font-size: 18pt;\">Size:About 8.9 x 4.1 cm</span>\n" +
                "    <br />\n" +
                "    <span style=\"font-size: 18pt;\">Color: as shown</span>\n" +
                "    <br />\n" +
                "    <span style=\"font-size: 18pt;\">Package included: 1pcs hair claw</span>\n" +
                "    <br />\n" +
                "    <br />\n" +
                "    <br />\n" +
                "    <img style=\"width: 1000px; height: auto; display: block; margin-left: auto; margin-right: auto;\" src=\"http://pspk.longpean.com///8882900911175511.jpeg\" />\n" +
                "    <img style=\"width: 1000px; height: auto; display: block; margin-left: auto; margin-right: auto;\" src=\"http://pspk.longpean.com///4653353361342896.jpeg\" />\n" +
                "    <img style=\"width: 1000px; height: auto; display: block; margin-left: auto; margin-right: auto;\" src=\"http://pspk.longpean.com///7993167882367387.jpeg\" />\n" +
                "    <img style=\"width: 1000px; height: auto; display: block; margin-left: auto; margin-right: auto;\" src=\"http://pspk.longpean.com///493181108738606.jpeg\" />\n" +
                "    <img style=\"width: 1000px; height: auto; display: block; margin-left: auto; margin-right: auto;\" src=\"http://pspk.longpean.com///2112264558750417.jpeg\" />\n" +
                "    <img style=\"width: 1000px; height: auto; display: block; margin-left: auto; margin-right: auto;\" src=\"http://pspk.longpean.com///6626481542940399.jpeg\" />\n" +
                "    <img style=\"width: 1000px; height: auto; display: block; margin-left: auto; margin-right: auto;\" src=\"http://pspk.longpean.com///6135962220080620.jpeg\" />\n" +
                "    <img style=\"width: 1000px; height: auto; display: block; margin-left: auto; margin-right: auto;\" src=\"http://pspk.longpean.com///7662517190562470.jpeg\" />\n" +
                "    <img style=\"width: 1000px; height: auto; display: block; margin-left: auto; margin-right: auto;\" src=\"http://pspk.longpean.com///1235773805695169.jpeg\" />\n" +
                "    <img style=\"width: 1000px; height: auto; display: block; margin-left: auto; margin-right: auto;\" src=\"http://pspk.longpean.com///6883635757723685.jpeg\" />\n" +
                "    <img style=\"width: 1000px; height: auto; display: block; margin-left: auto; margin-right: auto;\" src=\"http://pspk.longpean.com///2545126286635238.jpeg\" />\n" +
                "    <img style=\"width: 1000px; height: auto; display: block; margin-left: auto; margin-right: auto;\" src=\"http://pspk.longpean.com//5425322246197324.jpeg\" />\n" +
                "</p>";
        Map<String, String> strs1 = getStrs(strs);
        Map<String, String> newStr = new LinkedHashMap<>();
        strs1.keySet().forEach(k -> {
//            System.out.println(k.split("_")[1]);
        System.out.println(JSONUtil.toJsonStr(strs1));
        });

//        strs1.entrySet().stream().sorted(
//                (e1, e2) -> Integer.valueOf(e1.getKey().split("_")[1]) > Integer.valueOf(e2.getKey().split("_")[1]) ? 1 : -1
//        );
        System.out.println(strs1);
    }
}

