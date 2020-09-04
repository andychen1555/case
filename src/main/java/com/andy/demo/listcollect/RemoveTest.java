package com.andy.demo.listcollect;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: weipeng
 * @create: 2020-04-09 14:13
 * @description:
 */
public class RemoveTest {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("AA");
        l1.add("BB");
        l1.add("CC");
        List<String> l2 = new ArrayList<>();
        l2.add("AA");
        l2.add("BB");
        l2.add("CC");
        l1.removeAll(l2);
        System.out.println(l1);
    }
}
