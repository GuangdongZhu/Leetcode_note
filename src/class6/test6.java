package class6;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test6 {
    @Test
    public  void testMode(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpEL.xml");

        Car car = context.getBean("car", Car.class);
        System.out.println(car);

        Address address = context.getBean("address", Address.class);
        System.out.println(address);


        Person person = context.getBean("person", Person.class);
        System.out.println(person);

    }
}
