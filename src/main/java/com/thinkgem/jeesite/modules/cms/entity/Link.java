/**
\ * Copyright &copy; 2012-2013 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.cms.entity;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;
import com.thinkgem.jeesite.modules.sys.entity.User;

/**
 * 链接Entity
 * 
 * @author ThinkGem
 * @version 2013-05-15
 */
public class Link extends DataEntity<Link> {

    private static final long serialVersionUID = 1L;

    private Category category;// 分类编号

    private String color; // 标题颜色（red：红色；green：绿色；blue：蓝色；yellow：黄色；orange：橙色）

    private String href; // 链接地址

    private String image; // 链接图片

    private String title; // 链接名称

    private User user; //关联用户

    private Integer weight; // 权重，越大越靠前

    private Date weightDate;// 权重期限，超过期限，将weight设置为0

    public Link() {
        super();
        this.weight = 0;
    }

    public Link(Category category) {
        this();
        this.category = category;
    }

    public Link(String id) {
        this();
        this.id = id;
    }

    @NotNull
    public Category getCategory() {
        return category;
    }

    @Length(min = 0, max = 50)
    public String getColor() {
        return color;
    }

    @Length(min = 0, max = 255)
    public String getHref() {
        return href;
    }

    @Length(min = 0, max = 255)
    public String getImage() {
        return image;
    }

    @Length(min = 1, max = 255)
    public String getTitle() {
        return title;
    }

    public User getUser() {
        return user;
    }

    public Integer getWeight() {
        return weight;
    }

    public Date getWeightDate() {
        return weightDate;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setWeightDate(Date weightDate) {
        this.weightDate = weightDate;
    }

}
