package com.andy.demo.maptest;

/**
 * @author: weipeng
 * @create: 2020-10-15 17:13
 * @description:
 */
public class MapTest {

    public static void main(String[] args) {
//        List<Apple> apples = CollUtil.newArrayList();
//        Apple a1 = new Apple();
//        a1.setName("ccc")
//                .setColor("red");
//        Apple a2 = new Apple();
//        a2.setName("ddd")
//                .setColor("green");
//        apples.add(a1);
//        apples.add(a2);
//        apples = apples.stream().map(
//                i -> {
//                    i.setName("ttt");
//                    return i;
//                }
//        ).collect(Collectors.toList());
//        System.out.println(apples);
//        HashMap<Object, Object> map =
//                CollUtil.newHashMap();
//        System.out.println(map.get(null));
        int a = 5;
        foo1(a);
        System.out.println(a);

        Apple app = new Apple();
        app.setId(1)
                .setName("aaa")
                .setColor("bbb");
        foo2(app);
        System.out.println(app);
    }


    private static int foo1(int a) {
        a = 4;
        return a;
    }

    private static void foo2(Apple a) {
        a.setId(99)
                .setName("xxx")
                .setColor("uuu");
    }
}
