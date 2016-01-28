/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.act.utils;

import java.util.Date;

/**
 * 属性数据类型
 * 
 * @author ThinkGem
 * @version 2013-11-03
 */
public enum PropertyType {

    B(Boolean.class), D(Date.class), F(Float.class), I(Integer.class), L(Long.class), N(
            Double.class), S(String.class), SD(java.sql.Date.class);

    private Class<?> clazz;

    private PropertyType(Class<?> clazz) {
        this.clazz = clazz;
    }

    public Class<?> getValue() {
        return clazz;
    }
}
