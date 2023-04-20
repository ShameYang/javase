package collection.list;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 理解简单双向链表
 * @date 2023/3/7 19:24:36
 */
public class LinkedList01 {
    public static void main(String[] args) {
        //模拟简单的双向链表
        Node node1 = new Node("tom");
        Node node2 = new Node("jack");
        Node node3 = new Node("mike");

        //连接三个结点，形成双向链表
        //tom -> jack -> mike
        node1.next = node2;
        node2.next = node3;
        //tom <- jack <- mike
        node3.prev = node2;
        node2.prev = node1;

        //从头到尾遍历
        Node first = node1;
        System.out.println("===从头到尾遍历===");
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        //从尾到头遍历
        Node last = node3;
        System.out.println("===从尾到头遍历===");
        while (true) {
            if (last == null) {
                break;
            }
            System.out.println(last);
            last = last.prev;
        }
    }
}

class Node {
    public Object item;
    public Node next;
    public Node prev;

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name = " + item;
    }
}
