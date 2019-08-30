package com.ez.lettor.core.entity.type;

/**
 * This class created on 2019-04-20
 *
 * @author Elon.Zhang
 */
public enum LettorType {
    
    ULL(0), WALFARE(1), SPORT(2);
    
    private int type;
    
    private LettorType(int type) {
        this.type = type;
    }
    
    public int getType() {
        
        return this.type;
    }
    
    public void setType(int type) {
        
        this.type = type;
    }
}
