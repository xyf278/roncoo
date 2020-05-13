package roncoo.education.entity;

import java.math.BigInteger;
import java.util.Date;
import java.io.Serializable;

/**
 * 课程信息-审核(CourseAudit)实体类
 *
 * @author makejava
 * @since 2020-05-13 19:55:01
 */
public class CourseAudit implements Serializable {
    private static final long serialVersionUID = 510758536569869736L;

    @Override
    public String toString() {
        return "CourseAudit{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", statusId=" + statusId +
                ", sort=" + sort +
                ", auditStatus=" + auditStatus +
                ", auditOpinion='" + auditOpinion + '\'' +
                ", lecturerUserNo=" + lecturerUserNo +
                ", categoryId1=" + categoryId1 +
                ", categoryId2=" + categoryId2 +
                ", categoryId3=" + categoryId3 +
                ", courseName='" + courseName + '\'' +
                ", courseLogo='" + courseLogo + '\'' +
                ", introduceId=" + introduceId +
                ", isFree=" + isFree +
                ", courseOriginal=" + courseOriginal +
                ", courseDiscount=" + courseDiscount +
                ", isPutaway=" + isPutaway +
                '}';
    }

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
    * 审核状态(0:待审核,1:审核通过,2:审核不通过)
    */
    private BigInteger auditStatus;
    /**
    * 审核意见
    */
    private String auditOpinion;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    public BigInteger getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(BigInteger auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }

    public BigInteger getLecturerUserNo() {
        return lecturerUserNo;
    }

    public void setLecturerUserNo(BigInteger lecturerUserNo) {
        this.lecturerUserNo = lecturerUserNo;
    }

    public BigInteger getCategoryId1() {
        return categoryId1;
    }

    public void setCategoryId1(BigInteger categoryId1) {
        this.categoryId1 = categoryId1;
    }

    public BigInteger getCategoryId2() {
        return categoryId2;
    }

    public void setCategoryId2(BigInteger categoryId2) {
        this.categoryId2 = categoryId2;
    }

    public BigInteger getCategoryId3() {
        return categoryId3;
    }

    public void setCategoryId3(BigInteger categoryId3) {
        this.categoryId3 = categoryId3;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseLogo() {
        return courseLogo;
    }

    public void setCourseLogo(String courseLogo) {
        this.courseLogo = courseLogo;
    }

    public Long getIntroduceId() {
        return introduceId;
    }

    public void setIntroduceId(Long introduceId) {
        this.introduceId = introduceId;
    }

    public int getIsFree() {
        return isFree;
    }

    public void setIsFree(int isFree) {
        this.isFree = isFree;
    }

    public Double getCourseOriginal() {
        return courseOriginal;
    }

    public void setCourseOriginal(Double courseOriginal) {
        this.courseOriginal = courseOriginal;
    }

    public Double getCourseDiscount() {
        return courseDiscount;
    }

    public void setCourseDiscount(Double courseDiscount) {
        this.courseDiscount = courseDiscount;
    }

    public int getIsPutaway() {
        return isPutaway;
    }

    public void setIsPutaway(int isPutaway) {
        this.isPutaway = isPutaway;
    }

    /**
    * 讲师用户编码
    */
    private BigInteger lecturerUserNo;
    /**
    * 一级分类ID
    */
    private BigInteger categoryId1;
    /**
    * 二级分类ID
    */
    private BigInteger categoryId2;
    /**
    * 三级分类ID
    */
    private BigInteger categoryId3;
    /**
    * 课程名称
    */
    private String courseName;
    /**
    * 课程封面
    */
    private String courseLogo;
    /**
    * 课程介绍ID
    */
    private Long introduceId;
    /**
    * 是否免费：1免费，0收费
    */
    private int isFree;
    /**
    * 原价
    */
    private Double courseOriginal;
    /**
    * 优惠价
    */
    private Double courseDiscount;
    /**
    * 是否上架(1:上架，0:下架)
    */
    private int isPutaway;

}