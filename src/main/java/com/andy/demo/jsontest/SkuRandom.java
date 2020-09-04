package com.andy.demo.jsontest;

/**
 * @author: weipeng
 * @create: 2020-05-20 21:45
 * @description:
 */
public class SkuRandom {

    public static void main(String[] args) {
        String shopName = "SMHT-04";
        int id =1506;
        int num = 3;
        System.out.println(randomSku(shopName,id,num));
    }

    /**
     * @param shopName 店铺名
     * @param id       生成的店铺商品id
     * @param num      起售数 生成父sku时不需要
     * @return 店铺sku
     */
    public static String randomSku(String shopName, Integer id, Integer num) {
        String s = "";
        char c = shopName.charAt(0);
        if (c >= 'a' && c <= 'z') {
            c = (char) (c - 32);
        }
        s += "A" + c + id;
        StringBuilder letter = new StringBuilder();
        if (num != null && num > 1) {
            for (int i = 0; i < 10 - s.length(); i++) {
                letter.append((char) (Math.random() * 26 + 'A'));
            }
            s += letter + "*" + num;
        } else {
            for (int i = 0; i < 12 - s.length(); i++) {
                letter.append((char) (Math.random() * 26 + 'A'));
            }
            s += letter;
        }
        return s;
    }
}
