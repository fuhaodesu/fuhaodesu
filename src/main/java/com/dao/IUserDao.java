package com.dao;

import com.po.User;

import java.util.List;

public interface IUserDao {

//    数据的增删改查
//    public Integer save(User user);
    public Integer saveHasKey(User user);
//    public Integer update(User user);
//    public Integer del(Integer id);
//
//
//    public Integer countUser();
//    public List<User> queryUsers();
    public User queryById(Integer id);
    public User queryUserByUserName(String userName);


////    数据的批量处理
//    public Integer saveBatch(List<User> users);
//    public Integer updateBatch(List<User> users);
//    public Integer delBatch(List<Integer> ids);

}
