package com.andy.demo.allocate;


import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author: weipeng
 * @create: 2020-07-15 10:24
 * @description:
 */
@Slf4j
public class Tanlan {
    public static void main(String[] args) {
        int n = 8;
//        List<Integer> list = new GetRadon().CreateRadon(); //new List<int>() { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; //
        List<Integer> list = Arrays.asList(373, 95, 51, 426, 16, 30, 1245, 143, 153, 277, 132, 109, 50, 244, 30, 881, 97, 72, 60, 660, 90, 218, 18, 12, 16, 30, 502, 16, 144, 70, 53, 19, 444, 657, 258, 21, 10, 64, 41, 410, 3, 25, 28, 13, 99, 138, 260, 40, 1832, 10, 520, 13, 138, 212, 46, 47, 40, 227, 172, 10, 407, 885, 757, 413, 270, 425, 61, 28, 7, 640, 48, 37, 101, 17, 155, 414, 39, 81, 154, 74, 526, 226, 27, 23, 85, 582, 139, 131, 7, 347, 9, 62, 468, 33, 264, 608, 38, 462, 13, 81, 215, 24, 690, 106, 57, 4, 1640, 82, 200, 6, 59, 35, 102, 48, 16, 117, 44, 1, 368, 157, 933, 2725, 16, 35, 760, 851, 84, 208, 16, 59, 76, 148, 35, 1710, 78, 667, 34, 2213, 45, 178, 7, 18, 127, 43, 81, 19, 3111, 41, 27, 250, 200, 697, 63, 73, 164, 72, 86, 105, 17, 19, 20, 17, 32, 127, 330, 116, 134, 66, 9, 114, 2328, 188, 57, 334, 40, 144, 559, 361, 173, 36, 235, 36, 34, 686, 416, 85, 150, 138, 113, 351, 14, 10, 885, 217, 469, 179, 56, 305, 54, 69, 7, 32, 75, 667, 27, 5589, 23, 253, 25, 8, 114, 124, 112, 43, 36, 290, 279, 411, 680, 3386, 214, 2331, 75, 92, 90, 798, 196, 8, 4, 59, 9, 17, 258, 51, 13, 17, 209, 240, 202, 12, 2868, 849, 175, 96, 622, 646, 197, 145, 573, 138, 18, 74, 39, 186, 183, 44);
//        new StandrdDeviation().getStandDeviation(list);
        Integer max = new StandrdDeviation().getStandDeviation1(list);
//        System.out.println(max);


        //new TanlanA().SortAsc1(list);
        //for (int i = 0; i < list.Count; i++)
        //{
        //    Console.WriteLine(list[i]);
        //}
        int t = list.size();
        List<Integer> filterList = list.stream().filter(o -> o < max).collect(Collectors.toList());
        List<Integer> filter = list.stream().filter(o -> o > max).collect(Collectors.toList());
        System.out.println(filter);

        log.info("倒序贪婪平均分配算法 元素总数：{} 分配给{}人的总分{},平均值：{}",
                t, n, list.stream().mapToInt(Integer::valueOf).sum(), list.stream().mapToInt(Integer::valueOf).sum() / n);
        log.info("过滤前:元素总数：{},分配给{}人的总分{},平均值:{}",
                t, n, list.stream().mapToInt(Integer::valueOf).sum(), list.stream().mapToInt(Integer::valueOf).sum() / n);
        log.info("过滤后:极值后总数{},分配给{}人的总分{},平均值:{}",
                filterList.size(), n, filterList.stream().mapToInt(Integer::valueOf).sum(), filterList.stream().mapToInt(Integer::valueOf).sum() / n);
        new TanlanA().Distrube(filterList, n);

    }
}

class StandrdDeviation {
    // 求标准差
    public Integer getStandDeviation(List<Integer> list) {
        int sum = list.stream().mapToInt(Integer::valueOf).sum();
        // 求出数组的平均数
        double average = sum / list.size();
        int avera = Double.valueOf(average).intValue();
        System.out.println("数组的平均数:" + avera);
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += (list.get(i) - average) * (list.get(i) - average);   //求出方差，如果要计算方差的话这一步就可以了
        }
        int standardDeviation = Double.valueOf(Math.sqrt(total / list.size())).intValue();   //求出标准差
        System.out.println("数组标准差:" + standardDeviation);
        return standardDeviation;
    }

    // 求标准差
    public Integer getStandDeviation1(List<Integer> list) {
        int sum = list.stream().mapToInt(Integer::valueOf).sum();
        // 求出数组的平均数
        double average = sum / list.size();
        int avera = Double.valueOf(average).intValue();
        System.out.println("数组的平均数:" + avera);
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += (list.get(i) - average) * (list.get(i) - average);   //求出方差，如果要计算方差的话这一步就可以了
        }
        int standardDeviation = Double.valueOf(Math.sqrt(total / list.size())).intValue();   //求出标准差
        System.out.println("数组标准差:" + standardDeviation);
        int result = avera + standardDeviation + standardDeviation;
        System.out.println("取值标准区间:" + result);
        // 75%
        return result;
    }
}

class GetRadon {
    public List<Integer> CreateRadon() {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();
        //for (int i = 1; i <= 10000; i++)
        //{
        //    int n = r.Next(0, 100000);
        //    list.Add(n);
        //}

        for (int i = 0; i < 106; i++) {
            int n = r.nextInt(10000);
            list.add(n);
        }

        return list;
    }
}

class TanlanA {
    //降序
    public void SortDesc(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int maxindex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(maxindex) < list.get(j)) {
                    maxindex = j;
                }
            }
            int t = list.get(i);
            list.set(i, list.get(maxindex));
            list.set(maxindex, t);
        }

    }

    //升序
    public void SortAsc(List<Integer> list, List<List<Integer>> slist) {
        for (int i = 0; i < list.size() - 1; i++) {
            int miindex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(miindex) > list.get(j)) {
                    miindex = j;
                }
            }
            int t = list.get(i);
            list.set(i, list.get(miindex));
            list.set(miindex, t);

            List<Integer> tmp = slist.get(i);
            slist.set(i, slist.get(miindex));
            slist.set(miindex, tmp);
        }
    }

    /// <summary>
    /// 倒序贪婪
    /// </summary>
    /// <param name="list"></param>
    /// <param name="count"></param>
    public void Distrube(List<Integer> list, int count) {
        if (list.size() < count) {
            System.out.println("分配的list大小必须大于等于分组数");
            return;
        }
        List<Integer> sumlist = new ArrayList<>();//保存分组的总和,方便根据其值进行从小到大排序
        List<List<Integer>> slist = new ArrayList<>();//保存分组的所有分配到的值

        SortDesc(list);//先将list按照从大到小排序

        int n = 0;
        int c = 0;
        for (int i = 0; i < list.size(); i += count)//每次取count步长的值
        {
            n++;
            c = 0;
            for (int j = i; j < n * count; j++)//将count步长中的值从0开始一个个赋予每个分组
            {
                if (j >= list.size()) {
                    break;
                }
                int y = (j + 1) % count;

                if (sumlist.size() < count) {
                    sumlist.add(list.get(j));
                    List<Integer> tlist = new ArrayList<>();
                    tlist.add(list.get(j));
                    slist.add(tlist);
                } else {
                    Integer tmp = sumlist.get(c);
                    sumlist.set(c, tmp += list.get(j));
                    slist.get(c).add(list.get(j));
                    c++;
                }
            }

            SortAsc(sumlist, slist);//对分组进行从小到大排序

        }
        for (int jj = 0; jj < slist.size(); jj++) {
            System.out.println(String.format("班级%s 总分:%s", jj + 1, slist.get(jj).stream().mapToInt(Integer::valueOf).sum()));
            System.out.println(slist.get(jj).toString());

        }
    }
}
