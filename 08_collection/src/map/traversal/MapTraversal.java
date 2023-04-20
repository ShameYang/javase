package map.traversal;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 遍历 Map
 * @date 2023/3/9 11:13:44
 */
@SuppressWarnings({"all"})
public class MapTraversal {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        //增强for
        //1.keySet
        for (Object key : map.keySet()) {
            System.out.println("key = " + key + " value = " + map.get(key));
        }

        //2.values
        for (Object value : map.values()) {
            System.out.println(value);
        }

        //3.entrySet
        for (Object entry : map.entrySet()) {
            Map.Entry m = (Map.Entry) entry;
            System.out.println("key = " + m.getKey() + " value = " + m.getValue());
        }
    }
}
