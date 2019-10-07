package com.bbs.community.mapper;

import com.bbs.community.model.Question;
import com.bbs.community.model.QuestionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface QuestionExtMapper {
    /**
     * 通过id,增加阅读数
     * @param record
     * @return
     */
    int incView(Question record);
}