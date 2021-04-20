package com.andy.demo.bean;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author andy
 * @version Apple.java, v0.1 2021/1/14 13:56
 * @Description
 */
@Data
@Accessors(chain = true)
public class Apple implements Serializable {

    private static final long serialVersionUID = -1030871034342946850L;

    private String name;
    private Long money;

}
