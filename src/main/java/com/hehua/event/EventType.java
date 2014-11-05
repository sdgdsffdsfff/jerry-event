/**
 * 
 */
package com.hehua.event;

import com.hehua.event.impl.SmsEventCodec;

/**
 * @author zhihua
 *
 */
public enum EventType {

    Sms(1, new SmsEventCodec());

    private final int code;

    private final EventCodec<?> codec;

    /**
     * @param code
     * @param codec
     */
    private EventType(int code, EventCodec<?> codec) {
        this.code = code;
        this.codec = codec;
    }

    public int getCode() {
        return code;
    }

    public EventCodec<?> getCodec() {
        return codec;
    }

    public String getQueueName() {
        return "mq.event." + name().toLowerCase();
    }

}
