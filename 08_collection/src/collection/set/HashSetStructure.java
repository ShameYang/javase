package collection.set;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO HashSet 底层结构模拟
 * @date 2023/3/7 20:19:00
 */
public class HashSetStructure {
    public static void main(String[] args) {
        //模拟一个 HashSet的底层(HashMap) 结构

        //1.创建表
        Node[] table = new Node[16];

        //2.创建结点
        Node node1 = new Node("node1", null);
        table[2] = node1;
        Node node2 = new Node("node2", null);
        node1.next = node2;
        System.out.println("table = " + table);
    }
}

class Node { //结点, 存储数据

    Object item; //存放数据
    Node next; //指向下一个结点

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    @Override
    public String toString() {
        return "item = " + item;
    }
}
