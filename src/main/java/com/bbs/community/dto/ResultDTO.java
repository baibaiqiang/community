package com.bbs.community.dto;

import com.bbs.community.exception.CustomizeErrorCode;
import lombok.Data;

import javax.xml.transform.Result;

/**
 * @author Parcol
 * @date 2019/10/6
 **/
@Data
public class ResultDTO {
    private Integer code;
    private String message;

    public static ResultDTO errorOf(Integer code,String message){
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(code);
        resultDTO.setMessage(message);
        return resultDTO;
    }

    public static ResultDTO errorOf(CustomizeErrorCode errorCode) {
        return errorOf(errorCode.getCode(),errorCode.getMessage());
    }
    public static ResultDTO okOf(){
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(200);
        resultDTO.setMessage("登录成功");
        return resultDTO;
    }
}
