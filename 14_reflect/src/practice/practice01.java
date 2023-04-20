package practice;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 反射练习 - 通过反射修改私有成员变量
 * @date 2023/3/25 22:09:14
 */
public class practice01 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        //1. 得到 PrivateTest 类对应的 Class 对象
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        //2. 创建对象
        PrivateTest privateTestObj = privateTestClass.newInstance();
        //3. 得到 name 属性对象
        Field name = privateTestClass.getDeclaredField("name");
        //4. 爆破 name
        name.setAccessible(true);
        name.set(privateTestObj, "tom");
        //5. 得到 getName 方法对象
        Method getName = privateTestClass.getMethod("getName");
        //6. public 方法直接调用
        Object invoke = getName.invoke(privateTestObj);
        System.out.println("name属性值=" + invoke);
    }
}

/* 定义 PrivateTest 类，有私有属性 name 并且属性值为 hellokitty */
class PrivateTest {
    private String name = "hellokitty";

    public String getName() {
        return name;
    }
}