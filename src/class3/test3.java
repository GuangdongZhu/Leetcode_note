package class3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test3 {
    @Test
    public void testMode(){
        ApplicationContext context = new ClassPathXmlApplicationContext("autoWire_3.xml");

        Person person = context.getBean("person", Person.class);
        System.out.println(person);

        Person person2 = context.getBean("person2", Person.class);
        System.out.println(person2);
    }
}
