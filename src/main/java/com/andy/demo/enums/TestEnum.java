package com.andy.demo.enums;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import java.util.Objects;

import static com.andy.demo.enums.AeProdDescEnum.*;

/**
 * @author: weipeng
 * @create: 2020-05-12 16:32
 * @description:
 */
public class TestEnum {
    public static void main(String[] args) {
        String s ="{\n" +
                "\t\"version\": \"2.0.0\",\n" +
                "\t\"moduleList\": [{\n" +
                "\t\t\"type\": \"html\",\n" +
                "\t\t\"html\": {\n" +
                "\t\t\t\"content\": \"xfasf\"\n" +
                "\t\t}\n" +
                "\t}]\n" +
                "}";
//        System.out.println(JSONUtil.parseObj(JSONUtil.parseObj(s).get("images")).get("height"));

        setPskuProductDetailByAeProduct(s);
    }


    /**
     * 根据线上详情信息设置本地父文本
     *
     * @param webDetail Ae返回详情描述
     */
    public static void setPskuProductDetailByAeProduct(String webDetail) {
        if (StrUtil.isBlank(webDetail)) {
            return;
        }
        JSONArray moudleList = JSONUtil.parseArray(JSONUtil.parseObj(webDetail).get(MODULE_LIST.getDesc()));
        StringBuilder builder = StrUtil.builder();
        for (Object moudleObj : moudleList) {
            JSONObject moudle = JSONUtil.parseObj(moudleObj);
            String type = String.valueOf(moudle.get(TYPE.getDesc()));
            //根据 type 区分,设置 pSKu productDeatail
            setMoudlePropertyByType(builder, type, moudle);
        }
        System.out.println(builder.toString());
        builder.setLength(0);
    }

    /**
     * 根据 type 区分,设置 pSKu productDeatail
     *
     * @param builder --
     * @param type    操作类型区分
     * @param moudle  json moudle
     */
    private static void setMoudlePropertyByType(StringBuilder builder,
                                         String type,
                                         JSONObject moudle) {
        AeProdDescEnum prodDescEnum = AeProdDescEnum.getProdDesc(type);
        if (Objects.isNull(prodDescEnum)) {
            return;
        }
        switch (prodDescEnum) {
            case IMAGE:
                setProductImgs(builder, moudle);
                break;
            case TEXT:
                setProductTexts(builder, moudle);
                break;
            case TEXT_IMAGE:
                setProductImgs(builder, moudle);
                setProductTexts(builder, moudle);
                break;
            case MEDIA:
                //todo 视频信息暂不处理
                break;
            case DYNAMIC:
                //todo 产品信息模块内容暂不处理
                break;
            case HTML:
//                JSONObject ttt = JSONUtil.parseObj(moudle.get(HTML.getDesc());
//                JSONUtil.parseObj(ttt.get())
                builder.append(JSONUtil.parseObj(moudle.get(HTML.getDesc())).get(CONTENT.getDesc()));
                break;
            default:
                break;
        }
    }

    /**
     * 设置文本信息
     *
     * @param builder --
     * @param moudle  json moudle
     */
    private static void setProductTexts(StringBuilder builder, JSONObject moudle) {
        JSONArray texts = JSONUtil.parseArray(moudle.get(TEXTS.getDesc()));
        for (Object text : texts) {
            JSONObject jsonContent = JSONUtil.parseObj(text);
            String content = String.valueOf(jsonContent.get(CONTENT.getDesc()));
            String textClass = String.valueOf(jsonContent.get(CLASS.getDesc()));
            builder.append("<div class=' ")
                    .append(textClass)
                    .append("'<p style='margin-left: auto; margin-right: auto;'><font>")
                    .append(content)
                    .append("</font></p>");
        }
    }

    /**
     * 设置图片信息
     *
     * @param builder --
     * @param moudle  json moudle
     */
    private static void setProductImgs(StringBuilder builder, JSONObject moudle) {
        JSONArray images = JSONUtil.parseArray(moudle.get(IMAGES.getDesc()));
        for (Object image : images) {
            Object style = JSONUtil.parseObj(image).get(STYLE.getDesc());
            Integer width = (Integer) JSONUtil.parseObj(style).get(WIDTH.getDesc());
            Integer height = (Integer) JSONUtil.parseObj(style).get(HEIGHT.getDesc());
            Boolean hasMargin = (Boolean) JSONUtil.parseObj(style).get(HASMARGIN.getDesc());
            builder.append("<nav><p><img style='width:")
                    .append(Objects.isNull(width) ? "1000px" : width)
                    .append(";height:")
                    .append(Objects.isNull(height) ? "auto" : height)
                    .append(";display: block; margin-left: auto; margin-right:auto; margin-bottom:")
                    .append((!Objects.isNull(hasMargin) && hasMargin) ? "auto" : "25px;' src='")
                    .append(JSONUtil.parseObj(image).get(URL.getDesc()))
                    .append("'/></p></nav>");
        }
    }
}
