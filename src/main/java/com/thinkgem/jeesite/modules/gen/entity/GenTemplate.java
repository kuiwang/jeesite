/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.gen.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.validator.constraints.Length;

import com.google.common.collect.Lists;
import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 生成方案Entity
 * 
 * @author ThinkGem
 * @version 2013-10-15
 */
@XmlRootElement(name = "template")
public class GenTemplate extends DataEntity<GenTemplate> {

    private static final long serialVersionUID = 1L;

    private String category; // 分类

    private String content; // 内容

    private String fileName; // 文件名

    private String filePath; // 生成文件路径

    private String name; // 名称

    public GenTemplate() {
        super();
    }

    public GenTemplate(String id) {
        super(id);
    }

    public String getCategory() {
        return category;
    }

    @XmlTransient
    public List<String> getCategoryList() {
        if (category == null) {
            return Lists.newArrayList();
        } else {
            return Lists.newArrayList(org.apache.commons.lang3.StringUtils.split(category, ","));
        }
    }

    public String getContent() {
        return content;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    @Length(min = 1, max = 200)
    public String getName() {
        return name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCategoryList(List<String> categoryList) {
        if (categoryList == null) {
            this.category = "";
        } else {
            this.category = "," + org.apache.commons.lang3.StringUtils.join(categoryList, ",")
                    + ",";
        }
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setName(String name) {
        this.name = name;
    }

}
