/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.gen.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 生成方案Entity
 * 
 * @author ThinkGem
 * @version 2013-10-15
 */
public class GenScheme extends DataEntity<GenScheme> {

    private static final long serialVersionUID = 1L;

    private String category; // 分类

    private String flag; // 0：保存方案； 1：保存方案并生成代码

    private String functionAuthor; // 生成功能作者

    private String functionName; // 生成功能名

    private String functionNameSimple; // 生成功能名（简写）

    private GenTable genTable; // 业务表名

    private String moduleName; // 生成模块名

    private String name; // 名称

    private String packageName; // 生成包路径

    private Boolean replaceFile; // 是否替换现有文件    0：不替换；1：替换文件

    private String subModuleName; // 生成子模块名

    public GenScheme() {
        super();
    }

    public GenScheme(String id) {
        super(id);
    }

    public String getCategory() {
        return category;
    }

    public String getFlag() {
        return flag;
    }

    public String getFunctionAuthor() {
        return functionAuthor;
    }

    public String getFunctionName() {
        return functionName;
    }

    public String getFunctionNameSimple() {
        return functionNameSimple;
    }

    public GenTable getGenTable() {
        return genTable;
    }

    public String getModuleName() {
        return moduleName;
    }

    @Length(min = 1, max = 200)
    public String getName() {
        return name;
    }

    public String getPackageName() {
        return packageName;
    }

    public Boolean getReplaceFile() {
        return replaceFile;
    }

    public String getSubModuleName() {
        return subModuleName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public void setFunctionAuthor(String functionAuthor) {
        this.functionAuthor = functionAuthor;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public void setFunctionNameSimple(String functionNameSimple) {
        this.functionNameSimple = functionNameSimple;
    }

    public void setGenTable(GenTable genTable) {
        this.genTable = genTable;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public void setReplaceFile(Boolean replaceFile) {
        this.replaceFile = replaceFile;
    }

    public void setSubModuleName(String subModuleName) {
        this.subModuleName = subModuleName;
    }

}
