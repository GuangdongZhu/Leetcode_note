package class2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.crypto.Data;

public class test2 {
    @Test
    public void testMode(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Car car = context.getBean("car", Car.class);
        System.out.println(car);

        Person person = context.getBean("person", Person.class);
        System.out.println(person);

        Person p = context.getBean("persons", Person.class);
        System.out.println(p);

//        Person_2 p2 = context.getBean("person3", Person_2.class);
//        System.out.println(p2);
        Person_2 p4 = context.getBean("person4", Person_2.class);
        System.out.println(p4);


        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        System.out.println(dataSource);
    }
}
