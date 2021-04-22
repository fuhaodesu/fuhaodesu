package com.service.impl;

//import com.dao.IUserDao;
//import com.dao.impl.UserDaoImpl;
import com.dao.impl.UserDaoImpl;
import com.model.ResultModel;
import com.model.UserModel;
import com.po.User;
import com.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.xml.ws.ServiceMode;

@Service
public class UserServiceImpl implements IUserService {


    @Resource
    private UserDaoImpl userDaoImpl;
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


        User user =userDaoImpl.queryUserByUserName(userName);
//        System.out.println(user);
//        System.out.println(user.getId()+"\t"+user.getUserName()+"\t"+user.getUserPwd()+"\t");
        if(user.getUserName()==null){
            resultModel.setCode(300);
            resultModel.setMsg("用户不存在");
            return resultModel;
        }
        if(!user.getUserPwd().equals(userPwd)){
            resultModel.setCode(301);
            resultModel.setMsg("密码错误");
            return resultModel;
        }
        UserModel userModel=new UserModel();
        userModel.setUserName(userName);
        userModel.setId(user.getId());
        resultModel.setResult(userModel);
        resultModel.setCode(200);
        return resultModel;
    }

    @Override
    public ResultModel signUp(String userName, String userPwd, String userPwd2) {
        ResultModel resultModel=new ResultModel();
        if(userName==null || "".equals(userName.trim())||userName.length()<3||userName.length()>12){
            resultModel.setCode(300);
            resultModel.setMsg("用户名不符要求！");
            return resultModel;
        }

        User user =userDaoImpl.queryUserByUserName(userName);
        if(user.getUserName()!=null){
            resultModel.setCode(300);
            resultModel.setMsg("用户名已存在！");
            return resultModel;
        }
        if(userPwd==null || "".equals(userPwd.trim())||userPwd.length()<6||userPwd.length()>30){
            resultModel.setCode(301);
            resultModel.setMsg("密码不符要求！");
            return resultModel;
        }
        if(userPwd2==null || "".equals(userPwd2.trim())){
            resultModel.setCode(302);
            resultModel.setMsg("密码不能为空！");
            return resultModel;
        }
        if(!userPwd.trim().equals(userPwd2.trim())){
            resultModel.setCode(303);
            resultModel.setMsg("两次密码不一致！");
            return resultModel;
        }

        User user1=new User();
        user1.setUserName(userName);
        user1.setUserPwd(userPwd);
        user1.setId(userDaoImpl.saveHasKey(user1));
        resultModel.setCode(200);
        resultModel.setMsg("注册成功！");
        UserModel userModel=new UserModel();
        userModel.setUserName(user1.getUserName());
        userModel.setId(user1.getId());
        resultModel.setResult(userModel);
        return resultModel;
    }
}
