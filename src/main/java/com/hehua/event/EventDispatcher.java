/**
 * 
 */
package com.hehua.event;

import org.springframework.stereotype.Component;

import com.hehua.framework.queue.redis.RedisQueue;
import com.hehua.framework.queue.redis.RedisQueueFactory;

/**
 * @author zhihua
 *
 */
@Component
public class EventDispatcher {

    private static final String CLUSTER = "event";

    @SuppressWarnings("unchecked")
    public void post(Event event) {
        EventType eventType = event.getType();

        String queueName = eventType.getQueueName();
        @SuppressWarnings("rawtypes")
        EventCodec codec = eventType.getCodec();
        String message = codec.encode(event);

        RedisQueue queue = RedisQueueFactory.create(CLUSTER, queueName);
        queue.enqueue(message);
    }
}
