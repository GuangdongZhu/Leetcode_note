package class7;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test7 {
    @Test
    public void testMode(){
        ApplicationContext context = new ClassPathXmlApplicationContext("FanXingYiLai.xml");

        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
//        输出结果是子类的UserRepository类型，表示泛型依赖成立
//        class7.UserRepository@3a44431a
    }
}
