package com.andy.demo.listcollect;

import cn.hutool.core.collection.CollUtil;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: weipeng
 * @create: 2020-11-04 11:23
 * @description:
 */
public class LinkedListPop {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<String>();

        // Add few Elements
        list.add("Jack");
        list.add("Robert");
        list.add("Chaitanya");
        list.add("kate");

        // Display LinkList elements
        System.out.println("LinkedList before: " + list);

        // pop Element from list and display it
        System.out.println("Element removed: " + popElement(list));

        System.out.println("Element removed: " + popElement(list));

        // Display after pop operation
        System.out.println("LinkedList after: " + list);
    }

    private static String popElement(List param){
        if (CollUtil.isEmpty(param)){
            return null;
        }
        LinkedList<String> mainUrls = (LinkedList<String>) param;
        return mainUrls.pop();
    }
}
