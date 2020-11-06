package com.andy.demo.anno.domain;

import com.andy.demo.anno.ano.Description;
import com.andy.demo.anno.ano.Description2;
import com.andy.demo.anno.ano.Description3;

/**
 * @author: weipeng
 * @create: 2020-10-21 11:10
 * @description:
 */
@Description(names = { "老刘", "老许", "老罗" }, num = 20)
public class MyClazz {

    @Description3("****99号")
    public String address;

    @Description2(num=19,names= {"老八","老平","老毒"},clazzName="1809班")
    public void study() {

    }
}
