package com.bbs.community.dto;

import com.bbs.community.model.User;
import lombok.Data;

/**
 * @author Parcol
 * @date 2019/9/18
 **/
@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private User user;
}
