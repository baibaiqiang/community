package com.bbs.community.service;

import com.bbs.community.exception.CustomizeErrorCode;
import com.bbs.community.exception.CustomizeException;
import com.bbs.community.model.Comment;
import org.springframework.stereotype.Service;

/**
 * @author Parcol
 * @date 2019/10/6
 **/
@Service
public class CommentService {
    public void insert(Comment comment) {
        if(comment.getParentId() == null || comment.getParentId() == 0){
            throw new CustomizeException(CustomizeErrorCode.TARGET_PARAM_NOT_FOUND);
        }
    }
}
