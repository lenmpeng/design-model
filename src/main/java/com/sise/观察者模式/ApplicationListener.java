package com.sise.观察者模式;

/**
 * The interface Application listener.
 *
 * @author lenm
 */
public interface ApplicationListener {

    /**
     * 绑定一个事件
     *
     * @param eventObject the event object
     */
    void bind(EventObject eventObject);
}
