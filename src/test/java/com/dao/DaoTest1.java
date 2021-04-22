package com.dao;

import com.dao.impl.LessonDaoImpl;
import com.dao.impl.UserDaoImpl;
import com.po.User;
import com.po.lesson.Lesson;
import com.service.ILessonService;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


import javax.annotation.Resource;

@SpringJUnitConfig(locations = {"classpath:spring.xml"})
public class DaoTest1 {
    @Resource
    private UserDaoImpl userDaoImpl;
    @Resource
    private ILessonDao lessonDaoImpl;

    @Test
    public void queryU(){
        User user=userDaoImpl.queryUserByUserName("j123");
        System.out.println(user.getId()+"\t"+user.getUserName()+"\t"+user.getUserPwd()+"\t");

    }
    @Test
    void queryById(){
        User user=userDaoImpl.queryById(1);
        System.out.println(user.getId()+"\t"+user.getUserName()+"\t"+user.getUserPwd()+"\t");
    }
    @Test
    void queryLessonById(){
        System.out.println(lessonDaoImpl.queryLessonById(10));
    }
    @Test
    void queryLesson(){
        Lesson lesson=new Lesson();
        lesson.setLessonName("shufen10");
        lesson.setTeacherName1("tt");
        lesson.setTeacherName2("");
        lesson.setTeacherName3("");
        lesson.setTeacherName4("");
//        出问题...教师顺寻改变被视为不同课程
//        按字典序依次存储（未完成）
        System.out.println(lessonDaoImpl.queryLesson(lesson));
    }

//    @Test
//    public void queryByName(){
//        User user=userDaoImpl.queryUserByUserName("jiran");
//        System.out.println(user.getId()+"\t"+user.getUserName()+"\t"+user.getUserPwd()+"\t");
//
//    }
    @Resource
    ILessonService lessonService;
    @Test
    void queryAllLessons(){
        System.out.println(lessonService.queryForAllLessons());
    }



}
