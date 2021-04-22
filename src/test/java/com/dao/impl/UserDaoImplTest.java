package com.dao.impl;
import com.dao.IUserDao;
import com.po.User;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringJUnitConfig(locations = {"classpath:spring.xml"})
class UserDaoImplTest {
    @Resource
    private IUserDao userDaoImpl;

//    数据的增删改查
    @Test
    void test01(){
        User user=new User();
        user.setUserName("test01");
        user.setUserPwd("123456");
        System.out.println(userDaoImpl.save(user));
    }
    @Test
    void test02(){
        User user=new User();
        user.setUserName("test02");
        user.setUserPwd("123456");
        System.out.println(userDaoImpl.saveHasKey(user));
    }
    @Test
    void test03(){
        User user=new User();
        user.setUserName("test02");
        user.setUserPwd("123");
        user.setId(4);
        System.out.println(userDaoImpl.update(user));
    }

    @Test
    void test04(){
        System.out.println(userDaoImpl.del(4));
    }
    @Test
    void countUser(){
        System.out.println(userDaoImpl.countUser());
    }
    @Test
    void queryUsers(){
        userDaoImpl.queryUsers().forEach(u->{
            System.out.println(u.getId()+"\t"+u.getUserName()+"\t"+u.getUserPwd());
        });
    }
    @Test
    void queryById(){
        User user=userDaoImpl.queryById(1);
        System.out.println(user.getId()+"\t"+user.getUserName()+"\t"+user.getUserPwd()+"\t");
    }
    @Test
    void saveBatch(){
        List<User> users=new ArrayList<User>();
        User user03=new User();
        user03.setUserName("test03");
        user03.setUserPwd("123456");
        users.add(user03);
        User user04=new User();
        user04.setUserName("test04");
        user04.setUserPwd("123456");
        users.add(user04);
//        System.out.println(users.size());
        System.out.println(userDaoImpl.saveBatch(users));
    }

    @Test
    void updateBatch(){
        List<User> users=new ArrayList<User>();
        User user03=new User();
        user03.setUserName("test03");
        user03.setUserPwd("654321");
        user03.setId(5);
        users.add(user03);
        User user04=new User();
        user04.setUserName("test04");
        user04.setUserPwd("654321");
        user04.setId(6);
        users.add(user04);
//        System.out.println(users.size());
        System.out.println(userDaoImpl.updateBatch(users));
    }
    @Test
    void delBatch(){
        List<Integer> ids=new ArrayList<Integer>();

        for(int j=5;j<10;j++){
            ids.add(j);
        }
        System.out.println(userDaoImpl.delBatch(ids));
    }


}