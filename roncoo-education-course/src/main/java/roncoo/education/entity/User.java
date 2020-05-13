package roncoo.education.entity;

import java.math.BigInteger;
import java.util.Date;
import java.io.Serializable;

/**
 * 用户基本信息(User)实体类
 *
 * @author makejava
 * @since 2020-05-13 16:07:12
 */
public class User implements Serializable {
    private static final long serialVersionUID = 744751309219812899L;
    /**
    * 主键
    */
    private Long id;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", statusId=" + statusId +
                ", userNo=" + userNo +
                ", mobile='" + mobile + '\'' +
                ", mobileSalt='" + mobileSalt + '\'' +
                ", mobilePsw='" + mobilePsw + '\'' +
                ", userSource='" + userSource + '\'' +
                '}';
    }

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
    * 用户编号
    */
    private BigInteger userNo;
    /**
    * 手机号码
    */
    private String mobile;
    /**
    * 密码盐
    */
    private String mobileSalt;
    /**
    * 登录密码
    */
    private String mobilePsw;
    /**
    * 用户来源(client_id)
    */
    private String userSource;


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

    public BigInteger getUserNo() {
        return userNo;
    }

    public void setUserNo(BigInteger userNo) {
        this.userNo = userNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobileSalt() {
        return mobileSalt;
    }

    public void setMobileSalt(String mobileSalt) {
        this.mobileSalt = mobileSalt;
    }

    public String getMobilePsw() {
        return mobilePsw;
    }

    public void setMobilePsw(String mobilePsw) {
        this.mobilePsw = mobilePsw;
    }

    public String getUserSource() {
        return userSource;
    }

    public void setUserSource(String userSource) {
        this.userSource = userSource;
    }

}