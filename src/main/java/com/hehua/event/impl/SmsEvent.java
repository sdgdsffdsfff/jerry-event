/**
 * 
 */
package com.hehua.event.impl;

import java.util.Date;

import com.hehua.event.EventType;

/**
 * @author zhihua
 *
 */
public class SmsEvent extends AbstractEvent {

    private String mobile;

    private String message;

    private Date createTime;

    /**
     * 
     */
    public SmsEvent() {
        super();
    }

    /**
     * @param mobile
     * @param message
     * @param createTime
     */
    public SmsEvent(String mobile, String message, Date createTime) {
        super();
        this.mobile = mobile;
        this.message = message;
        this.createTime = createTime;
    }

    @Override
    public EventType getType() {
        return EventType.Sms;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
