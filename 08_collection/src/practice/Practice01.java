package practice;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 集合练习 - Collection
 * @date 2023/3/9 19:32:01
 */
@SuppressWarnings({"all"})
public class Practice01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("新闻一1234567890987654321"));
        arrayList.add(new News("新闻二0987654321234567890"));
        System.out.println(arrayList);

        //倒序遍历
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            News news = (News) arrayList.get(i);
            System.out.println(News.processTitle(news.getTitle()));
        }
    }
}

/**
 * 封装一个新闻类，包含标题和内容属性
 */
class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    //处理新闻标题
    public static String processTitle(String title) {
        if (title == null) {
            return "";
        }
        if (title.length() > 15) {
            return title.substring(0, 15) + "...";
        }
        return title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "title = " + title;
    }
}