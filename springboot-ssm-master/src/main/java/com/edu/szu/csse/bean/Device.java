package com.edu.szu.csse.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author tools.49db.cn
 * @version 1.0
 * @date 2020-06-13
 */
public class Device implements Serializable {
    private Long id;

    /**
     * 设备编号
     */
    private String deviceId;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 设备价格
     */
    private String deviceValue;

    /**
     * 设备购买时间
     */
    private Date deviceTime;

    /**
     * 备注
     */
    private String deviceRemark;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceValue() {
        return deviceValue;
    }

    public void setDeviceValue(String deviceValue) {
        this.deviceValue = deviceValue;
    }

    public Date getDeviceTime() {
        return deviceTime;
    }

    public void setDeviceTime(Date deviceTime) {
        this.deviceTime = deviceTime;
    }

    public String getDeviceRemark() {
        return deviceRemark;
    }

    public void setDeviceRemark(String deviceRemark) {
        this.deviceRemark = deviceRemark;
    }
}