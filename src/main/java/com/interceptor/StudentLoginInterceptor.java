package com.interceptor;

import com.po.Student;
import com.po.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentLoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Student student= (Student) request.getSession().getAttribute("student");
        if(student==null){
            System.out.println("请先登录");
            response.sendRedirect("http://localhost:8080/student/sin");
            return false;
        }
        return true;
    }
}