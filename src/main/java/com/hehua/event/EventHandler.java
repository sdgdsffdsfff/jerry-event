/**
 * 
 */
package com.hehua.event;

import java.util.Collection;

/**
 * @author zhihua
 *
 */
public interface EventHandler {

    public Collection<EventType> interestEvents();

    public void handleEvent(Event event);
}
