package com.controller;

import com.model.ResultModel;
import com.po.lesson.Lesson;
import com.service.ILessonService;
import com.service.impl.LessonServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class StudentInfoController {

    @RequestMapping(value = "teacher/createLesson",method =RequestMethod.GET)
    public ModelAndView createLesson(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("lesson/createLesson");
        return mv;
    }
    @Resource
    ILessonService lessonService;
    @RequestMapping(value = "teacher/LessonInfo",method =RequestMethod.POST)
    public ModelAndView subCreateLesson(HttpServletRequest request){
        ModelAndView mv=new ModelAndView();
        Lesson lesson=new Lesson();
        lesson.setLessonName(request.getParameter("lessonName"));
        lesson.setTeacherName1(request.getParameter("teaName1"));
        lesson.setTeacherName2(request.getParameter("teaName2"));
        lesson.setTeacherName3(request.getParameter("teaName3"));
        lesson.setTeacherName4(request.getParameter("teaName4"));
        ResultModel rm=lessonService.createLesson(lesson);

        mv.setViewName("lesson/result");
        mv.addObject("code", rm.getCode());
        mv.addObject("msg", rm.getMsg());
        return mv;
    }

}
