package class4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test4 {
    @Test
    public void testMode(){
        ApplicationContext context = new ClassPathXmlApplicationContext("JiChengYiLai_4.xml");

//        Address address = context.getBean("address", Address.class);
//        System.out.println(address);

        Address address2 = context.getBean("address2", Address.class);
        System.out.println(address2);

        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }
}
