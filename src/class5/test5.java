package class5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class test5 {
    @Test
    public  void testMode() throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("WaiBuPeiZhiWenJian_5.xml");
        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        System.out.println(dataSource.getConnection());
//        com.mysql.cj.jdbc.ConnectionImpl@c667f46
    }
}
