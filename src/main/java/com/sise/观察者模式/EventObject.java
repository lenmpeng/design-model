package com.sise.观察者模式;

import com.sise.观察者模式.constants.EventTypeEnum;

/**
 * 事件源头 因为消息的发送在接收端是需要根据参数判断的，所以一般都会封装一个source字段
 *
 * @author lenm
 * @param <T> the type parameter
 */
public class EventObject<T> {

    private long time;

    private EventTypeEnum typeEnum;

    private T source;

    /**
     * Instantiates a new Event object.
     *
     * @param object        the object
     * @param eventTypeEnum the event type enum
     * @param time          the time
     */
    public EventObject(T object, EventTypeEnum eventTypeEnum, long time) {
        this.source = object;
        this.typeEnum = eventTypeEnum;
        this.time = time;
    }

    /**
     * Instantiates a new Event object.
     *
     * @param object        the object
     * @param eventTypeEnum the event type enum
     */
    public EventObject(T object, EventTypeEnum eventTypeEnum) {
        this.time = System.currentTimeMillis();
        this.typeEnum = eventTypeEnum;
        this.source = object;
    }

    /**
     * Gets source.
     *
     * @return the source
     */
    public T getSource() {
        return source;
    }

    /**
     * Gets type enum.
     *
     * @return the type enum
     */
    public EventTypeEnum getTypeEnum() {
        return typeEnum;
    }

}
