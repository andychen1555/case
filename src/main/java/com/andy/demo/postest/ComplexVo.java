package com.andy.demo.postest;

import cn.hutool.core.util.StrUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @author: weipeng
 * @create: 2020-04-03 16:29
 * @description:
 */
@Data
public class ComplexVo {
    private int id;
    private String name;

    private Map<Integer, List<Address>> addressMap;

    @Data
    public static class Address{
        private int tel;
        private String province;
        private Long cardId;
    }

    public static void main(String[] args) {
        System.out.println(StrUtil.equals(null,"sss"));
    }
}
