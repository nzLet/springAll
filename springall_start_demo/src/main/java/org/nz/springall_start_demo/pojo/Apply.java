package org.nz.springall_start_demo.pojo;

import javax.persistence.*;

public class Apply {
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
     * 采购类型
     */
    private String type;

    /**
     * 预估费用
     */
    @Column(name = "estimated_cost")
    private Long estimatedCost;

    /**
     * 采购项目情况
     */
    @Column(name = "purchase_details")
    private String purchaseDetails;

    /**
     * 计划类型(计划内，计划外)
     */
    @Column(name = "planning_type")
    private String planningType;

    /**
     * 计划说明
     */
    @Column(name = "planning_remark")
    private String planningRemark;

    /**
     * 采购方式
     */
    @Column(name = "purchase_method")
    private String purchaseMethod;

    /**
     * 供应商ID(英文逗号分隔)
     */
    @Column(name = "apply_rela_supplier")
    private String applyRelaSupplier;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否框架协议（1-是，0-否）
     */
    @Column(name = "is_framework")
    private Integer isFramework;

    /**
     * 申请表状态（-2-已作废，-1-退回编制，0-编制中，1-流程中，2-已批准）
     */
    @Column(name = "apply_status")
    private Integer applyStatus;

    /**
     * 删除状态(0-未删除，1-已删除)
     */
    @Column(name = "delete_flag")
    private Integer deleteFlag;

    /**
     * 签报附件
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
     * 获取采购类型
     *
     * @return type - 采购类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置采购类型
     *
     * @param type 采购类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取预估费用
     *
     * @return estimated_cost - 预估费用
     */
    public Long getEstimatedCost() {
        return estimatedCost;
    }

    /**
     * 设置预估费用
     *
     * @param estimatedCost 预估费用
     */
    public void setEstimatedCost(Long estimatedCost) {
        this.estimatedCost = estimatedCost;
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
     * 获取计划类型(计划内，计划外)
     *
     * @return planning_type - 计划类型(计划内，计划外)
     */
    public String getPlanningType() {
        return planningType;
    }

    /**
     * 设置计划类型(计划内，计划外)
     *
     * @param planningType 计划类型(计划内，计划外)
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
     * 获取供应商ID(英文逗号分隔)
     *
     * @return apply_rela_supplier - 供应商ID(英文逗号分隔)
     */
    public String getApplyRelaSupplier() {
        return applyRelaSupplier;
    }

    /**
     * 设置供应商ID(英文逗号分隔)
     *
     * @param applyRelaSupplier 供应商ID(英文逗号分隔)
     */
    public void setApplyRelaSupplier(String applyRelaSupplier) {
        this.applyRelaSupplier = applyRelaSupplier == null ? null : applyRelaSupplier.trim();
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取是否框架协议（1-是，0-否）
     *
     * @return is_framework - 是否框架协议（1-是，0-否）
     */
    public Integer getIsFramework() {
        return isFramework;
    }

    /**
     * 设置是否框架协议（1-是，0-否）
     *
     * @param isFramework 是否框架协议（1-是，0-否）
     */
    public void setIsFramework(Integer isFramework) {
        this.isFramework = isFramework;
    }

    /**
     * 获取申请表状态（-2-已作废，-1-退回编制，0-编制中，1-流程中，2-已批准）
     *
     * @return apply_status - 申请表状态（-2-已作废，-1-退回编制，0-编制中，1-流程中，2-已批准）
     */
    public Integer getApplyStatus() {
        return applyStatus;
    }

    /**
     * 设置申请表状态（-2-已作废，-1-退回编制，0-编制中，1-流程中，2-已批准）
     *
     * @param applyStatus 申请表状态（-2-已作废，-1-退回编制，0-编制中，1-流程中，2-已批准）
     */
    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
    }

    /**
     * 获取删除状态(0-未删除，1-已删除)
     *
     * @return delete_flag - 删除状态(0-未删除，1-已删除)
     */
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * 设置删除状态(0-未删除，1-已删除)
     *
     * @param deleteFlag 删除状态(0-未删除，1-已删除)
     */
    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * 获取签报附件
     *
     * @return attachment - 签报附件
     */
    public String getAttachment() {
        return attachment;
    }

    /**
     * 设置签报附件
     *
     * @param attachment 签报附件
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment == null ? null : attachment.trim();
    }
}