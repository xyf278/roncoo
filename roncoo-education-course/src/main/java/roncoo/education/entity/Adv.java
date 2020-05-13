package roncoo.education.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 广告信息(Adv)实体类
 *
 * @author makejava
 * @since 2020-05-13 21:13:13
 */
public class Adv implements Serializable {
    private static final long serialVersionUID = 689810829222730868L;

    @Override
    public String toString() {
        return "Adv{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", statusId=" + statusId +
                ", sort=" + sort +
                ", advTitle='" + advTitle + '\'' +
                ", advImg='" + advImg + '\'' +
                ", advUrl='" + advUrl + '\'' +
                ", advTarget='" + advTarget + '\'' +
                ", advLocation=" + advLocation +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", platShow=" + platShow +
                '}';
    }

    /**
    * 主键
    */
    private Integer id;
    /**
    * 创建时间
    */
    private Date gmtCreate;
    /**
    * 修改时间
    */
    private Date gmtModified;
    /**
    * 状态(1:正常，0:禁用)
    */
    private Boolean statusId;
    /**
    * 排序
    */
    private Integer sort;
    /**
    * 广告标题
    */
    private String advTitle;
    /**
    * 广告图片
    */
    private String advImg;
    /**
    * 广告链接
    */
    private String advUrl;
    /**
    * 广告跳转方式
    */
    private String advTarget;
    /**
    * 广告位置(1首页轮播)
    */
    private int advLocation;
    /**
    * 开始时间
    */
    private Date beginTime;
    /**
    * 结束时间
    */
    private Date endTime;
    /**
    * 位置(0电脑端，1微信端)
    */
    private int platShow;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Boolean getStatusId() {
        return statusId;
    }

    public void setStatusId(Boolean statusId) {
        this.statusId = statusId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getAdvTitle() {
        return advTitle;
    }

    public void setAdvTitle(String advTitle) {
        this.advTitle = advTitle;
    }

    public String getAdvImg() {
        return advImg;
    }

    public void setAdvImg(String advImg) {
        this.advImg = advImg;
    }

    public String getAdvUrl() {
        return advUrl;
    }

    public void setAdvUrl(String advUrl) {
        this.advUrl = advUrl;
    }

    public String getAdvTarget() {
        return advTarget;
    }

    public void setAdvTarget(String advTarget) {
        this.advTarget = advTarget;
    }

    public int getAdvLocation() {
        return advLocation;
    }

    public void setAdvLocation(int advLocation) {
        this.advLocation = advLocation;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getPlatShow() {
        return platShow;
    }

    public void setPlatShow(int platShow) {
        this.platShow = platShow;
    }

}