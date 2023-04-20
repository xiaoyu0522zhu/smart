package com.qaz.esip.ax.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeanConverter {
    private static Logger logger = LoggerFactory.getLogger(BeanConverter.class);

    public static <S,T> T copy(S source,Class<T> clazz){
        T target = null;
        try {
            target = clazz.newInstance();

        }catch(Exception e){
            logger.info("类型转换异常，异常信息为："+e);
        }
        return target;
    }
}
