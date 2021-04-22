package com.controller;
import com.dao.IUserDao;
import com.model.ResultModel;
import com.po.User;
import com.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @Resource
    private IUserService userService;

    @RequestMapping(value ={"/signin"},method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView signin(){
        ModelAndView mv=new ModelAndView();
//        设置视图
        mv.setViewName("signin");
//        设置模型数据
        mv.addObject("hello","login page");
        System.out.println("hello");
        return mv;
    }

    @RequestMapping(value = "/checkUser",method = RequestMethod.POST)
    public String checkUser(HttpServletRequest request){
        User user=new User();
        user.setUserName(request.getParameter("username"));
        user.setUserPwd(request.getParameter("password"));
        ResultModel rm=userService.signIn(user.getUserName(),user.getUserPwd());

        System.out.println(rm);




        return "login/welcome";
    }



}
