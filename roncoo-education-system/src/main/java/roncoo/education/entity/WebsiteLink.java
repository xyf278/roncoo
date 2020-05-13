package roncoo.education.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 站点友情链接(WebsiteLink)实体类
 *
 * @author makejava
 * @since 2020-05-11 21:09:24
 */
public class WebsiteLink implements Serializable {
    private static final long serialVersionUID = 258094359763756120L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 创建时间
    */
    private Date gmtCreate;
    /**
    * 修改时间
    */
    private Date gmtModified;
    /**
    * 状态(1有效, 0无效)
    */
    private Boolean statusId;
    /**
    * 排序
    */
    private Integer sort;
    /**
    * 名称
    */
    private String linkName;
    /**
    * 链接
    */
    private String linkUrl;
    /**
    * 跳转方式(_blank，_self)
    */
    private String linkTarget;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getLinkTarget() {
        return linkTarget;
    }

    public void setLinkTarget(String linkTarget) {
        this.linkTarget = linkTarget;
    }

}