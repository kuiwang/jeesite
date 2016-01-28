/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 菜单Entity
 * 
 * @author ThinkGem
 * @version 2013-05-15
 */
public class Menu extends DataEntity<Menu> {

    private static final long serialVersionUID = 1L;

    @JsonIgnore
    public static String getRootId() {
        return "1";
    }

    @JsonIgnore
    public static void sortList(List<Menu> list, List<Menu> sourcelist, String parentId,
            boolean cascade) {
        for (int i = 0; i < sourcelist.size(); i++) {
            Menu e = sourcelist.get(i);
            if ((e.getParent() != null) && (e.getParent().getId() != null)
                    && e.getParent().getId().equals(parentId)) {
                list.add(e);
                if (cascade) {
                    // 判断是否还有子节点, 有则继续获取子节点
                    for (int j = 0; j < sourcelist.size(); j++) {
                        Menu child = sourcelist.get(j);
                        if ((child.getParent() != null) && (child.getParent().getId() != null)
                                && child.getParent().getId().equals(e.getId())) {
                            sortList(list, sourcelist, e.getId(), true);
                            break;
                        }
                    }
                }
            }
        }
    }

    private String href; // 链接

    private String icon; // 图标

    private String isShow; // 是否在菜单中显示（1：显示；0：不显示）

    private String name; // 名称

    private Menu parent; // 父级菜单

    private String parentIds; // 所有父级编号

    private String permission; // 权限标识

    private Integer sort; // 排序

    private String target; // 目标（ mainFrame、_blank、_self、_parent、_top）

    private String userId;

    public Menu() {
        super();
        this.sort = 30;
        this.isShow = "1";
    }

    public Menu(String id) {
        super(id);
    }

    @Length(min = 0, max = 2000)
    public String getHref() {
        return href;
    }

    @Length(min = 0, max = 100)
    public String getIcon() {
        return icon;
    }

    @Length(min = 1, max = 1)
    public String getIsShow() {
        return isShow;
    }

    @Length(min = 1, max = 100)
    public String getName() {
        return name;
    }

    @JsonBackReference
    @NotNull
    public Menu getParent() {
        return parent;
    }

    public String getParentId() {
        return (parent != null) && (parent.getId() != null) ? parent.getId() : "0";
    }

    @Length(min = 1, max = 2000)
    public String getParentIds() {
        return parentIds;
    }

    @Length(min = 0, max = 200)
    public String getPermission() {
        return permission;
    }

    @NotNull
    public Integer getSort() {
        return sort;
    }

    @Length(min = 0, max = 20)
    public String getTarget() {
        return target;
    }

    public String getUserId() {
        return userId;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParent(Menu parent) {
        this.parent = parent;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return name;
    }
}
