package class9;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

public class Calcul_Proxy {

    public void beforeMessage(){
        System.out.println("before");
    }

    public void afterMessage(){
        System.out.println("after");
    }

    public void afterReturning(){
        System.out.println("afterReturning");
    }

    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕前");
        proceedingJoinPoint.proceed();
        System.out.println("环绕后");
    }

}
