package com.boot.renting.utils.create;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;

import java.util.Date;

public class NoUtil {

    public static String getFileName(String suffix) {
        String file = "FILE" + DateUtil.format(new Date(), DatePattern.PURE_DATETIME_PATTERN);
        return CreateNo.getInstance().GenerateNo(file, 5) + suffix;
    }

}
