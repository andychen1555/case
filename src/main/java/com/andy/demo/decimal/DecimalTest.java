package com.andy.demo.decimal;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author: weipeng
 * @create: 2020-03-18 20:10
 * @description:
 */
public class DecimalTest {
    public static void main(String[] args) {
        String number = "0.01";
        BigDecimal bigDecimal = Cal.iputNumConvertPercent(new BigDecimal(number));
        System.out.println(bigDecimal);
    }

    public static class Cal {
        /**
         * 输入数值转换为百分比显示 ex: 70 * 0.01 = 0.7
         */
        public static BigDecimal iputNumConvertPercent(BigDecimal number) {
            if (Objects.isNull(number)) {
                // 输入值不存在,赋默认值为 0
                return new BigDecimal(0);
            }
            return number.multiply(BigDecimal.valueOf(0.01));
        }
    }

}
