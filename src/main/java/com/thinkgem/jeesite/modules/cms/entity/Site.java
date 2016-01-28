/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.cms.entity;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;
import com.thinkgem.jeesite.modules.sys.utils.UserUtils;

/**
 * 站点Entity
 * 
 * @author ThinkGem
 * @version 2013-05-15
 */
public class Site extends DataEntity<Site> {

    private static final long serialVersionUID = 1L;

    /**
     * 模板路径
     */
    public static final String TPL_BASE = "/WEB-INF/views/modules/cms/front/themes";

    /**
     * 获取默认站点ID
     */
    public static String defaultSiteId() {
        return "1";
    }

    /**
     * 获取当前编辑的站点编号
     */
    public static String getCurrentSiteId() {
        String siteId = (String) UserUtils.getCache("siteId");
        return StringUtils.isNotBlank(siteId) ? siteId : defaultSiteId();
    }

    /**
     * 判断是否为默认（主站）站点
     */
    public static boolean isDefault(String id) {
        return (id != null) && id.equals(defaultSiteId());
    }

    private String copyright;// 版权信息

    private String customIndexView;// 自定义首页视图文件

    private String description;// 描述，填写有助于搜索引擎优化

    private String domain;

    private String keywords;// 关键字，填写有助于搜索引擎优化

    private String logo; // 站点logo

    private String name; // 站点名称

    private String theme; // 主题

    private String title; // 站点标题

    public Site() {
        super();
    }

    public Site(String id) {
        this();
        this.id = id;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getCustomIndexView() {
        return customIndexView;
    }

    @Length(min = 0, max = 255)
    public String getDescription() {
        return description;
    }

    public String getDomain() {
        return domain;
    }

    @Length(min = 0, max = 255)
    public String getKeywords() {
        return keywords;
    }

    public String getLogo() {
        return logo;
    }

    @Length(min = 1, max = 100)
    public String getName() {
        return name;
    }

    /**
     * 获得模板方案路径。如：/WEB-INF/views/modules/cms/front/themes/jeesite
     *
     * @return
     */
    public String getSolutionPath() {
        return TPL_BASE + "/" + getTheme();
    }

    @Length(min = 1, max = 255)
    public String getTheme() {
        return theme;
    }

    @Length(min = 1, max = 100)
    public String getTitle() {
        return title;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public void setCustomIndexView(String customIndexView) {
        this.customIndexView = customIndexView;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
