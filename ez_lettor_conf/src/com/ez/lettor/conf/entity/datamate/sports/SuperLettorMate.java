package com.ez.lettor.conf.entity.datamate.sports;

import com.ez.lettor.conf.entity.datamate.AbstractLettorMate;
import com.ez.lettor.core.entity.datamate.DataMate;
import com.ez.lettor.core.entity.type.LettorType;

import java.util.List;

/**
 * This class created on 2019-03-04
 * 超级大乐透的数据对象
 *
 * @author Elon.Zhang
 */
public class SuperLettorMate<SingleData> extends AbstractLettorMate {
    
    public SuperLettorMate() {
        
        super();
    }
    
    public SuperLettorMate(String id, List<SingleData> normalDatas, List<SingleData> specialDatas) {
        
        super(id, normalDatas, specialDatas, LettorType.SPORT, 0);
    }
    
    @Override
    public boolean checkData() {
        
        // 需要重写，具体的逻辑在父类中
        return super.checkData();
    }
}
