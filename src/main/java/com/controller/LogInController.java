package com.controller;
import com.model.UserResultModel;
import com.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class LogInController {

    @RequestMapping(value = {"teacher/index"}, method =RequestMethod.GET)
    public ModelAndView teacherIndex() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("teaIndex");
        return mv;
    }
    @RequestMapping(value = {"teacher/sin"}, method =RequestMethod.GET)
    public ModelAndView signIn(String msg) {
        ModelAndView mv = new ModelAndView();

        mv.setViewName("login/sin");
        return mv;
    }
    @RequestMapping(value = {"teacher/sup"},method =RequestMethod.GET)
    public ModelAndView signUp(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("login/sup");
        return mv;
    }

    @Resource
    private IUserService userServiceImpl;

    @RequestMapping(value = "teacher/sin", method = RequestMethod.POST)
    public ModelAndView checkUser(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
//        设置视图
        UserResultModel rm = userServiceImpl.signIn(request.getParameter("user_name"), request.getParameter("user_pwd")) ;
        if (rm.getCode() == 200) {
            request.getSession().setAttribute("user",rm.getResult());
            mv.setViewName("login/welcome");
            mv.addObject("userName", rm.getResult().getUserName());
        } else {
            mv.setViewName("login/result");
            mv.addObject("code", rm.getCode());
            mv.addObject("msg", rm.getMsg());
        }
        return mv;
//
    }

    @RequestMapping(value = "/teacher/sup", method = RequestMethod.POST)
    public ModelAndView addUser(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
//        设置视图

        UserResultModel rm = userServiceImpl.signUp(request.getParameter("user_name"), request.getParameter("user_pwd"), request.getParameter("user_pwd2")) ;

        if (rm.getCode()==200) {
            mv.setViewName("login/welcome");
            mv.addObject("userName",rm.getResult().getUserName());
        } else {
            mv.setViewName("login/result");
            mv.addObject("code", rm.getCode());
            mv.addObject("msg", rm.getMsg());
        }
        return mv;
    }
}