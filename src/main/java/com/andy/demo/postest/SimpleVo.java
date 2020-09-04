package com.andy.demo.postest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: weipeng
 * @create: 2020-04-03 18:31
 * @description:
 */
@Data
public class SimpleVo {
    private Integer age;

    private String name;

    private List<Integer> nums;

    private List<String> colors;
}
