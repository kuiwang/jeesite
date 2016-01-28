/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.cms.entity;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;
import com.thinkgem.jeesite.modules.sys.entity.User;

/**
 * 评论Entity
 * 
 * @author ThinkGem
 * @version 2013-05-15
 */
public class Comment extends DataEntity<Comment> {

    private static final long serialVersionUID = 1L;

    private Date auditDate; // 审核时间

    private User auditUser; // 审核人

    private Category category;// 分类编号

    private String content; // 评论内容

    private String contentId; // 归属分类内容的编号（Article.id、Photo.id、Download.id）

    private Date createDate;// 评论时间

    private String delFlag; // 删除标记删除标记（0：正常；1：删除；2：审核）

    private String ip; // 评论IP

    private String name; // 评论姓名

    private String title; // 归属分类内容的标题（Article.title、Photo.title、Download.title）

    public Comment() {
        super();
        this.delFlag = DEL_FLAG_AUDIT;
    }

    public Comment(Category category) {
        this();
        this.category = category;
    }

    public Comment(String id) {
        this();
        this.id = id;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public User getAuditUser() {
        return auditUser;
    }

    @NotNull
    public Category getCategory() {
        return category;
    }

    @Length(min = 1, max = 255)
    public String getContent() {
        return content;
    }

    @NotNull
    public String getContentId() {
        return contentId;
    }

    @Override
    @NotNull
    public Date getCreateDate() {
        return createDate;
    }

    @Override
    @Length(min = 1, max = 1)
    public String getDelFlag() {
        return delFlag;
    }

    public String getIp() {
        return ip;
    }

    @Length(min = 1, max = 100)
    public String getName() {
        return name;
    }

    @Length(min = 1, max = 255)
    public String getTitle() {
        return title;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public void setAuditUser(User auditUser) {
        this.auditUser = auditUser;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    @Override
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
