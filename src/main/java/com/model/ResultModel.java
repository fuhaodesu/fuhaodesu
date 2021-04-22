package com.model;

import lombok.Data;

//结果模型数据
@Data
public class ResultModel {
    private Integer code=200;
    private String msg="success";
    private UserModel result;
}
