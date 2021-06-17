package class8;

import org.springframework.stereotype.Component;

@Component
public class CalculateImp {


    public int add(int a, int b) {
        System.out.println(a+b);
        return a+b;
    }


    public int sub(int a, int b) {
        return a-b;
    }


    public int mul(int a, int b) {
        return a*b;
    }


    public int div(int a, int b) {
        return a/b;
    }
}
