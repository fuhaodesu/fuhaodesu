package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class studentInforController {

    @RequestMapping(value = "teacher/createLesson")
    public ModelAndView createLesson(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("createLesson");
        return mv;
    }

}
