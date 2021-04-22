package com.interceptor;

import com.po.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//用户非法请求拦截
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        User user= (User) request.getSession().getAttribute("user");
        System.out.println(user);
        if(user ==null){
            System.out.println("请先登录");
            response.sendRedirect("http://localhost:8080/teacher/sin");
            return false;
        }
        return true;
    }
}
