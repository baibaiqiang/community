package com.bbs.community.exception;

/**
 * @author Parcol
 * @date 2019/9/25
 **/
public class CustomizeException extends RuntimeException{
    private Integer code;
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }

    public CustomizeException(ICustomizeErrorCode errorCode){
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }
}
