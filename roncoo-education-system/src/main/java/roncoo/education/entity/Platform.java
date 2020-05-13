package roncoo.education.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 平台信息(Platform)实体类
 *
 * @author makejava
 * @since 2020-05-11 19:36:48
 */
public class Platform implements Serializable {
    private static final long serialVersionUID = -25360811248367652L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 创建时间
    */
    private String gmtCreate;
    /**
    * 修改时间
    */
    private String gmtModified;
    /**
    * 状态(1:正常，0:禁用)
    */
    private Boolean statusId;
    /**
    * 排序
    */
    private Integer sort;
    /**
    * 客户端ID
    */
    private String clientId;
    /**
    * 客户端密匙
    */
    private String clientSecret;
    /**
    * 客户端名称
    */
    private String clientName;
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

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(String gmtModified) {
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

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "id=" + id +
                ", gmtCreate='" + gmtCreate + '\'' +
                ", gmtModified='" + gmtModified + '\'' +
                ", statusId=" + statusId +
                ", sort=" + sort +
                ", clientId='" + clientId + '\'' +
                ", clientSecret='" + clientSecret + '\'' +
                ", clientName='" + clientName + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}