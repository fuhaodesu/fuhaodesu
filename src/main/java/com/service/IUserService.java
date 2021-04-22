package com.service;

import com.model.ResultModel;

public interface IUserService {
    public ResultModel signIn(String userName,String userPwd);
    public ResultModel signUp(String userName,String userPwd,String userPwd2);
}
