/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.gen.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.thinkgem.jeesite.modules.sys.entity.Dict;

/**
 * 生成方案Entity
 * 
 * @author ThinkGem
 * @version 2013-10-15
 */
@XmlRootElement(name = "category")
public class GenCategory extends Dict {

    public static String CATEGORY_REF = "category-ref:";

    private static final long serialVersionUID = 1L;

    private List<String> childTableTemplate;// 子表模板

    private List<String> template; // 主表模板

    public GenCategory() {
        super();
    }

    @XmlElementWrapper(name = "childTable")
    @XmlElement(name = "template")
    public List<String> getChildTableTemplate() {
        return childTableTemplate;
    }

    @XmlElement(name = "template")
    public List<String> getTemplate() {
        return template;
    }

    public void setChildTableTemplate(List<String> childTableTemplate) {
        this.childTableTemplate = childTableTemplate;
    }

    public void setTemplate(List<String> template) {
        this.template = template;
    }

}
