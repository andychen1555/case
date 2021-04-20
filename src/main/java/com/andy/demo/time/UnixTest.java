package com.andy.demo.time;

import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.StrUtil;

import java.util.Random;

/**
 * @author andy
 * @version UnixTest.java, v0.1 2021/4/1 10:14
 * @Description
 */
public class UnixTest {
    public static void main(String[] args) {
        String unixTime = String.valueOf(System.currentTimeMillis() / 1000L);
        System.out.println(StrUtil.subSufByLength(unixTime,10));
        System.out.println(unixTime);

        UUID uuid = UUID.randomUUID();
        String id = String.valueOf(uuid.getMostSignificantBits());
        String substring = id.substring(id.length() - 4);
        System.out.println(substring);
        Random random = new Random();
        int randomNum = random.nextInt(99999999 - 10000000) + 10000000;
        System.out.println(randomNum);
    }
}
