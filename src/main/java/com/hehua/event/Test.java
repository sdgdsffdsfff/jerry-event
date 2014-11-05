/**
 * 
 */
package com.hehua.event;

import java.util.Date;

import com.hehua.event.impl.SmsEvent;

/**
 * @author zhihua
 *
 */
public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        EventDispatcher eventDispatcher = new EventDispatcher();
        for (int i = 0; i <= 10000; i++) {
            long s = System.currentTimeMillis();
            eventDispatcher.post(new SmsEvent("xxxxxxxxxx", "message" + i, new Date()));

            //            System.out.println("cost " + (System.currentTimeMillis() - s));
        }
    }

}
