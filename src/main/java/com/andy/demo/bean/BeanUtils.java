package com.andy.demo.bean;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author andy
 * @version BeanUtils.java, v0.1 2020/12/22 16:10
 */
@Slf4j
public class BeanUtils {


    /**
     * obj2Map
     */
    public static Map<String, String> bean2Map(Object obj) {
        Map<String, Object> beanMap = BeanUtil.beanToMap(obj);
        return beanMap.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> {
                    Object value = e.getValue();
                    if (Objects.isNull(value)) {
                        return "";
                    } else {
                        return String.valueOf(value);
                    }
                }));
    }

    /**
     * 校验对象的所有属性是否有值
     */
    public static boolean checkFieldHasValue(Object obj) {
        boolean flag = false;
        if (Objects.isNull(obj)) {
            return flag;
        }
        try {
            for (Field f : obj.getClass().getDeclaredFields()) {
                if (StrUtil.equals("serialVersionUID",f.getName())){
                    continue;
                }
                f.setAccessible(true);
                Object value = f.get(obj);
                if (Objects.isNull(value)) {
                    continue;
                }
                if (f.getType() == String.class && StrUtil.isBlank(String.valueOf(value))) {
                    continue;
                }
                if (f.getType() == List.class && CollUtil.isEmpty((List)value)) {
                    continue;
                }
                flag = true;
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException("access obj value exception!!");
        }
        //没有值则提示
        if (!flag) {
            log.warn("checkFieldHasValue: bean property value is null or blank,please check it.");
        }
        return flag;
    }

}
