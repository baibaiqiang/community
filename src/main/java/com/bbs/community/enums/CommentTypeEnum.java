package com.bbs.community.enums;

/**
 * @author Parcol
 * @date 2019/10/6
 **/
public enum CommentTypeEnum {
    QUESTION(1),
    COMMENT(2)
    ;

    private Integer type;

    public Integer getType() {
        return type;
    }

    CommentTypeEnum(Integer type) {
        this.type = type;
    }
}
