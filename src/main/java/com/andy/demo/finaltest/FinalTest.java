package com.andy.demo.finaltest;

import lombok.Data;

/**
 * @author: weipeng
 * @create: 2020-04-30 9:59
 * @description:
 */
@Data
class Value {
    int v;

    public Value(int v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return String.valueOf(v);
    }
}

public class FinalTest {

    final int f1 = 1;
    final int f2;

    public FinalTest() {
        f2 = 2;
    }

    public static void main(String[] args) {
        final int value1 = 1;
        // value1 = 4;
        final double value2;
        value2 = 2.0;
        final Value value3 = new Value(1);
        value3.v = 4;
        System.out.println(Integer.valueOf(value3.toString()));
    }
}
