/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.common.supcan.treelist.cols;

import com.thinkgem.jeesite.common.supcan.annotation.treelist.cols.SupCol;
import com.thinkgem.jeesite.common.utils.ObjectUtils;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
import com.thoughtworks.xstream.converters.extended.ToAttributedValueConverter;

/**
 * 硕正TreeList Cols Col
 * 
 * @author WangZhen
 * @version 2013-11-04
 */
@XStreamAlias("Col")
@XStreamConverter(value = ToAttributedValueConverter.class, strings = { "text" })
public class Col {

    /**
     * 水平对齐 left / center / right
     */
    @XStreamAsAttribute
    private String align;

    /**
     * 列标题文字的对齐 left / center / right center
     */
    @XStreamAsAttribute
    private String alignHeader;

    /**
     * 位于多层表头的层位置 数字，从0开始
     */
    @XStreamAsAttribute
    private String atLayer;

    /**
     * 数据类型 有 string / int / double / bool / date / datetime 这几种
     */
    @XStreamAsAttribute
    private String dataType;

    /**
     * 小数位数 -1至8, 仅用于 double 型。 -1表示小数位数不确定, 可以在0位和8位之间可以任意输入, 默认： 2
     */
    @XStreamAsAttribute
    private String decimal;

    /**
     * 默认值 串, 用于新插入行操作时的初始, 支持以 "=" 开头的表达式，例如 defaultValue="=now( )",
     * 表示将日期型默认值设为当天 (无) 注: 仅对新插入的行有效
     */
    @XStreamAsAttribute
    private String defaultValue;

    /**
     * 用于显示的格式掩码表达式 表达式的内容包括显示内容、 背景色、 文字色、 左图、 右图.
     * 请详见Treelist帮助文档的"3.几个重要的属性" formatDate(data,'YYYY-MM-DD')
     * =if(data=='1','关闭',if(data=='2','已完成',if(data=='3','未接收','进行中')))
     */
    @XStreamAsAttribute
    private String displayMask;

    /**
     * 下拉列(droplis, droptreelist)单元格的文字显示方式 0 - 仅显示文字部分; 1 - 仅显示键值(即key)部分;
     * 2 - 键值+" - "+文字;
     */
    @XStreamAsAttribute
    private String dropDisplayType;

    /**
     * 位于多层表头的层位置 数字，从0开始
     */
    @XStreamAsAttribute
    private String extentRows;

    /**
     * 采用的字体 数字，指向在<Fonts>中定义的字体的顺序号, 从0开始计数, 等级高于<Properties>中的同名属性 -1
     */
    @XStreamAsAttribute
    private String fontIndex;

    /**
     * 归属组ID
     */
    @XStreamOmitField
    private String groupId;

    /**
     * 列标题采用的字体 数字，指向在<Fonts>中定义的字体的顺序号, 从0开始计数, 等级高于<Properties>中的同名属性 -1
     */
    @XStreamAsAttribute
    private String headerFontIndex;

    ///////////////////////////////////// 外观 //////////////////////////////////////

    /**
     * 列标题旁边的小图标 可以是图标的URL, 也可以是如下格式的串: 　　url=[?];pos=[?] pos用于指定图标的位置,
     * 是水平(left/right)、 垂直(top/middle/bottom)方向的组合. 举例如下:
     * 　　url=../ac.png;pos=right,bottom 建议采用png或ico这类透明的图片
     */
    @XStreamAsAttribute
    private String headerIcon;

    /**
     * 鼠标点击上述小图标时弹出的提示文字 文字串, 如果不定义这个串，鼠标点击小图标时将触发Clicked事件
     */
    @XStreamAsAttribute
    private String headerIconTip;

    /**
     * 列标题文字颜色 颜色串 #000000
     */
    @XStreamAsAttribute
    private String headerTextColor;

    /**
     * 是否隐藏, true - 隐藏; false - 显示; absHide 或 absTrue - 绝对隐藏，不会被鼠标右键菜单选择;
     * absShow 或 absFalse - 绝对显示，不会被鼠标右键菜单选择;
     */
    @XStreamAsAttribute
    private String isHide;

    /**
     * 是否超链接列 true/false false
     */
    @XStreamAsAttribute
    private String isHyperlink;

    /**
     * 是否以千位符分隔显示 true/false 默认：true 注: 仅用于 datatype 为 int 或 double 时
     */
    @XStreamAsAttribute
    private String isThousandSeparat;

    /**
     * 内容是否允许重复 true/false
     */
    @XStreamAsAttribute
    private String isUnique = "false";

    /**
     * 列的最小宽度 像素数 10
     */
    @XStreamAsAttribute
    private String minWidth;

    /**
     * 是否允许列的拖动操作 ,默认：true 注: 如果<Properties>中的moveAble设为false,
     * 则本moveAble无效(false)
     */
    @XStreamAsAttribute
    private String moveAble;

    ///////////////////////////////////// 主要 //////////////////////////////////////
    /**
     * 列名 串, 相当于字段名
     */
    @XStreamAsAttribute
    private String name;

    /**
     * 是否允许为空 true/false
     */
    @XStreamAsAttribute
    private String nullAble = "true";

    /**
     * 是否允许被粘贴 ,默认：supcan.xml true - 允许; false - 不允许; supcan.xml -
     * 通常是允许，但是当列不可编辑时(包括隐藏时)，将以supcan.xml中的 <pasteAbleWhenUnEditAble>
     * 的设定为准;
     */
    @XStreamAsAttribute
    private String pasteAble;

    /**
     * 字段排序，注解定义时有效
     */
    @XStreamOmitField
    private int sort;

    /**
     * 点击列标题是否执行排序 true/false ,默认：true 注: 如果<Properties>中的sortAble设为false,
     * 则本sortAble无效(false)
     */
    @XStreamAsAttribute
    private String sortAble;

    /**
     * 小计表达式
     */
    @XStreamAsAttribute
    private String subTotalExpress;

    /**
     * 列的显示名称
     */
    private String text;

    /**
     * 指向另一列的列名，显示的内容存放在该列中，是另类 key-value对 的简易字典解决方案
     */
    @XStreamAsAttribute
    private String textId;

    /**
     * 合计表达式
     */
    @XStreamAsAttribute
    private String totalExpress;

    /**
     * 垂直对齐 top / vcenter(或middle) / bottom vcenter
     */
    @XStreamAsAttribute
    private String vAlign;

    /**
     * 虚拟列的数据分隔符 串，比如"/",
     * 如果设了这个串，在加载数据后，程序将按这个分隔符自动对各行数据进行处理，使其看上去呈现多列的效果。此外,
     * 各个段中纵向、横向如果有连续相同的数据，将自动呈现纵、横的合并效果 (无) 注1: 仅改变显示效果，并不改变数据; 注2:
     * VColSep列有诸多限制，例如只能用于string型、不能作为树的排序列等等;
     */
    @XStreamAsAttribute
    private String VColSep;

    /**
     * VColSepStyle 虚拟列的合并方式 row - 只允许跨行的垂直合并; col - 只允许跨列的横向合并; row,col -
     * 跨行、跨列自动合并;
     */
    @XStreamAsAttribute
    private String VColSepStyle;

    /**
     * 列宽 整数 - 绝对宽度 (单位:像素数); 百分比 - 窗口宽度的百分比, 如：20%; 为小于1的分数 -
     * 比例因子，用于分配剩余的宽度, 如0.2; fitHeader 或 header - 自动伸展到能使表头标题能够完整显示;
     */
    @XStreamAsAttribute
    private String width;

    public Col() {

    }

    public Col(String name) {
        this.name = name;
    }

    public Col(String name, String text) {
        this(name);
        this.text = text;
    }

    public Col(SupCol supCol) {
        ObjectUtils.annotationToObject(supCol, this);
    }

    public String getAlign() {
        return align;
    }

    public String getAlignHeader() {
        return alignHeader;
    }

    public String getAtLayer() {
        return atLayer;
    }

    public String getDataType() {
        return dataType;
    }

    public String getDecimal() {
        return decimal;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public String getDisplayMask() {
        return displayMask;
    }

    public String getDropDisplayType() {
        return dropDisplayType;
    }

    public String getExtentRows() {
        return extentRows;
    }

    public String getFontIndex() {
        return fontIndex;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getHeaderFontIndex() {
        return headerFontIndex;
    }

    public String getHeaderIcon() {
        return headerIcon;
    }

    public String getHeaderIconTip() {
        return headerIconTip;
    }

    public String getHeaderTextColor() {
        return headerTextColor;
    }

    public String getIsHide() {
        return isHide;
    }

    public String getIsHyperlink() {
        return isHyperlink;
    }

    public String getIsThousandSeparat() {
        return isThousandSeparat;
    }

    public String getIsUnique() {
        return isUnique;
    }

    public String getMinWidth() {
        return minWidth;
    }

    public String getMoveAble() {
        return moveAble;
    }

    public String getName() {
        return name;
    }

    public String getNullAble() {
        return nullAble;
    }

    public String getPasteAble() {
        return pasteAble;
    }

    public int getSort() {
        return sort;
    }

    public String getSortAble() {
        return sortAble;
    }

    public String getSubTotalExpress() {
        return subTotalExpress;
    }

    public String getText() {
        return text;
    }

    public String getTextId() {
        return textId;
    }

    public String getTotalExpress() {
        return totalExpress;
    }

    public String getvAlign() {
        return vAlign;
    }

    public String getVColSep() {
        return VColSep;
    }

    public String getVColSepStyle() {
        return VColSepStyle;
    }

    public String getWidth() {
        return width;
    }

    public void setAlign(String align) {
        this.align = align;
    }

    public void setAlignHeader(String alignHeader) {
        this.alignHeader = alignHeader;
    }

    public void setAtLayer(String atLayer) {
        this.atLayer = atLayer;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public void setDecimal(String decimal) {
        this.decimal = decimal;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public void setDisplayMask(String displayMask) {
        this.displayMask = displayMask;
    }

    public void setDropDisplayType(String dropDisplayType) {
        this.dropDisplayType = dropDisplayType;
    }

    public void setExtentRows(String extentRows) {
        this.extentRows = extentRows;
    }

    public void setFontIndex(String fontIndex) {
        this.fontIndex = fontIndex;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setHeaderFontIndex(String headerFontIndex) {
        this.headerFontIndex = headerFontIndex;
    }

    public void setHeaderIcon(String headerIcon) {
        this.headerIcon = headerIcon;
    }

    public void setHeaderIconTip(String headerIconTip) {
        this.headerIconTip = headerIconTip;
    }

    public void setHeaderTextColor(String headerTextColor) {
        this.headerTextColor = headerTextColor;
    }

    public void setIsHide(String isHide) {
        this.isHide = isHide;
    }

    public void setIsHyperlink(String isHyperlink) {
        this.isHyperlink = isHyperlink;
    }

    public void setIsThousandSeparat(String isThousandSeparat) {
        this.isThousandSeparat = isThousandSeparat;
    }

    public void setIsUnique(String isUnique) {
        this.isUnique = isUnique;
    }

    public void setMinWidth(String minWidth) {
        this.minWidth = minWidth;
    }

    public void setMoveAble(String moveAble) {
        this.moveAble = moveAble;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNullAble(String nullAble) {
        this.nullAble = nullAble;
    }

    public void setPasteAble(String pasteAble) {
        this.pasteAble = pasteAble;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public void setSortAble(String sortAble) {
        this.sortAble = sortAble;
    }

    public void setSubTotalExpress(String subTotalExpress) {
        this.subTotalExpress = subTotalExpress;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTextId(String textId) {
        this.textId = textId;
    }

    public void setTotalExpress(String totalExpress) {
        this.totalExpress = totalExpress;
    }

    public void setvAlign(String vAlign) {
        this.vAlign = vAlign;
    }

    public void setVColSep(String vColSep) {
        VColSep = vColSep;
    }

    public void setVColSepStyle(String vColSepStyle) {
        VColSepStyle = vColSepStyle;
    }

    public void setWidth(String width) {
        this.width = width;
    }

}
