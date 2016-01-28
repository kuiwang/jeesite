/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.test.entity;

import java.util.Date;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.thinkgem.jeesite.common.persistence.DataEntity;
import com.thinkgem.jeesite.modules.sys.entity.Area;
import com.thinkgem.jeesite.modules.sys.entity.Office;
import com.thinkgem.jeesite.modules.sys.entity.User;

/**
 * 单表生成Entity
 * 
 * @author ThinkGem
 * @version 2015-04-06
 */
public class TestData extends DataEntity<TestData> {

    private static final long serialVersionUID = 1L;

    private Area area; // 归属区域

    private Date beginInDate; // 开始 加入日期

    private Date endInDate; // 结束 加入日期

    private Date inDate; // 加入日期

    private String name; // 名称

    private Office office; // 归属部门

    private String sex; // 性别

    private User user; // 归属用户

    public TestData() {
        super();
    }

    public TestData(String id) {
        super(id);
    }

    public Area getArea() {
        return area;
    }

    public Date getBeginInDate() {
        return beginInDate;
    }

    public Date getEndInDate() {
        return endInDate;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getInDate() {
        return inDate;
    }

    @Length(min = 0, max = 100, message = "名称长度必须介于 0 和 100 之间")
    public String getName() {
        return name;
    }

    public Office getOffice() {
        return office;
    }

    @Length(min = 0, max = 1, message = "性别长度必须介于 0 和 1 之间")
    public String getSex() {
        return sex;
    }

    public User getUser() {
        return user;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public void setBeginInDate(Date beginInDate) {
        this.beginInDate = beginInDate;
    }

    public void setEndInDate(Date endInDate) {
        this.endInDate = endInDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
