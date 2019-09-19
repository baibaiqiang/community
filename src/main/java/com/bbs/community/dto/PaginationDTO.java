package com.bbs.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Parcol
 * @date 2019/9/19
 **/
@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
    private Boolean showPrevious;
    private Boolean showFirstPage;
    private Boolean showNext;
    private Boolean showEndPage;
    private Integer page;
    private List<Integer> pages;
    private Integer totalPage;
    //当前页前后显示范围
    private static final Integer pageRange = 3;


    public void setPagination(Integer totalCount, Integer page, Integer size) {



        pages= new ArrayList<>();

        if(totalCount % size == 0){
            totalPage = totalCount / size;
        }else{
            totalPage = totalCount / size + 1;
        }


        //将参数page赋值给属性page
        this.page = page;
        pages.add(page);
        for(int i = 1;i <= pageRange;i++){
            //获取当前页前面部分页码
            if(page - i > 0){
                pages.add(0,page - i);
            }
            //获取当前页后面部分页码
            if(page + i <= totalPage){
                pages.add(page + i);
            }
        }


        //是否展示上一页
        if(page == 1){
            showPrevious = false;
        }else{
            showPrevious = true;
        }
        //是否展示下一页
        if(page.equals(totalPage)){
            showNext = false;
        }else{
            showNext = true;
        }
        //是否展示首页
        if(pages.contains(1)){
            showFirstPage = false;
        }else{
            showFirstPage = true;
        }
        //是否展示末页
        if(pages.contains(totalPage)){
            showEndPage = false;
        }else{
            showEndPage = true;
        }
    }
}
