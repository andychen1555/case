package com.andy.demo.intstream;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author: weipeng
 * @create: 2020-09-08 11:22
 * @description:
 */
public class IntStreamDemo {
    public static void main(String[] args) {
        List<String> collect = IntStream.rangeClosed(1, 20).mapToObj(i -> "item" + i).collect(Collectors.toList());
        System.out.println(collect);
    }
}
