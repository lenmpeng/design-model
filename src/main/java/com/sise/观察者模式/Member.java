package com.sise.观察者模式;


import com.sise.观察者模式.constants.EventTypeEnum;
import com.sise.观察者模式.model.MsgObj;

/**
 * The type Member.
 *
 * @author lenm
 */
public class Member {

    private int id;
    private String name;
    private boolean isVip;

    /**
     * Instantiates a new Member.
     *
     * @param name the name
     */
    public Member(String name) {
        this.name = name;
    }

    /**
     * Upgrade.
     *
     * @param applicationListener the application listener
     */
    public void upgrade(ApplicationListener applicationListener) {
        MsgObj msgObj = new MsgObj(name + "会员充钱了，升级");
        EventObject eventObject = new EventObject(msgObj, EventTypeEnum.UPGRADE_TYPE);
        applicationListener.bind(eventObject);
    }

    /**
     * Degrade.
     *
     * @param applicationListener the application listener
     */
    public void degrade(ApplicationListener applicationListener) {
        MsgObj msgObj = new MsgObj(name + "会员退费了，降级");
        EventObject eventObject = new EventObject(msgObj, EventTypeEnum.DEGRADE_TYPE);
        applicationListener.bind(eventObject);
    }


}
