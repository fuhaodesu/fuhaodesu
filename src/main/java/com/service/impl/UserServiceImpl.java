package com.service.impl;

import com.dao.IUserDao;
import com.model.ResultModel;
import com.model.UserModel;
import com.po.User;
import com.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;
    @Override
    public ResultModel signIn(String userName, String userPwd) {
//        参数合法校验,根据用户名获取记录,执行判断

        ResultModel resultModel=new ResultModel();
        if(userName==null || "".equals(userName.trim())){
            resultModel.setCode(300);
            resultModel.setMsg("用户名不能为空");
            return resultModel;
        }
        if(userPwd==null || "".equals(userPwd.trim())){
            resultModel.setCode(300);
            resultModel.setMsg("密码不能为空");
            return resultModel;
        }
        User user =userDao.queryUser(userName);
        if(user==null){
            resultModel.setCode(300);
            resultModel.setMsg("用户不存在");
            return resultModel;
        }
        if(!user.getUserPwd().equals(userPwd)){
            resultModel.setCode(300);
            resultModel.setMsg("密码错误");
            return resultModel;
        }
        UserModel userModel=new UserModel();
        userModel.setUserName("userName");
        userModel.setId(user.getId());
        resultModel.setResult(userModel);
        return resultModel;
    }
}
