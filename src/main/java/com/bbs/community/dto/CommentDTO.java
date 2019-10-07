package com.bbs.community.dto;

import lombok.Data;

/**
 * @author Parcol
 * @date 2019/10/5
 **/
@Data
public class CommentDTO {
    private Long parentId;
    private String comment;
    private Integer type;
}
