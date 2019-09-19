package com.bbs.community.dto;

import lombok.Data;

/**
 * @author Parcol
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}
