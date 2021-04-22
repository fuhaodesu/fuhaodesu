package com.service;

import com.model.UserResultModel;

public interface IStudentService {
    public UserResultModel stuSignIn(String userName,String userPwd);
    public UserResultModel stuSignUp(String userName, String userPwd, String userPwd2);
}
