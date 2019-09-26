package com.bbs.community.exception;

/**
 * @author Parcol
 * @date 2019/9/25
 **/
public enum CustomizeErrorCode implements ICustomizeErrorCode{

    QUESTION_NOT_FOUND("你找到的问题不在了,要不要换个试试?");
    private String message;
    @Override
    public String getMessage(){
        return message;
    }
    CustomizeErrorCode(String message){
        this.message = message;
    }
}
