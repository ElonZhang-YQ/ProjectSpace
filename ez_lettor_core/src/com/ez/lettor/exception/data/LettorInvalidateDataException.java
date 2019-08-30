package com.ez.lettor.exception.data;

import com.ez.lettor.exception.LettorException;

/**
 * This class created on 2019-03-04
 * <p>
 * 无效数据异常信息
 *
 * @author Elon.Zhang
 */
public class LettorInvalidateDataException extends LettorException {
    
    private String errorCode = "InvalidateData";
    
    public LettorInvalidateDataException(String message) {
        
        super(message);
    }
    
    @Override
    public String getErrorCode() {
        
        return this.errorCode;
    }
}
