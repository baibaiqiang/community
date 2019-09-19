package com.bbs.community.model;

import lombok.Data;

/**
 * Created by Parcol on 2019/9/16
 *
 * @author Parcol*/
@Data
public class Question {
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
}
