package com.andy.demo.anno.ano;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author: weipeng
 * @create: 2020-10-21 11:06
 * @description:
 */
@Documented
@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD })
public @interface Description {

    int num();
    String[] names() ;
    String clazzName() default "java1809";

}
