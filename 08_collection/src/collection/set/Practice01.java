package collection.set;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO HashSet练习
 * @date 2023/3/7 22:25:32
 */
@SuppressWarnings({"all"})
public class Practice01 {
    public static void main(String[] args) {
        /* 创建三个 Employee对象放入HashSet中
         * 若 name 和 age 值相同，认为是相同员工，不能添加 */
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("tom", 20));
        hashSet.add(new Employee("jacky", 20));
        hashSet.add(new Employee("tom", 20));
        System.out.println(hashSet);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //如果 name 和 age 值相同，则返回相同的 hash 值
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
