package com.nero.mybatis.objectFactory.factory;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Properties;

/**
 * 自定义的objectFactory
 */
public class NeroFactory extends DefaultObjectFactory {
    private final Logger logger = LogManager.getLogger(NeroFactory.class);

    private Object temp;

    //方法2
    @Override
    public <T> T create(Class<T> type) {
        T result = super.create(type);
        logger.info("创建对象：" + result.toString());
        logger.info("是否和上次创建的是同一个对象：【" + (temp == result) + "】");
        return result;
    }

    //方法1
    @Override
    public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
        T result = super.create(type, constructorArgTypes, constructorArgs);
        logger.info("创建对象：" + result.toString());
        temp = result;
        return result;
    }

    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
        logger.info("初始化参数：【" + properties.toString() + "】");
    }
}
