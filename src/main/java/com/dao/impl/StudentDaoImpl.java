package com.dao.impl;

import com.dao.IStudentDao;
import com.po.Student;
import com.po.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Repository
public class StudentDaoImpl implements IStudentDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public Student queryStudentByName(String userName) {
        Student stu=new Student();
        try {
            return jdbcTemplate.queryForObject("select id,stu_name,stu_pwd from stu_user where stu_name=?",new Object[]{userName},new StuRowMapper());
        } catch (DataAccessException e) {
            return stu;
        }
    }
    @Override
    public Integer saveStuHasKey(Student student) {
        KeyHolder keyHolder=new GeneratedKeyHolder();
        jdbcTemplate.update((connection)->{
            PreparedStatement ps=connection.prepareStatement("insert into stu_user(stu_name,stu_pwd) values (?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,student.getUserName());
            ps.setString(2, student.getUserPwd());
            return ps;
        },keyHolder);
        return keyHolder.getKey().intValue();
    }


    public static class StuRowMapper implements RowMapper<Student> {
        @Override
        public Student mapRow(ResultSet resultSet, int i) throws SQLException {
            Student student = new Student();
            student.setUserPwd(resultSet.getString("stu_pwd"));
            student.setUserName(resultSet.getString("stu_name"));
            student.setId(resultSet.getInt("id"));
            return student;
        }
    }
}
