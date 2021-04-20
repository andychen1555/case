package com.andy.demo.jsontest;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONConfig;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;

//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;

/**
 * @author: weipeng
 * @create: 2020-04-15 9:59
 * @description:
 */
@Slf4j
public class JsonTest {
    public static void main(String[] args) {
        String s = "[\n" +
                "{\"attrName\":\"\",\"attrNameId\":2,\"attrValue\":\"\",\"attrValueId\":202261045},\n" +
//                "{\"attrName\":\"\",\"attrNameId\":200001171,\"attrValue\":\"\",\"attrValueId\":200006105},\n" +
//                "{\"attrName\":\"\",\"attrNameId\":200001171,\"attrValue\":\"\",\"attrValueId\":200006087},\n" +
                "{\"attrName\":\"\",\"attrNameId\":200001174,\"attrValue\":\"\",\"attrValueId\":\"200006128,200006129,200006127,200006124,200006122,200006120,5080,5084,200006133,200006132\"},\n" +
//                "{\"attrName\":\"\",\"attrNameId\":200000581,\"attrValue\":\"50\",\"attrValueId\":\"\"},\n" +
//                "{\"attrName\":\"\",\"attrNameId\":967,\"attrValue\":\"1\",\"attrValueId\":\"\"},\n" +
//                "{\"attrName\":\"\",\"attrNameId\":200349264,\"attrValue\":\"\",\"attrValueId\":360544},\n" +
                "{\"attrName\":\"\",\"attrNameId\":200309261,\"attrValue\":\"0000\",\"attrValueId\":\"\"}]";

//        splitProdProps(s);

        User user = new User();
        user.setName("xxx");
        user.setAge(18);
        System.out.println(JSONUtil.toJsonStr(user));
        System.out.println(JSON.toJSONString(user));

    }
    /**
     * 拆解前台提交的商品属性
     *
     * @param jsonProduct
     * @return
     */
    public static JSONArray splitProdProps(String jsonProduct) {
        JSONArray attrArray = JSONUtil.parseArray(jsonProduct);
        log.info("split product property before=====================>>>>>>>>{}", attrArray);
        JSONArray newArr = new JSONArray();
        Iterator<Object> it = attrArray.iterator();
        while (it.hasNext()) {
            JSONObject attr = (JSONObject) it.next();
            String attrName = String.valueOf(attr.get("attrName"));
            Long attrNameId = attr.getLong("attrNameId", null);
            String attrValue = String.valueOf(attr.get("attrValue"));
            String attrValueId = attr.getStr("attrValueId", "");
            if (!attrValueId.contains(",")) {
                JSONObject jsonObj = JsonTest.getJsonObject(attrName, attrNameId, attrValue, attrValueId);
                newArr.add(jsonObj);
                continue;
            }
            String[] valueIds = StrUtil.split(attrValueId, ",");
            for (String valueId : valueIds) {
                JSONObject jsonObj = JsonTest.getJsonObject(attrName, attrNameId, attrValue, valueId);
                newArr.add(jsonObj);
            }
        }
        log.info("split product property process after=====================>>>>>>>>{}", newArr);
        return newArr;
    }

    /**
     * 填充新的商品属性
     */
    private static JSONObject getJsonObject(String attrName,
                                            Long attrNameId,
                                            String attrValue,
                                            String valueId) {
        JSONConfig jsonConfig = new JSONConfig();
        jsonConfig.setIgnoreNullValue(false);
        JSONObject jsonObj = new JSONObject(null, jsonConfig);
        jsonObj.put("attrName", attrName);
        jsonObj.put("attrNameId", attrNameId);
        jsonObj.put("attrValue", attrValue);
        jsonObj.put("attrValueId", StrUtil.isBlank(valueId) ? null : Long.valueOf(valueId));
        return jsonObj;
    }
}
