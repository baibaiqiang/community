package com.bbs.community.exception;

/**
 * @author Parcol
 * @date 2019/9/25
 **/
public enum CustomizeErrorCode implements ICustomizeErrorCode{
    /**
     * 找不到问题错误
     */
    QUESTION_NOT_FOUND(2001,"你找到的问题不在了,要不要换个试试?"),
    TARGET_PARAM_NOT_FOUND(2002,"未选中任何问题或评论进行回复"),
    NO_LOGIN(2003,"当前操作需要登入,请登录后重试"),
    ;
    private Integer code;
    private String message;

    @Override
    public String getMessage(){
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    CustomizeErrorCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
