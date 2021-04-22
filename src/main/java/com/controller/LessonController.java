package com.controller;

import com.dao.ILessonDao;
import com.model.LessonResultModel;
import com.model.UserResultModel;
import com.po.lesson.Lesson;
import com.po.lesson.LessonInfo;
import com.service.ILessonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class LessonController {


    @RequestMapping(value = "teacher/createLesson",method =RequestMethod.GET)
    public ModelAndView createLesson(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("lesson/createLesson");
        return mv;
    }
    @Resource
    ILessonService lessonService;
    @Resource
    ILessonDao lessonDao;
    @RequestMapping(value = "teacher/createLesson",method =RequestMethod.POST)
    public ModelAndView submitCreateLesson(HttpServletRequest request){
        ModelAndView mv=new ModelAndView();

        Lesson lesson=new Lesson();
        lesson.setLessonName(request.getParameter("lessonName"));
        lesson.setTeacherName1(request.getParameter("teaName1"));
        lesson.setTeacherName2(request.getParameter("teaName2"));
        lesson.setTeacherName3(request.getParameter("teaName3"));
        lesson.setTeacherName4(request.getParameter("teaName4"));
        LessonResultModel rm=lessonService.createLesson(lesson);

        mv.setViewName("lesson/result");
        mv.addObject("code", rm.getCode());
        mv.addObject("msg", rm.getMsg());
        mv.addObject("id",rm.getResult());
//        System.out.println(rm.getResult());
        return mv;
    }
    @RequestMapping(value ="teacher/editLesson",method = RequestMethod.GET)
    public ModelAndView editLesson(Integer id){
        ModelAndView mv=new ModelAndView();

        System.out.println(id);
        mv.setViewName("lesson/editLesson");
        Lesson lesson=lessonDao.queryLessonById(id);
        System.out.println(lesson);
        mv.addObject("lessonName",lesson.getLessonName());
        mv.addObject("tea1",lesson.getTeacherName1());
        mv.addObject("tea2",lesson.getTeacherName2());
        mv.addObject("tea3",lesson.getTeacherName3());
        mv.addObject("tea4",lesson.getTeacherName4());
        return mv;
    }
    @RequestMapping(value ="teacher/editLesson",method = RequestMethod.POST)
    public ModelAndView submitEditLesson(HttpServletRequest request){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("lesson/result");

        LessonInfo lessonInfo=new LessonInfo();
        System.out.println(request.getParameter("building"));
        System.out.println(Integer.parseInt(request.getParameter("room")));
        lessonInfo.setBuilding(request.getParameter("building"));
        lessonInfo.setRoom(Integer.parseInt(request.getParameter("room")));
        lessonInfo.setStartWeek(Integer.parseInt(request.getParameter("startWeek")));
        lessonInfo.setEndWeek(Integer.parseInt(request.getParameter("endWeek")));
        lessonInfo.setDay(Integer.parseInt(request.getParameter("day")));
        lessonInfo.setStartNum(Integer.parseInt(request.getParameter("startNum")));
        lessonInfo.setEndNum(Integer.parseInt(request.getParameter("endNum")));
//        lessonInfo.setId(Integer.parseInt(request.getParameter("id")));

        System.out.println(lessonInfo);
        lessonService.editLesson(lessonInfo);

        return mv;
    }

    @RequestMapping(value = "teacher/listLesson")
    public ModelAndView listLesson(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("lesson/createLesson");
        return mv;
    }
    @RequestMapping(value = "teacher/listLessons")
    @ResponseBody
    public List<Lesson> listLessons(){
        return lessonService.listLesson();
     }


}
