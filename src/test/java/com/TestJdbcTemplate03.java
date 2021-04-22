package com;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import javax.annotation.Resource;

//简化测试代码

@SpringJUnitConfig(locations = {"classpath:spring.xml"})
public class TestJdbcTemplate03 {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test(){

        System.out.println(jdbcTemplate.queryForObject("select count(*) from t_user", Integer.class));

    }
}
