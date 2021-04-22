package com.controller;

import com.dao.ILessonDao;
import com.po.lesson.LessonInfo;
import com.service.ILessonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/lessson")
public class LessonQueryController {
    @Resource
    ILessonService lessonService;
    @RequestMapping(value = "queryForTable")
    @ResponseBody
    public List<LessonInfo> queryForTable(){
        return lessonService.queryLessonTable();



    }

}
