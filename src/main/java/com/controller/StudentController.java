package com.controller;

import com.dao.IStudentDao;
import com.model.UserResultModel;
import com.po.lesson.Lesson;
import com.service.ILessonService;
import com.service.IStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class StudentController {
    @RequestMapping(value = {"student/index"}, method = RequestMethod.GET)
    public ModelAndView stuIndex() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("stuIndex");
        return mv;
    }
    @RequestMapping(value = {"student/sin"}, method =RequestMethod.GET)
    public ModelAndView stuSignIn(String msg) {
        ModelAndView mv = new ModelAndView();

        mv.setViewName("login/sin");
        return mv;
    }
    @RequestMapping(value = {"student/sup"},method =RequestMethod.GET)
    public ModelAndView stuSignUp(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("login/sup");
        return mv;
    }
    @Resource
    IStudentService studentService;
    ILessonService lessonService;
    @RequestMapping(value = "student/sin", method = RequestMethod.POST)
    public ModelAndView checkStuUser(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
//        设置视图
        UserResultModel rm =studentService.stuSignIn(request.getParameter("user_name"), request.getParameter("user_pwd")) ;
        if (rm.getCode() == 200) {
            request.getSession().setAttribute("student",rm.getResult());
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
    @RequestMapping(value = "/student/sup", method = RequestMethod.POST)
    public ModelAndView addStuUser(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
//        设置视图

        UserResultModel rm = studentService.stuSignUp(request.getParameter("user_name"), request.getParameter("user_pwd"), request.getParameter("user_pwd2")) ;

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
    @RequestMapping(value = "student/chooseLesson",method=RequestMethod.GET)
    public ModelAndView chooseLesson(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("lesson/lessonChoose");
        return mv;
    }
    @RequestMapping(value = "student/queryLesson",method=RequestMethod.GET)
    public ModelAndView queryLesson(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("lesson/queryLesson");
        return mv;
    }
    @RequestMapping(value = "student/queryLessons")
    @ResponseBody
    public List<Lesson> queryLessons(){
        return lessonService.queryForAllLessons();
    }
}
