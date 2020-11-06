package com.andy.demo.anno.ano;

/**
 * @author: weipeng
 * @create: 2020-10-21 11:07
 * @description:
 */

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**1
 *
 * 使用时，一个值都不用加
 *
 */
@Documented
@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD })
public @interface Description2 {
    int num() default -1;
    String[] names() default {} ;
    String clazzName() default "";
}
