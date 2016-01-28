/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAttribute;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 字典Entity
 * 
 * @author ThinkGem
 * @version 2013-05-15
 */
public class Dict extends DataEntity<Dict> {

    private static final long serialVersionUID = 1L;

    private String description;// 描述

    private String label; // 标签名

    private String parentId;//父Id

    private Integer sort; // 排序

    private String type; // 类型

    private String value; // 数据值

    public Dict() {
        super();
    }

    public Dict(String id) {
        super(id);
    }

    public Dict(String value, String label) {
        this.value = value;
        this.label = label;
    }

    @XmlAttribute
    @Length(min = 0, max = 100)
    public String getDescription() {
        return description;
    }

    @XmlAttribute
    @Length(min = 1, max = 100)
    public String getLabel() {
        return label;
    }

    @Length(min = 1, max = 100)
    public String getParentId() {
        return parentId;
    }

    @NotNull
    public Integer getSort() {
        return sort;
    }

    @Length(min = 1, max = 100)
    public String getType() {
        return type;
    }

    @XmlAttribute
    @Length(min = 1, max = 100)
    public String getValue() {
        return value;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return label;
    }
}
