package com.model;

import lombok.Data;

//用户模型数据
@Data
public class UserModel {
    private  Integer id;
    private String userName;
    private String userPwd;
//    用户登陆成功,返回给前端id和用户名
}
