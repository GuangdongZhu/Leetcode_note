package class2;

import org.springframework.validation.beanvalidation.SpringConstraintValidatorFactory;

import java.security.PrivateKey;
import java.util.List;
import java.util.Map;

public class Person_2 {
    private String name;
    private int age;
//    private List<Car> car;
    private Map<String, Car> car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, Car> getCar() {
        return car;
    }

    public void setCar(Map<String, Car> car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person_2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
