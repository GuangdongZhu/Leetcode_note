package class10;

import class2.DataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test10 {
    @Test
    public void testMode(){
        ApplicationContext context = new ClassPathXmlApplicationContext("JDBC_10.xml");
        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        System.out.println(dataSource);
    }
}
