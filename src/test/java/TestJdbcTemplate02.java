import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

//简化测试代码

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class TestJdbcTemplate02 {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test(){

        System.out.println(jdbcTemplate.queryForObject("select count(*) from t_user", Integer.class));

    }
}
