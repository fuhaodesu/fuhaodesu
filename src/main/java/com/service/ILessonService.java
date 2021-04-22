package com.service;

import com.model.LessonResultModel;
import com.po.lesson.Lesson;
import com.po.lesson.LessonInfo;

import java.util.List;

public interface ILessonService {
    public LessonResultModel createLesson(Lesson lesson);
    public void editLesson(LessonInfo lessonInfo);
    public List<Lesson> listLesson();
    public List<LessonInfo> queryLessonTable();
    public List<Lesson> queryForAllLessons();
    public Integer delLesson(Integer id);
}
