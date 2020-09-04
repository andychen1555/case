package com.andy.demo.defaultvalue;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: weipeng
 * @create: 2020-04-29 20:45
 * @description:
 */
@Slf4j
public class ContinueTest {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            try {
                if (i == 1) {
                    int j = 1 / 0;
                }
            } catch (Exception e) {
                log.error("/0 error");
                continue;
            }
            System.out.println("----------->>>>>"+i);
        }
    }
}
