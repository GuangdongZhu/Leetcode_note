package class7;

import org.springframework.beans.factory.annotation.Autowired;

import javax.print.attribute.standard.PresentationDirection;

public class BaseService<T> {
    @Autowired
    protected BaseReposity<User> reposity;

    public void add(){
        System.out.println("add...");
        System.out.println(reposity);
    }
}
