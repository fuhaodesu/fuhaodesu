package com.service.impl;

import com.dao.IStudentDao;
import com.model.UserModel;
import com.model.UserResultModel;
import com.po.Student;
import com.po.User;
import com.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements IStudentService {
    @Resource
    IStudentDao studentDao;
    @Override
    public UserResultModel stuSignIn(String userName, String userPwd) {
        //        参数合法校验,根据用户名获取记录,执行判断
        UserResultModel userResultModel =new UserResultModel();
        if(userName==null || "".equals(userName.trim())){
            userResultModel.setCode(300);
            userResultModel.setMsg("用户名不能为空");
            return userResultModel;
        }
        if(userPwd==null || "".equals(userPwd.trim())){
            userResultModel.setCode(300);
            userResultModel.setMsg("密码不能为空");
            return userResultModel;
        }
        Student student=studentDao.queryStudentByName(userName);
//        System.out.println(user);
//        System.out.println(user.getId()+"\t"+user.getUserName()+"\t"+user.getUserPwd()+"\t");
        if(student.getUserName()==null){
            userResultModel.setCode(300);
            userResultModel.setMsg("用户不存在");
            return userResultModel;
        }
        if(!student.getUserPwd().equals(userPwd)){
            userResultModel.setCode(301);
            userResultModel.setMsg("密码错误");
            return userResultModel;
        }
        UserModel userModel=new UserModel();
        userModel.setUserName(userName);
        userModel.setId(student.getId());
        userResultModel.setResult(userModel);
        userResultModel.setCode(200);

        return userResultModel;
    }
    @Override
    public UserResultModel stuSignUp(String userName, String userPwd, String userPwd2) {
        UserResultModel userResultModel =new UserResultModel();
        if(userName==null || "".equals(userName.trim())||userName.length()<3||userName.length()>12){
            userResultModel.setCode(300);
            userResultModel.setMsg("用户名不符要求！");
            return userResultModel;
        }

        Student student=studentDao.queryStudentByName(userName);
        if(student.getUserName()!=null){
            userResultModel.setCode(300);
            userResultModel.setMsg("用户名已存在！");
            return userResultModel;
        }
        if(userPwd==null || "".equals(userPwd.trim())||userPwd.length()<6||userPwd.length()>30){
            userResultModel.setCode(301);
            userResultModel.setMsg("密码不符要求！");
            return userResultModel;
        }
        if(userPwd2==null || "".equals(userPwd2.trim())){
            userResultModel.setCode(302);
            userResultModel.setMsg("密码不能为空！");
            return userResultModel;
        }
        if(!userPwd.trim().equals(userPwd2.trim())){
            userResultModel.setCode(303);
            userResultModel.setMsg("两次密码不一致！");
            return userResultModel;
        }

        Student student1=new Student();
        student1.setUserName(userName);
        student1.setUserPwd(userPwd);
        student1.setId(studentDao.saveStuHasKey(student1));
        userResultModel.setCode(200);
        userResultModel.setMsg("注册成功！");
        UserModel userModel=new UserModel();
        userModel.setUserName(student1.getUserName());
        userModel.setId(student1.getId());
        userResultModel.setResult(userModel);
        return userResultModel;
    }
}
