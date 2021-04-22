package com.dao.impl;
import com.dao.IUserDao;
import com.po.User;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
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
import java.util.List;
@Repository
public class UserDaoImpl implements IUserDao {
    @Resource
    private JdbcTemplate jdbcTemplate;


    @Override
    public User queryUser(String userName) {
        return jdbcTemplate.queryForObject("select id,user_pwd,user_name from t_user where name=?",new Object[]{userName},new UserRowMapper());
    }

    public static class UserRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user = new User();
            user.setUserPwd(resultSet.getString("name"));
            user.setUserName(resultSet.getString("password"));
            user.setId(resultSet.getInt("id"));
            return user;
        }
    }
}
