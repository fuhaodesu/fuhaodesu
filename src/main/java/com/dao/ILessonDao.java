package com.dao;

import com.po.User;
import com.po.lesson.Lesson;
import com.po.lesson.LessonInfo;

import java.util.List;

public interface ILessonDao {
    public Integer createLesson(Lesson lesson);
    public Integer queryLesson(Lesson lesson);
    public Lesson queryLessonById(Integer id);
    public Integer addLessonInfo(LessonInfo lessonInfo);
    public List<Lesson> listLesson();


}
