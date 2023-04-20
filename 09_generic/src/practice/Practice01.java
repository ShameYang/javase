package practice;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 泛型练习
 * @date 2023/3/12 14:04:26
 */
public class Practice01 {
    public static void main(String[] args) {
    }

    @Test
    public void testList() {
        Dao<User> dao = new Dao<>();
        dao.save("001", new User(1,10,"jack"));
        dao.save("002", new User(2,18,"tom"));
        dao.save("003", new User(3,18,"tom"));

        System.out.println(dao.list());

        dao.delete("003");
        System.out.println(dao.list());

        dao.update("002", new User(2,20,"mike"));
        System.out.println(dao.list());
    }
}

/* 定义一个泛型类 Dao<T>，其中有一个 Map 成员变量，Map 的键为 String类型，值为T类型 */
class Dao<T> {
    private Map<String, T> map = new HashMap<>();

    //保存 T 类型对象到 Map 成员变量中
    public void save(String id, T entity) {
        map.put(id, entity);
    }

    //从 map 中获取 id 对应的对象
    public T get(String id) {
        return map.get(id);
    }

    //替换 map 中 key 为 id 的内容， 改为 entity 对象
    public void update(String id, T entity) {
        map.put(id, entity);
    }

    //返回 map 中存放的所有 T 对象
    public List<T> list() {
        //创建 ArrayList
        List<T> list= new ArrayList<>();

        //遍历 map
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            list.add(get(key));
        }

        return list;
    }

    //删除指定 id 对象
    public void delete(String id) {
        map.remove(id);
    }
}

/* 定义一个 User 类 */
class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}