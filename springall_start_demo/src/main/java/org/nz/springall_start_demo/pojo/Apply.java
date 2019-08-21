package org.nz.springall_start_demo.pojo;

import javax.persistence.*;

public class Apply {
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
     * �ɹ�����
     */
    private String type;

    /**
     * Ԥ������
     */
    @Column(name = "estimated_cost")
    private Long estimatedCost;

    /**
     * �ɹ���Ŀ���
     */
    @Column(name = "purchase_details")
    private String purchaseDetails;

    /**
     * �ƻ�����(�ƻ��ڣ��ƻ���)
     */
    @Column(name = "planning_type")
    private String planningType;

    /**
     * �ƻ�˵��
     */
    @Column(name = "planning_remark")
    private String planningRemark;

    /**
     * �ɹ���ʽ
     */
    @Column(name = "purchase_method")
    private String purchaseMethod;

    /**
     * ��Ӧ��ID(Ӣ�Ķ��ŷָ�)
     */
    @Column(name = "apply_rela_supplier")
    private String applyRelaSupplier;

    /**
     * ��ע
     */
    private String remark;

    /**
     * �Ƿ���Э�飨1-�ǣ�0-��
     */
    @Column(name = "is_framework")
    private Integer isFramework;

    /**
     * �����״̬��-2-�����ϣ�-1-�˻ر��ƣ�0-�����У�1-�����У�2-����׼��
     */
    @Column(name = "apply_status")
    private Integer applyStatus;

    /**
     * ɾ��״̬(0-δɾ����1-��ɾ��)
     */
    @Column(name = "delete_flag")
    private Integer deleteFlag;

    /**
     * ǩ������
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
     * ��ȡ�ɹ�����
     *
     * @return type - �ɹ�����
     */
    public String getType() {
        return type;
    }

    /**
     * ���òɹ�����
     *
     * @param type �ɹ�����
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * ��ȡԤ������
     *
     * @return estimated_cost - Ԥ������
     */
    public Long getEstimatedCost() {
        return estimatedCost;
    }

    /**
     * ����Ԥ������
     *
     * @param estimatedCost Ԥ������
     */
    public void setEstimatedCost(Long estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    /**
     * ��ȡ�ɹ���Ŀ���
     *
     * @return purchase_details - �ɹ���Ŀ���
     */
    public String getPurchaseDetails() {
        return purchaseDetails;
    }

    /**
     * ���òɹ���Ŀ���
     *
     * @param purchaseDetails �ɹ���Ŀ���
     */
    public void setPurchaseDetails(String purchaseDetails) {
        this.purchaseDetails = purchaseDetails == null ? null : purchaseDetails.trim();
    }

    /**
     * ��ȡ�ƻ�����(�ƻ��ڣ��ƻ���)
     *
     * @return planning_type - �ƻ�����(�ƻ��ڣ��ƻ���)
     */
    public String getPlanningType() {
        return planningType;
    }

    /**
     * ���üƻ�����(�ƻ��ڣ��ƻ���)
     *
     * @param planningType �ƻ�����(�ƻ��ڣ��ƻ���)
     */
    public void setPlanningType(String planningType) {
        this.planningType = planningType == null ? null : planningType.trim();
    }

    /**
     * ��ȡ�ƻ�˵��
     *
     * @return planning_remark - �ƻ�˵��
     */
    public String getPlanningRemark() {
        return planningRemark;
    }

    /**
     * ���üƻ�˵��
     *
     * @param planningRemark �ƻ�˵��
     */
    public void setPlanningRemark(String planningRemark) {
        this.planningRemark = planningRemark == null ? null : planningRemark.trim();
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
     * ��ȡ��Ӧ��ID(Ӣ�Ķ��ŷָ�)
     *
     * @return apply_rela_supplier - ��Ӧ��ID(Ӣ�Ķ��ŷָ�)
     */
    public String getApplyRelaSupplier() {
        return applyRelaSupplier;
    }

    /**
     * ���ù�Ӧ��ID(Ӣ�Ķ��ŷָ�)
     *
     * @param applyRelaSupplier ��Ӧ��ID(Ӣ�Ķ��ŷָ�)
     */
    public void setApplyRelaSupplier(String applyRelaSupplier) {
        this.applyRelaSupplier = applyRelaSupplier == null ? null : applyRelaSupplier.trim();
    }

    /**
     * ��ȡ��ע
     *
     * @return remark - ��ע
     */
    public String getRemark() {
        return remark;
    }

    /**
     * ���ñ�ע
     *
     * @param remark ��ע
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    /**
     * ��ȡ�����״̬��-2-�����ϣ�-1-�˻ر��ƣ�0-�����У�1-�����У�2-����׼��
     *
     * @return apply_status - �����״̬��-2-�����ϣ�-1-�˻ر��ƣ�0-�����У�1-�����У�2-����׼��
     */
    public Integer getApplyStatus() {
        return applyStatus;
    }

    /**
     * ���������״̬��-2-�����ϣ�-1-�˻ر��ƣ�0-�����У�1-�����У�2-����׼��
     *
     * @param applyStatus �����״̬��-2-�����ϣ�-1-�˻ر��ƣ�0-�����У�1-�����У�2-����׼��
     */
    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
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
     * ��ȡǩ������
     *
     * @return attachment - ǩ������
     */
    public String getAttachment() {
        return attachment;
    }

    /**
     * ����ǩ������
     *
     * @param attachment ǩ������
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment == null ? null : attachment.trim();
    }
}