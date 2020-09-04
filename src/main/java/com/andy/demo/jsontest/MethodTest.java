package com.andy.demo.jsontest;

/**
 * @author: weipeng
 * @create: 2020-05-28 15:28
 * @description:
 */
public class MethodTest {
    public static void main(String[] args) {
//        User user = new User();
//        user.setName("yyy");
//        System.out.println(user);
//        changeUser(user);
//        System.out.println(user);

        String idCard = "16cf7573-bc08-40e8-affd-6464cd79b30e";
//        String s = idCard.replaceAll("(\\d{4})\\d{10}(\\w{4})", "$1*****$2");
//        String s = idCard.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
//        System.out.println(idCard);
        System.out.println(getEncryptCode(idCard, 2, 3));

    }

    private static String changeUser(User u) {
        u.setName("tome");
        u.setAge(18);
        return "ok";
    }

    /**
     * @param code 要隐藏显示的字符串
     * @param head 前面保留的位数
     * @param tail 后面保留的位数
     * @return 处理后的字符串
     */
    public static String getEncryptCode(String code, int head, int tail) {
        // 中间要隐藏的位数
        int body = code.length() - head - tail;
        if (body < 0) {
            return code;
        }
        // 将字符串拆成三部分，并指定每部分长度的正则表达式
        String regexVar = "(\\S{%d})(\\S{%d})(\\S{%d})";
        String regex = String.format(regexVar, head, body, tail);
        // 获取字符串中间要隐藏的部分，并替换成对应长度的*
        String bodyPart = code.replaceAll(regex, "$2");
        String bodyEncrypt = bodyPart.replaceAll("\\S", "*");
        // 处理生成字符串replacement = "$1*****$3" 中间是对应长度的*号
        String replacement = String.format("$1%s$3", bodyEncrypt);
        return code.replaceAll(regex, replacement);
    }
}
