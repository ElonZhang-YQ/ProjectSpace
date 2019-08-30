package com.ez.lettor.conf.entity.datamate;

import com.ez.lettor.core.entity.data.SingleData;
import com.ez.lettor.core.entity.datamate.DataMate;
import com.ez.lettor.core.entity.type.LettorType;

import java.util.List;

/**
 * This class created on 2019-04-20
 *
 * @author Elon.Zhang
 */
public class AbstractLettorMate<SingleData> implements DataMate {
    
    private String id;
    
    private List<SingleData> normalDatas;
    
    private List<SingleData> specialDatas;
    
    private int dataLength;
    
    private LettorType lettorType;
    
    private int dataType;
    
    public AbstractLettorMate() {
    
    }
    
    public AbstractLettorMate(String id, List<SingleData> normalDatas, List<SingleData> specialDatas, LettorType lettorType, int dataType) {
        
        this.id = id;
        this.normalDatas = normalDatas;
        this.specialDatas = specialDatas;
        this.lettorType = lettorType;
        this.dataType = dataType;
        this.dataLength = normalDatas.size() + specialDatas.size();
        
    }
    
    @Override
    public String getId() {
        
        return this.id;
    }
    
    @Override
    public void setId(String id) {
    
        this.id = id;
    }
    
    @Override
    public List<SingleData> getNormalData() {
        
        return this.normalDatas;
    }
    
    @Override
    public List<SingleData> getSpecialData() {
        
        return this.specialDatas;
    }
    
    @Override
    public int getLength() {
        
        return this.dataLength;
    }
    
    @Override
    public SingleData getNumber(int index) {
    
        if (index < 0 || index > this.dataLength) {
            return null;
        }
        int normalLength = normalDatas.size() - 1;
        int specialLength = specialDatas.size() - 1;
        if (index <= normalLength) {
            return normalDatas.get(index);
        } else {
            return specialDatas.get(index - normalLength - 1);
        }
    }
    
    @Override
    public LettorType getLettorType() {
    
        return this.lettorType;
    }
    
    @Override
    public int getDataType() {
        
        return this.dataType;
    }
    
    @Override
    public boolean checkData() {
    
        /**
         * 先不实现，等常量准备好之后，这边通过常量进行对比
         * 具体的思路是：
         * 先拿到lettorType判断是体彩还是福彩
         * 然后再在对应具体的彩票里面进行判断到底是哪个类型的，然后通过这个类型的情况进行对比。 需要在子类中进行具体的各自实现。
         */
        return false;
    }
}
