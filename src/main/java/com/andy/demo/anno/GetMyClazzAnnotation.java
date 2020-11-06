package com.andy.demo.anno;

import com.andy.demo.anno.ano.Description;
import com.andy.demo.anno.ano.Description2;
import com.andy.demo.anno.ano.Description3;
import com.andy.demo.anno.domain.MyClazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author: weipeng
 * @create: 2020-10-21 11:10
 * @description:
 */
public class GetMyClazzAnnotation {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        /**
         * 1.获得要解析的元素
         * 2.判断元素上是否有指定注解
         * 3.如果有，就拿到该注解
         * 4.解析该注解
         */
        // 解析类上面的注解
        Class<MyClazz> myClass = MyClazz.class;
        boolean flag = myClass.isAnnotationPresent(Description.class);
        if (flag) {
            Description description = myClass.getAnnotation(Description.class);
            String clazzName = description.clazzName();
            String[] names = description.names();
            int num = description.num();
            System.out.println(clazzName + "班，有 " + num + "个人，其中包括：" + Arrays.toString(names));
        }

        // 解析指定字段上面的注解
        Field address = myClass.getDeclaredField("address");
        boolean flag2 = address.isAnnotationPresent(Description3.class);
        if (flag2) {
            Description3 description3 = address.getAnnotation(Description3.class);
            System.out.println("班级地址：" + description3.value());
        }


        Method method = myClass.getDeclaredMethod("study");
        boolean flag3 = method.isAnnotationPresent(Description2.class);
        if(flag3) {
            Description2 description2 = method.getAnnotation(Description2.class);
            //解析出注解的属性，只是打印了一下
            String className = description2.clazzName();
            String[] names = description2.names();
            int num = description2.num();
            System.out.println(className+"，有"+num+"个人，其中包括："+Arrays.toString(names));
        }

    }
}
