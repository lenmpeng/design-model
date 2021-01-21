package com.sise.观察者模式.listener;

import com.sise.观察者模式.ApplicationListener;
import com.sise.观察者模式.EventObject;
import com.sise.观察者模式.model.MsgObj;

import static com.sise.观察者模式.constants.EventTypeEnum.DEGRADE_TYPE;
import static com.sise.观察者模式.constants.EventTypeEnum.UPGRADE_TYPE;

/**
 * The type Update listener.
 *
 * @author lenm
 */
public class UpdateListener implements ApplicationListener {


    @Override
    public void bind(EventObject eventObject) {
        if (eventObject == null) {
            return;
        }
        //如果是升级事件，那么可以做对应的处理
        if (eventObject.getTypeEnum().equals(UPGRADE_TYPE)) {
            MsgObj msgObj = (MsgObj) eventObject.getSource();
            msgObj.print();
        }
        if (eventObject.getTypeEnum().equals(DEGRADE_TYPE)) {
            MsgObj msgObj = (MsgObj) eventObject.getSource();
            msgObj.print();
        }
    }


}
