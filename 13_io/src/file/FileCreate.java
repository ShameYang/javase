package file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 练习创建文件
 * @date 2023/3/20 15:48:31
 */
public class FileCreate {
    public static void main(String[] args) {

    }

    //1. new File(String pathname)
    @Test
    public void create01() {
        String filePath = "A:\\practice\\javase\\13_io\\news01.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //2. new File(File parent, String child)
    @Test
    public void create02() {
        File fileParent = new File("A:\\practice\\javase\\13_io\\");
        String fileName = "news02.txt";
        File file = new File(fileParent, fileName);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //3. new File(String parent, String child)
    @Test
    public void create03() {
        String parent = "A:\\practice\\javase\\13_io\\";
        String child = "news03.txt";
        File file = new File(parent, child);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
