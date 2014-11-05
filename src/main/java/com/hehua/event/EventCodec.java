/**
 * 
 */
package com.hehua.event;

/**
 * @author zhihua
 *
 */
public interface EventCodec<T extends Event> {

    public String encode(T event);

    public T decode(String text);
}
