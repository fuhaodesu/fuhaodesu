package com.service.impl;

import com.dao.ILessonDao;
import com.model.LessonResultModel;
import com.po.lesson.Lesson;
import com.po.lesson.LessonInfo;
import com.service.ILessonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LessonServiceImpl implements ILessonService {


    @Resource
    private ILessonDao lessonDao;

    @Override
    public LessonResultModel createLesson(Lesson lesson) {

        LessonResultModel rm = new LessonResultModel();
        Integer id = lessonDao.queryLesson(lesson);


        if (id != null) {
            rm.setCode(300);
            rm.setMsg("课程已存在！");
        } else {

            lessonDao.createLesson(lesson);
            id = lessonDao.queryLesson(lesson);
            System.out.println(id);
            rm.setResult(id);
            rm.setCode(200);
            rm.setMsg("创建成功！");
        }
        return rm;
    }

    @Override
    public void editLesson(LessonInfo lessonInfo) {

        for (int i = lessonInfo.getStartWeek(); i <= lessonInfo.getEndWeek(); i++) {
            for (int j = lessonInfo.getStartNum(); j <= lessonInfo.getEndNum(); j++) {
                lessonInfo.setWeek(i);
                lessonInfo.setNum(j);
                lessonDao.addLessonInfo(lessonInfo);
            }
        }

    }

    @Override
    public List<Lesson> listLesson() {
        return lessonDao.listLesson();
    }

    @Override
    public List<LessonInfo> queryLessonTable() {
//        1.找到学生所选的所有课程
//        2.查询课程id
//        3.查询lessonInfo记录
//        4.返回List<LessonInfo>
        return null;
    }

    @Override
    public List<Lesson> queryForAllLessons() {
        return lessonDao.queryForAllLessons();
    }

    @Override
    public Integer delLesson(Integer id) {
        return lessonDao.delLesson(id);
    }
}