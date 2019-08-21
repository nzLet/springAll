package org.nz.springall_start_demo.pojo;

import javax.persistence.*;

@Table(name = "software_apply_form")
public class SoftwareApplyForm {
    @Id
    private String id;

    /**
     * 版本
     */
    private Integer version;

    /**
     * 软件申请书状态
     */
    @Column(name = "apply_form_status")
    private Integer applyFormStatus;

    /**
     * 引进/升级/开发理由
     */
    private String reason;

    /**
     * 软件功能及平台环境
     */
    @Column(name = "function_environment")
    private String functionEnvironment;

    /**
     * 软件提供单位及鉴定单位
     */
    @Column(name = "providedpt_authenticatedpt")
    private String providedptAuthenticatedpt;

    /**
     * 软件引进/升级/开发估计费用及付款方式
     */
    @Column(name = "cost_paytype")
    private String costPaytype;

    /**
     * 采购方式
     */
    @Column(name = "purchase_method")
    private String purchaseMethod;

    /**
     * 实现方式
     */
    @Column(name = "realize_method")
    private String realizeMethod;

    /**
     * 计划类型
     */
    @Column(name = "planning_type")
    private String planningType;

    /**
     * 软件类别
     */
    @Column(name = "software_category")
    private String softwareCategory;

    /**
     * 删除状态(0-未删除，1-已删除)
     */
    @Column(name = "delete_flag")
    private Integer deleteFlag;

    /**
     * 编号
     */
    @Column(name = "serial_number")
    private String serialNumber;

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
     * 获取软件申请书状态
     *
     * @return apply_form_status - 软件申请书状态
     */
    public Integer getApplyFormStatus() {
        return applyFormStatus;
    }

    /**
     * 设置软件申请书状态
     *
     * @param applyFormStatus 软件申请书状态
     */
    public void setApplyFormStatus(Integer applyFormStatus) {
        this.applyFormStatus = applyFormStatus;
    }

    /**
     * 获取引进/升级/开发理由
     *
     * @return reason - 引进/升级/开发理由
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置引进/升级/开发理由
     *
     * @param reason 引进/升级/开发理由
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * 获取软件功能及平台环境
     *
     * @return function_environment - 软件功能及平台环境
     */
    public String getFunctionEnvironment() {
        return functionEnvironment;
    }

    /**
     * 设置软件功能及平台环境
     *
     * @param functionEnvironment 软件功能及平台环境
     */
    public void setFunctionEnvironment(String functionEnvironment) {
        this.functionEnvironment = functionEnvironment == null ? null : functionEnvironment.trim();
    }

    /**
     * 获取软件提供单位及鉴定单位
     *
     * @return providedpt_authenticatedpt - 软件提供单位及鉴定单位
     */
    public String getProvidedptAuthenticatedpt() {
        return providedptAuthenticatedpt;
    }

    /**
     * 设置软件提供单位及鉴定单位
     *
     * @param providedptAuthenticatedpt 软件提供单位及鉴定单位
     */
    public void setProvidedptAuthenticatedpt(String providedptAuthenticatedpt) {
        this.providedptAuthenticatedpt = providedptAuthenticatedpt == null ? null : providedptAuthenticatedpt.trim();
    }

    /**
     * 获取软件引进/升级/开发估计费用及付款方式
     *
     * @return cost_paytype - 软件引进/升级/开发估计费用及付款方式
     */
    public String getCostPaytype() {
        return costPaytype;
    }

    /**
     * 设置软件引进/升级/开发估计费用及付款方式
     *
     * @param costPaytype 软件引进/升级/开发估计费用及付款方式
     */
    public void setCostPaytype(String costPaytype) {
        this.costPaytype = costPaytype == null ? null : costPaytype.trim();
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
}