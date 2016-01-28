/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.oa.entity;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.google.common.collect.Lists;
import com.thinkgem.jeesite.common.persistence.DataEntity;
import com.thinkgem.jeesite.common.utils.Collections3;
import com.thinkgem.jeesite.common.utils.IdGen;
import com.thinkgem.jeesite.modules.sys.entity.User;

/**
 * 通知通告Entity
 * 
 * @author ThinkGem
 * @version 2014-05-16
 */
public class OaNotify extends DataEntity<OaNotify> {

    private static final long serialVersionUID = 1L;

    private String content; // 类型

    private String files; // 附件

    private boolean isSelf; // 是否只查询自己的通知

    private List<OaNotifyRecord> oaNotifyRecordList = Lists.newArrayList();

    private String readFlag; // 本人阅读状态

    private String readNum; // 已读

    private String status; // 状态

    private String title; // 标题

    private String type; // 类型

    private String unReadNum; // 未读

    public OaNotify() {
        super();
    }

    public OaNotify(String id) {
        super(id);
    }

    public String getContent() {
        return content;
    }

    @Length(min = 0, max = 2000, message = "附件长度必须介于 0 和 2000 之间")
    public String getFiles() {
        return files;
    }

    /**
     * 获取通知发送记录用户ID
     * 
     * @return
     */
    public String getOaNotifyRecordIds() {
        return Collections3.extractToString(oaNotifyRecordList, "user.id", ",");
    }

    public List<OaNotifyRecord> getOaNotifyRecordList() {
        return oaNotifyRecordList;
    }

    /**
     * 获取通知发送记录用户Name
     * 
     * @return
     */
    public String getOaNotifyRecordNames() {
        return Collections3.extractToString(oaNotifyRecordList, "user.name", ",");
    }

    public String getReadFlag() {
        return readFlag;
    }

    public String getReadNum() {
        return readNum;
    }

    @Length(min = 0, max = 1, message = "状态长度必须介于 0 和 1 之间")
    public String getStatus() {
        return status;
    }

    @Length(min = 0, max = 200, message = "标题长度必须介于 0 和 200 之间")
    public String getTitle() {
        return title;
    }

    @Length(min = 0, max = 1, message = "类型长度必须介于 0 和 1 之间")
    public String getType() {
        return type;
    }

    public String getUnReadNum() {
        return unReadNum;
    }

    public boolean isSelf() {
        return isSelf;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFiles(String files) {
        this.files = files;
    }

    /**
     * 设置通知发送记录用户ID
     * 
     * @return
     */
    public void setOaNotifyRecordIds(String oaNotifyRecord) {
        this.oaNotifyRecordList = Lists.newArrayList();
        for (String id : org.apache.commons.lang3.StringUtils.split(oaNotifyRecord, ",")) {
            OaNotifyRecord entity = new OaNotifyRecord();
            entity.setId(IdGen.uuid());
            entity.setOaNotify(this);
            entity.setUser(new User(id));
            entity.setReadFlag("0");
            this.oaNotifyRecordList.add(entity);
        }
    }

    public void setOaNotifyRecordList(List<OaNotifyRecord> oaNotifyRecordList) {
        this.oaNotifyRecordList = oaNotifyRecordList;
    }

    /**
     * 设置通知发送记录用户Name
     * 
     * @return
     */
    public void setOaNotifyRecordNames(String oaNotifyRecord) {
        // 什么也不做
    }

    public void setReadFlag(String readFlag) {
        this.readFlag = readFlag;
    }

    public void setReadNum(String readNum) {
        this.readNum = readNum;
    }

    public void setSelf(boolean isSelf) {
        this.isSelf = isSelf;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUnReadNum(String unReadNum) {
        this.unReadNum = unReadNum;
    }
}
