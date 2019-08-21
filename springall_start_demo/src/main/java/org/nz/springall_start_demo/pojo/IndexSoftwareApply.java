package org.nz.springall_start_demo.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "index_software_apply")
public class IndexSoftwareApply {
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
     * 软件采购申请单ID
     */
    @Column(name = "software_apply_id")
    private String softwareApplyId;

    /**
     * 软件采购申请单状态
     */
    @Column(name = "apply_status")
    private Integer applyStatus;

    /**
     * 软件申请书ID
     */
    @Column(name = "software_apply_form_id")
    private String softwareApplyFormId;

    /**
     * 软件申请书状态
     */
    @Column(name = "apply_form_status")
    private Integer applyFormStatus;

    /**
     * 删除状态(0-未删除，1-已删除)
     */
    @Column(name = "delete_flag")
    private Integer deleteFlag;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人部门
     */
    private String dpt;

    /**
     * 创建人部门ID
     */
    @Column(name = "dpt_id")
    private String dptId;

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
     * 状态
     */
    private Integer status;

    /**
     * 是否框架协议（1-是，0-否）
     */
    @Column(name = "is_framework")
    private Integer isFramework;

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
     * 获取软件采购申请单ID
     *
     * @return software_apply_id - 软件采购申请单ID
     */
    public String getSoftwareApplyId() {
        return softwareApplyId;
    }

    /**
     * 设置软件采购申请单ID
     *
     * @param softwareApplyId 软件采购申请单ID
     */
    public void setSoftwareApplyId(String softwareApplyId) {
        this.softwareApplyId = softwareApplyId == null ? null : softwareApplyId.trim();
    }

    /**
     * 获取软件采购申请单状态
     *
     * @return apply_status - 软件采购申请单状态
     */
    public Integer getApplyStatus() {
        return applyStatus;
    }

    /**
     * 设置软件采购申请单状态
     *
     * @param applyStatus 软件采购申请单状态
     */
    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
    }

    /**
     * 获取软件申请书ID
     *
     * @return software_apply_form_id - 软件申请书ID
     */
    public String getSoftwareApplyFormId() {
        return softwareApplyFormId;
    }

    /**
     * 设置软件申请书ID
     *
     * @param softwareApplyFormId 软件申请书ID
     */
    public void setSoftwareApplyFormId(String softwareApplyFormId) {
        this.softwareApplyFormId = softwareApplyFormId == null ? null : softwareApplyFormId.trim();
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
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人部门
     *
     * @return dpt - 创建人部门
     */
    public String getDpt() {
        return dpt;
    }

    /**
     * 设置创建人部门
     *
     * @param dpt 创建人部门
     */
    public void setDpt(String dpt) {
        this.dpt = dpt == null ? null : dpt.trim();
    }

    /**
     * 获取创建人部门ID
     *
     * @return dpt_id - 创建人部门ID
     */
    public String getDptId() {
        return dptId;
    }

    /**
     * 设置创建人部门ID
     *
     * @param dptId 创建人部门ID
     */
    public void setDptId(String dptId) {
        this.dptId = dptId == null ? null : dptId.trim();
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
     * 获取状态
     *
     * @return status - 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
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
}