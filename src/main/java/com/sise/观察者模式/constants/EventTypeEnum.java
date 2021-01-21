package com.sise.观察者模式.constants;

/**
 * The enum Event type enum.
 *
 * @author lenm
 */
public enum EventTypeEnum {

    /**
     * Upgrade type event type enum.
     */
    UPGRADE_TYPE(1, "升级监听器"),
    /**
     * Degrade type event type enum.
     */
    DEGRADE_TYPE(2, "降级事件");

    /**
     * The Code.
     */
    int code;
    /**
     * The Des.
     */
    String des;
    EventTypeEnum(int code, String des) {
        this.code = code;
        this.des = des;
    }


}
