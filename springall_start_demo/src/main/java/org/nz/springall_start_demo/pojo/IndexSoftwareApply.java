package org.nz.springall_start_demo.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "index_software_apply")
public class IndexSoftwareApply {
    @Id
    private String id;

    /**
     * �汾
     */
    private Integer version;

    /**
     * ���
     */
    @Column(name = "serial_number")
    private String serialNumber;

    /**
     * �ɹ�����
     */
    private String name;

    /**
     * ����ɹ����뵥ID
     */
    @Column(name = "software_apply_id")
    private String softwareApplyId;

    /**
     * ����ɹ����뵥״̬
     */
    @Column(name = "apply_status")
    private Integer applyStatus;

    /**
     * ���������ID
     */
    @Column(name = "software_apply_form_id")
    private String softwareApplyFormId;

    /**
     * ���������״̬
     */
    @Column(name = "apply_form_status")
    private Integer applyFormStatus;

    /**
     * ɾ��״̬(0-δɾ����1-��ɾ��)
     */
    @Column(name = "delete_flag")
    private Integer deleteFlag;

    /**
     * ������
     */
    private String creator;

    /**
     * ����ʱ��
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * �����˲���
     */
    private String dpt;

    /**
     * �����˲���ID
     */
    @Column(name = "dpt_id")
    private String dptId;

    /**
     * �ɹ���ʽ
     */
    @Column(name = "purchase_method")
    private String purchaseMethod;

    /**
     * ʵ�ַ�ʽ
     */
    @Column(name = "realize_method")
    private String realizeMethod;

    /**
     * �ƻ�����
     */
    @Column(name = "planning_type")
    private String planningType;

    /**
     * ������
     */
    @Column(name = "software_category")
    private String softwareCategory;

    /**
     * ״̬
     */
    private Integer status;

    /**
     * �Ƿ���Э�飨1-�ǣ�0-��
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
     * ��ȡ�汾
     *
     * @return version - �汾
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * ���ð汾
     *
     * @param version �汾
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * ��ȡ���
     *
     * @return serial_number - ���
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * ���ñ��
     *
     * @param serialNumber ���
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    /**
     * ��ȡ�ɹ�����
     *
     * @return name - �ɹ�����
     */
    public String getName() {
        return name;
    }

    /**
     * ���òɹ�����
     *
     * @param name �ɹ�����
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * ��ȡ����ɹ����뵥ID
     *
     * @return software_apply_id - ����ɹ����뵥ID
     */
    public String getSoftwareApplyId() {
        return softwareApplyId;
    }

    /**
     * ��������ɹ����뵥ID
     *
     * @param softwareApplyId ����ɹ����뵥ID
     */
    public void setSoftwareApplyId(String softwareApplyId) {
        this.softwareApplyId = softwareApplyId == null ? null : softwareApplyId.trim();
    }

    /**
     * ��ȡ����ɹ����뵥״̬
     *
     * @return apply_status - ����ɹ����뵥״̬
     */
    public Integer getApplyStatus() {
        return applyStatus;
    }

    /**
     * ��������ɹ����뵥״̬
     *
     * @param applyStatus ����ɹ����뵥״̬
     */
    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
    }

    /**
     * ��ȡ���������ID
     *
     * @return software_apply_form_id - ���������ID
     */
    public String getSoftwareApplyFormId() {
        return softwareApplyFormId;
    }

    /**
     * �������������ID
     *
     * @param softwareApplyFormId ���������ID
     */
    public void setSoftwareApplyFormId(String softwareApplyFormId) {
        this.softwareApplyFormId = softwareApplyFormId == null ? null : softwareApplyFormId.trim();
    }

    /**
     * ��ȡ���������״̬
     *
     * @return apply_form_status - ���������״̬
     */
    public Integer getApplyFormStatus() {
        return applyFormStatus;
    }

    /**
     * �������������״̬
     *
     * @param applyFormStatus ���������״̬
     */
    public void setApplyFormStatus(Integer applyFormStatus) {
        this.applyFormStatus = applyFormStatus;
    }

    /**
     * ��ȡɾ��״̬(0-δɾ����1-��ɾ��)
     *
     * @return delete_flag - ɾ��״̬(0-δɾ����1-��ɾ��)
     */
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * ����ɾ��״̬(0-δɾ����1-��ɾ��)
     *
     * @param deleteFlag ɾ��״̬(0-δɾ����1-��ɾ��)
     */
    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * ��ȡ������
     *
     * @return creator - ������
     */
    public String getCreator() {
        return creator;
    }

    /**
     * ���ô�����
     *
     * @param creator ������
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return create_time - ����ʱ��
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * ���ô���ʱ��
     *
     * @param createTime ����ʱ��
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * ��ȡ�����˲���
     *
     * @return dpt - �����˲���
     */
    public String getDpt() {
        return dpt;
    }

    /**
     * ���ô����˲���
     *
     * @param dpt �����˲���
     */
    public void setDpt(String dpt) {
        this.dpt = dpt == null ? null : dpt.trim();
    }

    /**
     * ��ȡ�����˲���ID
     *
     * @return dpt_id - �����˲���ID
     */
    public String getDptId() {
        return dptId;
    }

    /**
     * ���ô����˲���ID
     *
     * @param dptId �����˲���ID
     */
    public void setDptId(String dptId) {
        this.dptId = dptId == null ? null : dptId.trim();
    }

    /**
     * ��ȡ�ɹ���ʽ
     *
     * @return purchase_method - �ɹ���ʽ
     */
    public String getPurchaseMethod() {
        return purchaseMethod;
    }

    /**
     * ���òɹ���ʽ
     *
     * @param purchaseMethod �ɹ���ʽ
     */
    public void setPurchaseMethod(String purchaseMethod) {
        this.purchaseMethod = purchaseMethod == null ? null : purchaseMethod.trim();
    }

    /**
     * ��ȡʵ�ַ�ʽ
     *
     * @return realize_method - ʵ�ַ�ʽ
     */
    public String getRealizeMethod() {
        return realizeMethod;
    }

    /**
     * ����ʵ�ַ�ʽ
     *
     * @param realizeMethod ʵ�ַ�ʽ
     */
    public void setRealizeMethod(String realizeMethod) {
        this.realizeMethod = realizeMethod == null ? null : realizeMethod.trim();
    }

    /**
     * ��ȡ�ƻ�����
     *
     * @return planning_type - �ƻ�����
     */
    public String getPlanningType() {
        return planningType;
    }

    /**
     * ���üƻ�����
     *
     * @param planningType �ƻ�����
     */
    public void setPlanningType(String planningType) {
        this.planningType = planningType == null ? null : planningType.trim();
    }

    /**
     * ��ȡ������
     *
     * @return software_category - ������
     */
    public String getSoftwareCategory() {
        return softwareCategory;
    }

    /**
     * ����������
     *
     * @param softwareCategory ������
     */
    public void setSoftwareCategory(String softwareCategory) {
        this.softwareCategory = softwareCategory == null ? null : softwareCategory.trim();
    }

    /**
     * ��ȡ״̬
     *
     * @return status - ״̬
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * ����״̬
     *
     * @param status ״̬
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * ��ȡ�Ƿ���Э�飨1-�ǣ�0-��
     *
     * @return is_framework - �Ƿ���Э�飨1-�ǣ�0-��
     */
    public Integer getIsFramework() {
        return isFramework;
    }

    /**
     * �����Ƿ���Э�飨1-�ǣ�0-��
     *
     * @param isFramework �Ƿ���Э�飨1-�ǣ�0-��
     */
    public void setIsFramework(Integer isFramework) {
        this.isFramework = isFramework;
    }
}