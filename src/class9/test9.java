package class9;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test9 {
    @Test
    public void testMode(){
        ApplicationContext context = new ClassPathXmlApplicationContext("AOP_xml_9.xml");

        Calculate_method calculate_method = context.getBean("calculate_method", Calculate_method.class);

        calculate_method.add();

    }
}
