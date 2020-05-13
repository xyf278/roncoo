package roncoo.education.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 订单信息表(OrderInfo)实体类
 *
 * @author makejava
 * @since 2020-05-13 21:27:34
 */
public class OrderInfo implements Serializable {
    private static final long serialVersionUID = 425652407472703793L;

    @Override
    public String toString() {
        return "OrderInfo{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", lecturerUserNo=" + lecturerUserNo +
                ", lecturerName='" + lecturerName + '\'' +
                ", userNo=" + userNo +
                ", mobile='" + mobile + '\'' +
                ", registerTime=" + registerTime +
                ", orderNo=" + orderNo +
                ", courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", pricePayable=" + pricePayable +
                ", priceDiscount=" + priceDiscount +
                ", pricePaid=" + pricePaid +
                ", platformProfit=" + platformProfit +
                ", lecturerProfit=" + lecturerProfit +
                ", tradeType=" + tradeType +
                ", payType=" + payType +
                ", channelType=" + channelType +
                ", orderStatus=" + orderStatus +
                ", isShowLecturer=" + isShowLecturer +
                ", isShowUser=" + isShowUser +
                ", remarkCus='" + remarkCus + '\'' +
                ", remark='" + remark + '\'' +
                ", payTime=" + payTime +
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
    * 讲师用户编号
    */
    private Long lecturerUserNo;
    /**
    * 讲师名称
    */
    private String lecturerName;
    /**
    * 用户编号
    */
    private Long userNo;
    /**
    * 用户电话
    */
    private String mobile;
    /**
    * 用户注册时间
    */
    private Date registerTime;
    /**
    * 订单号
    */
    private Long orderNo;
    /**
    * 课程ID
    */
    private Long courseId;
    /**
    * 课程名称
    */
    private String courseName;
    /**
    * 应付金额
    */
    private Double pricePayable;
    /**
    * 优惠金额
    */
    private Double priceDiscount;
    /**
    * 实付金额
    */
    private Double pricePaid;
    /**
    * 平台收入
    */
    private Double platformProfit;
    /**
    * 讲师收入
    */
    private Double lecturerProfit;
    /**
    * 交易类型：1线上支付，2线下支付
    */
    private Boolean tradeType;
    /**
    * 支付方式：1微信支付，2支付宝支付
    */
    private Boolean payType;
    /**
    * 购买渠道：1web
    */
    private Boolean channelType;
    /**
    * 订单状态：1待支付，2成功支付，3支付失败，4已关闭
    */
    private Boolean orderStatus;
    /**
    * 是否显示给讲师(1是，0否)
    */
    private Boolean isShowLecturer;
    /**
    * 是否显示给用户看(1是，0否)
    */
    private Boolean isShowUser;
    /**
    * 客户备注
    */
    private String remarkCus;
    /**
    * 后台备注
    */
    private String remark;
    /**
    * 支付时间
    */
    private Date payTime;


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

    public Long getLecturerUserNo() {
        return lecturerUserNo;
    }

    public void setLecturerUserNo(Long lecturerUserNo) {
        this.lecturerUserNo = lecturerUserNo;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public Long getUserNo() {
        return userNo;
    }

    public void setUserNo(Long userNo) {
        this.userNo = userNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Double getPricePayable() {
        return pricePayable;
    }

    public void setPricePayable(Double pricePayable) {
        this.pricePayable = pricePayable;
    }

    public Double getPriceDiscount() {
        return priceDiscount;
    }

    public void setPriceDiscount(Double priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public Double getPricePaid() {
        return pricePaid;
    }

    public void setPricePaid(Double pricePaid) {
        this.pricePaid = pricePaid;
    }

    public Double getPlatformProfit() {
        return platformProfit;
    }

    public void setPlatformProfit(Double platformProfit) {
        this.platformProfit = platformProfit;
    }

    public Double getLecturerProfit() {
        return lecturerProfit;
    }

    public void setLecturerProfit(Double lecturerProfit) {
        this.lecturerProfit = lecturerProfit;
    }

    public Boolean getTradeType() {
        return tradeType;
    }

    public void setTradeType(Boolean tradeType) {
        this.tradeType = tradeType;
    }

    public Boolean getPayType() {
        return payType;
    }

    public void setPayType(Boolean payType) {
        this.payType = payType;
    }

    public Boolean getChannelType() {
        return channelType;
    }

    public void setChannelType(Boolean channelType) {
        this.channelType = channelType;
    }

    public Boolean getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Boolean getIsShowLecturer() {
        return isShowLecturer;
    }

    public void setIsShowLecturer(Boolean isShowLecturer) {
        this.isShowLecturer = isShowLecturer;
    }

    public Boolean getIsShowUser() {
        return isShowUser;
    }

    public void setIsShowUser(Boolean isShowUser) {
        this.isShowUser = isShowUser;
    }

    public String getRemarkCus() {
        return remarkCus;
    }

    public void setRemarkCus(String remarkCus) {
        this.remarkCus = remarkCus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

}