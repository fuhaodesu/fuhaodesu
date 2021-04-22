package com.controller;

import com.po.lesson.Lesson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AjaxController {
    @RequestMapping("/ajax/a1")
    @ResponseBody
    public List<Lesson> a1(){
        Lesson lesson=new Lesson();
        lesson.setLessonName("淑芬");
        lesson.setTeacherName3("jiran");
        List<Lesson> lessons=new ArrayList<Lesson>();
        lessons.add(lesson);
        return lessons;
    }
    @RequestMapping("/student/ajax")
    public void AjaxIndex(String name, HttpServletRequest response) throws IOException {

//        if("admin".equals(name)){
//            response.getWriter().print("true");
//        }else{
//            response.getWriter().print("false");
//        }


    }
}
