package com.milotnt.service.factory;

import java.util.Random;

/**
 * 用于生成随机 ID 的实用工具类。
 */
public class IdGenerator {

    /**
     * 生成带有特定前缀的随机 ID。
     *
     * @return 生成的 ID。
     */
    public static Integer generateId() {
        // 创建一个 Random 对象以生成随机数字
        Random random = new Random();

        // 初始化 ID 前缀
        String idPrefix = "2024";

        // 生成5位随机数字并附加到前缀
        for (int i = 0; i < 5; i++) {
            idPrefix += random.nextInt(10);
        }

        // 将生成的字符串转换为整数类型并返回
        return Integer.parseInt(idPrefix);
    }
}
