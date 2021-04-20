package com.andy.demo.jsontest;

import lombok.Data;
import org.springframework.data.annotation.Transient;

import java.io.Serializable;

/**
 * @author: weipeng
 * @create: 2020-05-28 15:28
 * @description:
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -8044712452814521055L;

    private transient String name;
    private Integer age;
}
