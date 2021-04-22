package com.model;

import lombok.Data;

@Data
public class LessonResultModel {
    private Integer code=200;
    private String msg="success";
    private Object result;
}
