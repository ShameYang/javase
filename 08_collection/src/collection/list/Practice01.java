package collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 练习使用List的实现类
 * @date 2023/3/7 17:15:37
 */
@SuppressWarnings({"all"})
public class Practice01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("红楼梦", 100, "曹雪芹"));
        list.add(new Book("西游记", 90, "吴承恩"));
        sort(list);
        for (Object books : list) {
            System.out.println(books);
        }
    }

    public static void sort(List list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.price > book2.price) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }
}

class Book {
    public String name;
    public int price;
    public String author;

    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "名称: " + name + " \t价格: " + price + " \t作者: " + author;
    }
}
