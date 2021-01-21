package com.sise.观察者模式.handler;

import com.sise.观察者模式.ApplicationListener;
import com.sise.观察者模式.EventObject;


/**
 * The type Event handler.
 *
 * @author lenm
 */
public class EventHandler implements Runnable {
    private ApplicationListener applicationListener;
    private volatile EventObject eventObject;

    /**
     * Instantiates a new Event handler.
     *
     * @param applicationListener the application listener
     * @param eventObject         the event object
     */
    public EventHandler(ApplicationListener applicationListener, EventObject eventObject) {
        this.applicationListener = applicationListener;
        this.eventObject = eventObject;
    }

    @Override
    public void run() {
        applicationListener.bind(eventObject);
    }
}
