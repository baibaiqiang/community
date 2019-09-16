package com.bbs.community.mapper;

import com.bbs.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.aspectj.weaver.patterns.TypePatternQuestions;

/**
 * Created by Parcol on 2019/9/16
 *
 * @author Parcol
 */
@Mapper
public interface QuestionMapper {
    @Insert("insert into question (title,description,gmt_create,gmt_modified,creator,tag) values (#{title}," +
            "#{description},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
    void create(Question question);
}
