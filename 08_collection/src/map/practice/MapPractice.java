package map.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO Map练习
 * @date 2023/3/8 16:52:00
 */
@SuppressWarnings({"all"})
public class MapPractice {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put(1, new Employee(1, "tom", 100000));
        hashMap.put(2, new Employee(2, "jack", 40000));
        hashMap.put(3, new Employee(3, "mike", 70000));

        //1. keySet -> 增强for 遍历工资 > 50000 的员工
        Set keySet = hashMap.keySet();
        for (Object key : keySet) {
            Employee e = (Employee) hashMap.get(key);
            if (e.getSal() > 50000) {
                System.out.println("id = " + key + " " + e);
            }
        }
    }
}

class Employee {
    private int id;
    private String name;
    private int sal;

    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
