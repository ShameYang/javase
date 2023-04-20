package methodref;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 方法引用测试
 * @date 2023/3/26 18:39:59
 */
public class MethodRefTest {
    //情况一 对象::实例方法
    //Consumer 中 void accept(T t)
    //PrintStream 中 void println(T t)
    @Test
    public void test1() {
        //之前的
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("aaa");

        //Lambda 表达式
        Consumer<String> con1 = str -> System.out.println(str);
        con1.accept("abc");

        //方法引用
        PrintStream ps = System.out;
        Consumer<String> con2 = ps::println;
        //结合
        Consumer<String> con3 = System.out::println;
        con2.accept("def");
        con3.accept("ghi");
    }

    //情况二 类::静态方法
    //Comparator 中 int compare(T t1, T t2)
    //Integer 中 int compare(T t1, T t2)
    @Test
    @SuppressWarnings({"all"})
    public void test2() {
        //Lambda 表达式
        Comparator<Integer> com1 = (t1, t2) -> Integer.compare(t1, t2);
        System.out.println(com1.compare(12, 21));

        //方法引用
        Comparator<Integer> com2 = Integer::compare;
        System.out.println(com1.compare(21, 12));
    }

    //情况三 类::实例方法
    //Comparator 中 int compare(T t1, T t2)
    //String 中 int t1.compareTo(t2)
    @Test
    @SuppressWarnings({"all"})
    public void test3() {
        //Lambda
        Comparator<String> com1 = (s1, s2) -> s1.compareTo(s2);
        System.out.println(com1.compare("abc", "def"));

        //方法引用
        Comparator<String> com2 = String :: compareTo;
        System.out.println(com2.compare("abc", "def"));
    }
}
