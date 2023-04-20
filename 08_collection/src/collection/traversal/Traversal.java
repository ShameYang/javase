package collection.traversal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 三种方式遍历集合
 * @date 2023/3/7 16:56:40
 */
public class Traversal {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add(100);

        System.out.println("===Iterator===");
        //Iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        //foreach
        System.out.println("===foreach===");
        for (Object obj : list) {
            System.out.println(obj);
        }

        //for
        System.out.println("===for===");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
