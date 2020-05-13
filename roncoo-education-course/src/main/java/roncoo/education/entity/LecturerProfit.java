package roncoo.education.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 讲师提现日志表(LecturerProfit)实体类
 *
 * @author makejava
 * @since 2020-05-13 15:44:20
 */
public class LecturerProfit implements Serializable {
    private static final long serialVersionUID = -98132848806989552L;
    /**
    * 主键
    */
    private Long id;

    @Override
    public String toString() {
        return "LecturerProfit{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", lecturerUserNo=" + lecturerUserNo +
                ", bankCardNo='" + bankCardNo + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankBranchName='" + bankBranchName + '\'' +
                ", bankUserName='" + bankUserName + '\'' +
                ", bankIdCardNo='" + bankIdCardNo + '\'' +
                ", lecturerProfit=" + lecturerProfit +
                ", platformProfit=" + platformProfit +
                ", profitStatus=" + profitStatus +
                ", remark='" + remark + '\'' +
                '}';
    }

    /**
    * 创建时间
    */
    private Date gmtCreate;
    /**
    * 讲师用户编号
    */
    private Long lecturerUserNo;
    /**
    * 银行卡号
    */
    private String bankCardNo;
    /**
    * 银行名称
    */
    private String bankName;
    /**
    * 银行支行名称
    */
    private String bankBranchName;
    /**
    * 银行开户名
    */
    private String bankUserName;
    /**
    * 银行身份证号
    */
    private String bankIdCardNo;
    /**
    * 讲师收入
    */
    private Double lecturerProfit;
    /**
    * 平台收入
    */
    private Double platformProfit;
    /**
    * 分润状态（1确认中，2成功，3失败）
    */
    private Boolean profitStatus;
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

    public Long getLecturerUserNo() {
        return lecturerUserNo;
    }

    public void setLecturerUserNo(Long lecturerUserNo) {
        this.lecturerUserNo = lecturerUserNo;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranchName() {
        return bankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    public String getBankUserName() {
        return bankUserName;
    }

    public void setBankUserName(String bankUserName) {
        this.bankUserName = bankUserName;
    }

    public String getBankIdCardNo() {
        return bankIdCardNo;
    }

    public void setBankIdCardNo(String bankIdCardNo) {
        this.bankIdCardNo = bankIdCardNo;
    }

    public Double getLecturerProfit() {
        return lecturerProfit;
    }

    public void setLecturerProfit(Double lecturerProfit) {
        this.lecturerProfit = lecturerProfit;
    }

    public Double getPlatformProfit() {
        return platformProfit;
    }

    public void setPlatformProfit(Double platformProfit) {
        this.platformProfit = platformProfit;
    }

    public Boolean getProfitStatus() {
        return profitStatus;
    }

    public void setProfitStatus(Boolean profitStatus) {
        this.profitStatus = profitStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}