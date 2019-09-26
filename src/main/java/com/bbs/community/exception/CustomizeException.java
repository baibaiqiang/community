package com.bbs.community.exception;

/**
 * @author Parcol
 * @date 2019/9/25
 **/
public class CustomizeException extends RuntimeException{
    private String message;

    public CustomizeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
    public CustomizeException(ICustomizeErrorCode errorCode){
        this.message = errorCode.getMessage();
    }
}
