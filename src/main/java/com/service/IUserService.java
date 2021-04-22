package com.service;

import com.model.ResultModel;

public interface IUserService {
    public ResultModel signIn(String userName,String userPwd);
}
