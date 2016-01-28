/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.oa.entity;

import java.util.Date;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;
import com.thinkgem.jeesite.modules.sys.entity.User;

/**
 * 通知通告记录Entity
 * 
 * @author ThinkGem
 * @version 2014-05-16
 */
public class OaNotifyRecord extends DataEntity<OaNotifyRecord> {

    private static final long serialVersionUID = 1L;

    private OaNotify oaNotify; // 通知通告ID

    private Date readDate; // 阅读时间

    private String readFlag; // 阅读标记（0：未读；1：已读）

    private User user; // 接受人

    public OaNotifyRecord() {
        super();
    }

    public OaNotifyRecord(OaNotify oaNotify) {
        this.oaNotify = oaNotify;
    }

    public OaNotifyRecord(String id) {
        super(id);
    }

    public OaNotify getOaNotify() {
        return oaNotify;
    }

    public Date getReadDate() {
        return readDate;
    }

    @Length(min = 0, max = 1, message = "阅读标记（0：未读；1：已读）长度必须介于 0 和 1 之间")
    public String getReadFlag() {
        return readFlag;
    }

    public User getUser() {
        return user;
    }

    public void setOaNotify(OaNotify oaNotify) {
        this.oaNotify = oaNotify;
    }

    public void setReadDate(Date readDate) {
        this.readDate = readDate;
    }

    public void setReadFlag(String readFlag) {
        this.readFlag = readFlag;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
