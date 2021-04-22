
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJdbcTemplate {


    @Test
    public void test(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate= (JdbcTemplate) ac.getBean("jdbcTemplate");
        System.out.println(jdbcTemplate.queryForObject("select count(*) from t_user", Integer.class));
    }

}
