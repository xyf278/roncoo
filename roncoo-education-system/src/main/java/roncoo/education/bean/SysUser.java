package roncoo.education.bean;

import java.math.BigInteger;
import java.util.Date;

/**
 *后台用户信息表
 * creat 2020.5.7
 * @ author 肖宇飞
 */
public class SysUser {

    private Long id;//主键id

    @Override
    public String toString() {
        return "SysUser{" +
                "id=" + id +
                ", gmt_create=" + gmt_create +
                ", gmt_modified=" + gmt_modified +
                ", status_id=" + status_id +
                ", sort=" + sort +
                ", user_no=" + user_no +
                ", mobile=" + mobile +
                ", real_name='" + real_name + '\'' +
                ", remark='" + remark + '\'' +
                ", pageCurrent=" + pageCurrent +
                ", pageSize=" + pageSize +
                '}';
    }

    private Date gmt_create;//创建时间
    private Date gmt_modified;//修改时间
    private Integer status_id;//状态:1.正常,2.禁用
    private Integer sort;//排序
    private BigInteger user_no;//用户编号
    private BigInteger mobile;//手机号
    private String real_name;//真实姓名;
    private String remark;//备注
    private int pageCurrent;//当前页

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Date getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    public Integer getStatus_id() {
        return status_id;
    }

    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public BigInteger getUser_no() {
        return user_no;
    }

    public void setUser_no(BigInteger user_no) {
        this.user_no = user_no;
    }

    public BigInteger getMobile() {
        return mobile;
    }

    public void setMobile(BigInteger mobile) {
        this.mobile = mobile;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getPageCurrent() {
        return pageCurrent;
    }

    public void setPageCurrent(int pageCurrent) {
        this.pageCurrent = pageCurrent;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    private int pageSize;//每页记录数

}
