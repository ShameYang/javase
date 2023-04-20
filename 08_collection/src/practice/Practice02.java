package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 集合练习 - Map
 * @date 2023/3/9 19:59:07
 */
@SuppressWarnings({"all"})
public class Practice02 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
//        hashMap.put(1, new Employee("jack", 650));
//        hashMap.put(2, new Employee("tom", 1200));
//        hashMap.put(3, new Employee("smith", 2900));
//        System.out.println(hashMap.get(1));
        hashMap.put("jack", 650);
        hashMap.put("tom", 1200);
        hashMap.put("smith", 2900);
        System.out.println(hashMap);

        // 将jack工资更改为2600元
        hashMap.put("jack", 2600);
        System.out.println(hashMap);

        // 为所有员工工资增加100元
        for (Object key : hashMap.keySet()) {
            hashMap.put(key, (Integer)hashMap.get(key) + 100);
        }
        System.out.println(hashMap);

        // 遍历所有员工
        // entrySet
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
        // 遍历所有工资
        // values
        for (Object value : hashMap.values()) {
            System.out.println(value);
        }

    }
}
//
///**
// * 员工类
// * 属性：姓名 工资
// */
//class Employee {
//    private String name;
//    private int sal;
//
//    public Employee(String name, int sal) {
//        this.name = name;
//        this.sal = sal;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getSal() {
//        return sal;
//    }
//
//    public void setSal(int sal) {
//        this.sal = sal;
//    }
//
//    @Override
//    public String toString() {
//        return "name=" + name + " sal=" + sal + '\n';
//    }
//}
