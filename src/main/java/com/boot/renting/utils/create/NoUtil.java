package com.boot.renting.utils.create;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;

import java.util.Date;
import java.util.Random;

public class NoUtil {

    public static String getFileName(String suffix) {
        String file = "FILE" + DateUtil.format(new Date(), DatePattern.PURE_DATETIME_PATTERN);
        return CreateNo.getInstance().GenerateNo(file, 5) + suffix;
    }

    /**
     * 获取用户code
     */
    public static String getUserCode() {
        String file = "USER" + DateUtil.format(new Date(), DatePattern.PURE_DATETIME_PATTERN);
        return CreateNo.getInstance().GenerateNo(file, 5);
    }

    /**
     * 获取随机数
     */
    public static String getRandom(Integer num) {
        Random random = new Random();
        StringBuilder fourRandom = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            fourRandom.append(random.nextInt(9));
        }
        return fourRandom.toString();
    }

}
