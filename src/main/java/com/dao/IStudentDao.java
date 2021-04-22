package com.dao;

import com.po.Student;
import com.po.User;

public interface IStudentDao {
    public Student queryStudentByName(String userName);
    public Integer saveStuHasKey(Student student);
}
