package com.andy.demo.regex;

import cn.hutool.core.util.ReUtil;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;
import static java.util.regex.Pattern.compile;

/**
 * @author: weipeng
 * @create: 2020-04-13 16:41
 * @description:
 */
public class RegexTest {
    public static void main(String[] args) {
//        Pattern p = compile("(?<=http://www\\.|https://www\\.|www\\.)[^.]+", CASE_INSENSITIVE);
//        String s = "https://www.ebay.com/itm/Skullcandy-Sesh-XT-True-wireless-Earbuds-Refurbished/264671860534?_trkparms=aid%3D1110006%26algo%3DHOMESPLICE.SIM%26ao%3D1%26asc%3D225074%26meid%3D986015aac0514da3b93c43ee132dd6ea%26pid%3D100005%26rk%3D2%26rkt%3D12%26mehot%3Dpf%26sd%3D264688693840%26itm%3D264671860534%26pmt%3D1%26noa%3D0%26pg%3D2047675%26algv%3DSimplAMLv5PairwiseWebWithBBEV1Filter%26brand%3DSkullcandy&_trksid=p2047675.c100005.m1851";
//        String s ="https://www.aliexpress.com/item/4000333406847.html";
//        String reString = ReUtil.get(p, s, 0);
//        System.out.println(reString);

        Pattern URL_PATTERN = compile("(?<=http://www\\.|https://www\\.|www\\.|https://)[^.]+", CASE_INSENSITIVE);
//        Pattern URL_PATTERN = compile("(?i)^https?://(?:\\w+\\.)*?(\\w*\\.(?:com\\.cn|cn|com|net))[\\\\\\/]*", CASE_INSENSITIVE);

        //amazon
        String url = "https://www.amazon.com/Pringles-Flavored-Variety-Original-Cheddar/dp/B0785P5MP5/ref=sr_1_5?dchild=1&keywords=food&qid=1587000832&sr=8-5";

        //ebay
//        String url ="https://www.ebay.com/itm/Bose-QuietComfort-35-Series-II-Wireless-Noise-Cancelling-Headphones-Black/223976333320?_trkparms=aid%3D777001%26algo%3DDISCO.FEED%26ao%3D1%26asc%3D225074%26meid%3D00fbdf4cd5e34cb694d7a31735be33ae%26pid%3D101002%26rk%3D1%26rkt%3D1%26mehot%3Dnone%26itm%3D223976333320%26pmt%3D0%26noa%3D1%26pg%3D2380057%26algv%3DPersonalizedTopicsForGuests&_trksid=p2380057.c101002.m4497&_trkparms=pageci%3Af3f0c0fb-7fde-11ea-b1b7-1ebf8c32785f%7Cparentrq%3A82fdf64e1710ad31c3b356fdffdfeb3a%7Ciid%3A1";

        //smt
//        String url ="https://www.aliexpress.com/item/32959703825.html?spm=a2g01.12617084.fdpcl001.10.7319sQ2xsQ2xj4&gps-id=5547572&scm=1007.19201.130907.0&scm_id=1007.19201.130907.0&scm-url=1007.19201.130907.0&pvid=8b382801-600b-43d4-9ad1-dac367bc16d0";

        //joom
//        String url ="https://www.joom.com/en/products/1521629483008210525-85-1-26193-733772285";

        //lazada
//        String url = "https://www.lazada.com.my/products/cheer-motorcycle-glasses-windproof-dustproof-eye-glasses-goggles-outdoor-glasses-black-i128736940-s143071426.html";

        //shopee
//        String url ="https://shopee.com.my/Aladdin-Triangel-Short-Ladies-Purse-Wallet-Coin-Bag-Dompet-Shopping-Casual-Outing-12W5-i.156646805.5513701850";

        // vova
//        https://shopee.co.th/Cartoon%20Transparent%20Hot%201pc%20Empty%20Bottle-i.73594792.4423241896
//        String url="https://www.vova.com/New-Projector-Listed-15000-Lumens-1080p-Hd-Wifi-Mobile-Phone-With-GSN1575357039129218147445637-g11302395-m12789954";

//        // 顶级域名匹配正则
//        URI requestUri = null;
//        try {
//            requestUri = new URI(StrUtil.trim(url));
//        }catch (URISyntaxException e) {}
//        String scheme = requestUri.getScheme();
//        String host = requestUri.getHost();
//        String path = requestUri.getPath();
//        if (StrUtil.isBlank(scheme)) {
//            scheme = "";
//        } else {
//            scheme = scheme + "://";
//        }
//
//        url = StrUtil.join("", scheme, host, path);

        String domainName = ReUtil.get(URL_PATTERN, url, 0);
//        System.out.println("url-------------->"+url);
        System.out.println("domainName------->" + domainName);
    }


}
