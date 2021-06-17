package class8;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SendMessage {
    @Before(value = "execution(* class8.*.*(..))")
    public void message(){
        System.out.println("before message");
    }

    @After(value = "execution(* class8.*.*(..))")
    public void after(){
        System.out.println("after");
    }
    //异常通知 出现异常才会出现 第四步
    @AfterThrowing(value = "execution(* class8.*.*(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }
}
