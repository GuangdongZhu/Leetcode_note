package class8;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test8 {
    @Test
    public void testMode(){
        ApplicationContext context = new ClassPathXmlApplicationContext("QianZhiTongZhi_8.xml");
        CalculateImp calculateImp = context.getBean("calculateImp", CalculateImp.class);
        int result = calculateImp.add(3,6);
//        System.out.println(result);
    }
}
