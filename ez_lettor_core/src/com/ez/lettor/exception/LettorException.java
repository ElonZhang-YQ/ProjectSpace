package com.ez.lettor.exception;

/**
 * This class created on 2019-03-04
 *
 * @author Elon.Zhang
 */
public abstract class LettorException extends Exception {
    
    
    public LettorException() {
        
        super();
    }
    
    public LettorException(String message) {
        
        super(message);
    }
    
    @Override
    public String getMessage() {
        
        return super.getMessage();
    }
    
    public String getErrorCode() {
    
        return null;
    }
}
