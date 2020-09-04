package com.andy.demo.regex;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: weipeng
 * @create: 2020-04-16 9:35
 * @description:
 */
@Slf4j
public class UrlRegex {
    public static void main(String[] args) {
//        Pattern p = compile("[a-zA-Z:\\/\\.\\-0-9=_]+(\\?)");

//        String s = "https://www.aliexpress.com/item/33062943005.html?spm=a2g0o.detail.1000014.27.520c4a5cFCLNx7&gps-id=pcDetailBottomMoreOtherSeller&_t=gps-id:pcDetailBottomMoreOtherSeller";
//        String s = "https://shopee.com.my/Signature-Snack-Almond-Cashew-Mix-(120g)-i.52784309.1444204526";
//        String s = "https://www.joom.com/en/products/5c18a5fb36b54d010162c70f?context=%7B%22type%22%3A%22product%22%2C%22value%22%3A%5B%7B%22id%22%3A%225c18a5fb36b54d010162c70f%22%2C%22type%22%3A%22pg%22%2C%22data%22%3A%22a2snJ6urgIBxcQEBAAAAAHDJpFHmRySSBnoF%2Fg5%2F6VOflnRSl4dqcliFwNNuqO%2FaqBqAGGOE%2FIunmMXl%2FHyAuJ9P9FZVpWah3FseQqoL3jBPNU2TmgXuZSH03wARQzkaiFR6bV29pehl7m7E9D8WeeaxSIke6aMmMmsJVUEFlinNyqxIU9M%2B%2F1oA1PG%2BTDJU6NejZs%2BvbBDFBiJYdu5xwRBEAImyQS96%2BMwheS6VCrV1bjSDvQE4I4U3dK%2F%2Bntm3wmV1KEJwfKk2tZh7uTWeShVfzwrs5yAW2XwYM9GuET5JBK0FQLbkvtOnCDuA4oqzA2TYp3WDIeQYZAvmweYjgM2n%2BO7nSe9qqpt3T%2B1jDglenquLRJ6jf5PF4JIzv%2BWOxFxmkBlnJq9L4DnfrowEE39IYPvbzf8R2qCZoBP86zD1elJkRkcSxdK4lwHV3GdOVfW6QN3VKiAcGnXiJR1FyZiYnMHTK2D4w2SfCxIEsPR4BE3NSLuFiSV4uAAo6hGV7ThvvzeK3UfF0qNDIgCQ6nXRMcHB8b4pXqlYG%2BEeV%2F7jf3pSppOl21kFOLyUnEOyzszk1TTVgqxy4jn6QSwnTpaPl99FosascW2ebNdfYlHFXw%3D%3D%22%7D%5D%7D&contextSeed=uywk";

//        String reString = ReUtil.get(p, s, 0);
//        System.out.println(reString);
//        try {
//            URI requestUri = new URI(s);
//            String scheme = requestUri.getScheme();
//            if (StrUtil.isBlank(scheme)) {
//                scheme = "";
//            }else {
//                scheme = scheme+"://";
//            }
//            String host = requestUri.getHost();
//            String path = requestUri.getPath();
//            String url = StrUtil.join("", scheme, host, path);
//            System.out.println(url);
//        } catch (URISyntaxException e) {
//            e.printStackTrace();
//        }

//        String s = "L_XXXX";
//        s = s.replaceAll("L_", "");
        String s = "start&end&1";
        String[] strings = s.split("&");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
