package com.andy.demo.sortest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author andy
 * @version PortSort.java, v0.1 2021/5/18 15:40
 * @Description
 */
public class PortSort {
    public static void sortIdentify(List<String> lists){
        SortComparator sortComparator = new SortComparator();
        Collections.sort(lists, sortComparator);
    }

    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<String>();
        lists.add("1.1");
        lists.add("1.2");
        lists.add("1.2.1");
        lists.add("3.1.2");
        lists.add("2.6.6");
        lists.add("2.6.3");
        lists.add("1.10.1");
        lists.add("1.10.2");
        lists.add("1.10.1.2");
        lists.add("1.1.1");
        lists.add("10.1.1");

        sortIdentify(lists);

        for (String ids : lists) {
            System.out.println(ids);
        }
    }
    }
class SortComparator implements Comparator<String> {
    @Override
    public int compare(String pre, String suf) {
        String[] preArrs = pre.split("\\.");
        String[] sufArrs = suf.split("\\.");
        int len = preArrs.length > sufArrs.length ? preArrs.length : sufArrs.length;
        for (int i = 0; i < len; i++) {
            int preNum = 0;
            int sufNum = 0;

            if (i < preArrs.length) {
                preNum = Integer.parseInt(preArrs[i]);
            }

            if (i <sufArrs.length) {
                sufNum = Integer.parseInt(sufArrs[i]);
            }

            if (preNum > sufNum) {
                return 1;
            } else if(preNum < sufNum){
                return -1;
            }
        }
        return 0;
    }
}
