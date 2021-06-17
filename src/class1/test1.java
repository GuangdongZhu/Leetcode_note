package class1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
    @Test
    public void testMode(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        HelloWorld helloworld = context.getBean("helloworld", HelloWorld.class);
        helloworld.printHelloWorld();
    }
}
