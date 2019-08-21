package org.nz.springall_start_demo.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "software_apply")
public class SoftwareApply {
    @Id
    private String id;

    /**
     * 版本
     */
    private Integer version;

    /**
     * 编号
     */
    @Column(name = "serial_number")
    private String serialNumber;

    /**
     * 采购名称
     */
    private String name;

    /**
     * 软件类别
     */
    @Column(name = "software_category")
    private String softwareCategory;

    /**
     * 计划类型
     */
    @Column(name = "planning_type")
    private String planningType;

    /**
     * 计划说明
     */
    @Column(name = "planning_remark")
    private String planningRemark;

    /**
     * 预估费用
     */
    @Column(name = "estimated_cost")
    private String estimatedCost;

    /**
     * 实现方式
     */
    @Column(name = "realize_method")
    private String realizeMethod;

    /**
     * 采购方式
     */
    @Column(name = "purchase_method")
    private String purchaseMethod;

    /**
     * 采购项目情况
     */
    @Column(name = "purchase_details")
    private String purchaseDetails;

    /**
     * 申请时间
     */
    @Column(name = "apply_time")
    private Date applyTime;

    /**
     * 申请id
     */
    @Column(name = "apply_id")
    private String applyId;

    /**
     * 申请状态
     */
    @Column(name = "apply_status")
    private Integer applyStatus;

    /**
     * 删除状态
     */
    @Column(name = "delete_flag")
    private Integer deleteFlag;

    /**
     * 附件
     */
    private String attachment;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取版本
     *
     * @return version - 版本
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本
     *
     * @param version 版本
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 获取编号
     *
     * @return serial_number - 编号
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * 设置编号
     *
     * @param serialNumber 编号
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    /**
     * 获取采购名称
     *
     * @return name - 采购名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置采购名称
     *
     * @param name 采购名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取软件类别
     *
     * @return software_category - 软件类别
     */
    public String getSoftwareCategory() {
        return softwareCategory;
    }

    /**
     * 设置软件类别
     *
     * @param softwareCategory 软件类别
     */
    public void setSoftwareCategory(String softwareCategory) {
        this.softwareCategory = softwareCategory == null ? null : softwareCategory.trim();
    }

    /**
     * 获取计划类型
     *
     * @return planning_type - 计划类型
     */
    public String getPlanningType() {
        return planningType;
    }

    /**
     * 设置计划类型
     *
     * @param planningType 计划类型
     */
    public void setPlanningType(String planningType) {
        this.planningType = planningType == null ? null : planningType.trim();
    }

    /**
     * 获取计划说明
     *
     * @return planning_remark - 计划说明
     */
    public String getPlanningRemark() {
        return planningRemark;
    }

    /**
     * 设置计划说明
     *
     * @param planningRemark 计划说明
     */
    public void setPlanningRemark(String planningRemark) {
        this.planningRemark = planningRemark == null ? null : planningRemark.trim();
    }

    /**
     * 获取预估费用
     *
     * @return estimated_cost - 预估费用
     */
    public String getEstimatedCost() {
        return estimatedCost;
    }

    /**
     * 设置预估费用
     *
     * @param estimatedCost 预估费用
     */
    public void setEstimatedCost(String estimatedCost) {
        this.estimatedCost = estimatedCost == null ? null : estimatedCost.trim();
    }

    /**
     * 获取实现方式
     *
     * @return realize_method - 实现方式
     */
    public String getRealizeMethod() {
        return realizeMethod;
    }

    /**
     * 设置实现方式
     *
     * @param realizeMethod 实现方式
     */
    public void setRealizeMethod(String realizeMethod) {
        this.realizeMethod = realizeMethod == null ? null : realizeMethod.trim();
    }

    /**
     * 获取采购方式
     *
     * @return purchase_method - 采购方式
     */
    public String getPurchaseMethod() {
        return purchaseMethod;
    }

    /**
     * 设置采购方式
     *
     * @param purchaseMethod 采购方式
     */
    public void setPurchaseMethod(String purchaseMethod) {
        this.purchaseMethod = purchaseMethod == null ? null : purchaseMethod.trim();
    }

    /**
     * 获取采购项目情况
     *
     * @return purchase_details - 采购项目情况
     */
    public String getPurchaseDetails() {
        return purchaseDetails;
    }

    /**
     * 设置采购项目情况
     *
     * @param purchaseDetails 采购项目情况
     */
    public void setPurchaseDetails(String purchaseDetails) {
        this.purchaseDetails = purchaseDetails == null ? null : purchaseDetails.trim();
    }

    /**
     * 获取申请时间
     *
     * @return apply_time - 申请时间
     */
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     * 设置申请时间
     *
     * @param applyTime 申请时间
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * 获取申请id
     *
     * @return apply_id - 申请id
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * 设置申请id
     *
     * @param applyId 申请id
     */
    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }

    /**
     * 获取申请状态
     *
     * @return apply_status - 申请状态
     */
    public Integer getApplyStatus() {
        return applyStatus;
    }

    /**
     * 设置申请状态
     *
     * @param applyStatus 申请状态
     */
    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
    }

    /**
     * 获取删除状态
     *
     * @return delete_flag - 删除状态
     */
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * 设置删除状态
     *
     * @param deleteFlag 删除状态
     */
    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * 获取附件
     *
     * @return attachment - 附件
     */
    public String getAttachment() {
        return attachment;
    }

    /**
     * 设置附件
     *
     * @param attachment 附件
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment == null ? null : attachment.trim();
    }
}