package com.yuanxin.app.app.entity.gen;

import java.io.Serializable;
import java.util.Date;

public class ApnsToken implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apns_token.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apns_token.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apns_token.device_id
     *
     * @mbggenerated
     */
    private String deviceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apns_token.apns_token
     *
     * @mbggenerated
     */
    private String apnsToken;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apns_token.created
     *
     * @mbggenerated
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apns_token.updated
     *
     * @mbggenerated
     */
    private Date updated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table apns_token
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apns_token.id
     *
     * @return the value of apns_token.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apns_token.id
     *
     * @param id the value for apns_token.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apns_token.user_id
     *
     * @return the value of apns_token.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apns_token.user_id
     *
     * @param userId the value for apns_token.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apns_token.device_id
     *
     * @return the value of apns_token.device_id
     *
     * @mbggenerated
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apns_token.device_id
     *
     * @param deviceId the value for apns_token.device_id
     *
     * @mbggenerated
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apns_token.apns_token
     *
     * @return the value of apns_token.apns_token
     *
     * @mbggenerated
     */
    public String getApnsToken() {
        return apnsToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apns_token.apns_token
     *
     * @param apnsToken the value for apns_token.apns_token
     *
     * @mbggenerated
     */
    public void setApnsToken(String apnsToken) {
        this.apnsToken = apnsToken == null ? null : apnsToken.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apns_token.created
     *
     * @return the value of apns_token.created
     *
     * @mbggenerated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apns_token.created
     *
     * @param created the value for apns_token.created
     *
     * @mbggenerated
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apns_token.updated
     *
     * @return the value of apns_token.updated
     *
     * @mbggenerated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apns_token.updated
     *
     * @param updated the value for apns_token.updated
     *
     * @mbggenerated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}