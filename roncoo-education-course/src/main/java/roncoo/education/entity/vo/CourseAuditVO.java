package roncoo.education.entity.vo;

import java.util.Date;

/**
 * 2020/5/13
 * 肖宇飞
 * 此类为审核课程信息时用的修改字段
 */
public class CourseAuditVO {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public int getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(int auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }

    private Long id;
    private Date gmtModified;
    private int auditStatus;
    private String auditOpinion;
}
