/**
 * 
 */
package com.hehua.event.impl;

import com.alibaba.fastjson.JSON;

/**
 * @author zhihua
 *
 */
public class SmsEventCodec extends AbstractEventCodec<SmsEvent> {

    @Override
    public String encode(SmsEvent event) {
        return JSON.toJSONString(event);
    }

    @Override
    public SmsEvent decode(String text) {
        return JSON.parseObject(text, SmsEvent.class);
    }

}
