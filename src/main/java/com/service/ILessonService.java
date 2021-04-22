package com.service;

import com.model.LessonResultModel;
import com.po.lesson.Lesson;
import com.po.lesson.LessonInfo;

public interface ILessonService {
    public LessonResultModel createLesson(Lesson lesson);
    public void editLesson(LessonInfo lessonInfo);
}
