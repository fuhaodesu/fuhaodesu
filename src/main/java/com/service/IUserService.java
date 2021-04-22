package com.service;

import com.model.UserResultModel;

public interface IUserService {
    public UserResultModel signIn(String userName, String userPwd);
    public UserResultModel signUp(String userName, String userPwd, String userPwd2);
}
