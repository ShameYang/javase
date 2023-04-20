package methodref;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 构造器引用测试
 * @date 2023/3/27 14:15:55
 */
public class ConstructorRefTest {
    //构造器引用
    //Supplier 中的 get()
    //Employee 中的无参构造器
    @Test
    public void test1() {
        //before
        Supplier<Employee> sup = new Supplier<Employee>() {
            @Override
            public Employee get() {
                return new Employee();
            }
        };
        sup.get();

        //Lambda
        Supplier<Employee> sup1 = () -> new Employee();
        sup1.get();

        //MethodRef
        Supplier<Employee> sup2 = Employee::new;
        sup2.get();
    }
}

class Employee {
    public Employee() {
        System.out.println("Employee()...");
    }
}