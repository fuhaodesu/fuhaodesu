package com.dao;

import com.dao.impl.UserDaoImpl;
import com.po.User;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


import javax.annotation.Resource;

@SpringJUnitConfig(locations = {"classpath:spring.xml"})
public class DaoTest1 {
    @Resource
    private UserDaoImpl userDaoImpl;

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

//    @Test
//    public void queryByName(){
//        User user=userDaoImpl.queryUserByUserName("jiran");
//        System.out.println(user.getId()+"\t"+user.getUserName()+"\t"+user.getUserPwd()+"\t");
//
//    }


}
