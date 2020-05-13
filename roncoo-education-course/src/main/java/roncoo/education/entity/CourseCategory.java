package roncoo.education.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 课程分类(CourseCategory)实体类
 *
 * @author makejava
 * @since 2020-05-13 17:24:36
 */
public class CourseCategory implements Serializable {
    @Override
    public String toString() {
        return "CourseCategory{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", statusId=" + statusId +
                ", sort=" + sort +
                ", parentId=" + parentId +
                ", categoryType=" + categoryType +
                ", categoryName='" + categoryName + '\'' +
                ", floor=" + floor +
                ", remark='" + remark + '\'' +
                '}';
    }

    private static final long serialVersionUID = -96441093604938241L;
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
    * 状态(1:正常，0:禁用)
    */
    private Boolean statusId;
    /**
    * 排序
    */
    private Integer sort;
    /**
    * 父分类ID
    */
    private Long parentId;
    /**
    * 分类类型(1课程，2资源)
    */
    private int categoryType;
    /**
    * 分类名称
    */
    private String categoryName;
    /**
    * 层级
    */
    private Boolean floor;
    /**
    * 备注
    */
    private String remark;


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

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public int getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(int categoryType) {
        this.categoryType = categoryType;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Boolean getFloor() {
        return floor;
    }

    public void setFloor(Boolean floor) {
        this.floor = floor;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}