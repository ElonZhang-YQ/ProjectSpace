package com.ez.lettor.conf.entity.datamate.welfare;

import com.ez.lettor.conf.entity.datamate.AbstractLettorMate;
import com.ez.lettor.core.entity.type.LettorType;

import java.util.List;

/**
 * This class created on 2019-08-29
 *
 * @author Elon.Zhang
 */
public class WelfareLettorMate<SingleData> extends AbstractLettorMate {
    
    public WelfareLettorMate(String id, List normalDatas, List specialDatas, LettorType lettorType, int dataType) {
        
        super(id, normalDatas, specialDatas, lettorType, dataType);
    }
    
    @Override
    public boolean checkData() {
        
        // 需要重写，具体的逻辑在父类中
        return super.checkData();
    }
}
