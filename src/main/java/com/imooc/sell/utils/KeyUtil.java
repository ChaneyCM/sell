package com.imooc.sell.utils;

import java.util.Random;

public class KeyUtil {

    // 生成唯一的主键，格式：时间+随机数    (synchronized关键字的实际使用~虽然重复的可能性极小，但是必须加synchronized才能完全避免重复)
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
