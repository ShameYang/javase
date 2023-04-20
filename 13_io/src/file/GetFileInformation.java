package file;

import java.io.File;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 练习获取文件信息的方法
 * @date 2023/3/20 16:07:24
 */
public class GetFileInformation {
    public static void main(String[] args) {
        File file = new File("A:\\practice\\javase\\13_io\\news01.txt");
        System.out.println("name : " + file.getName());
        System.out.println("absolute : " + file.getAbsolutePath());
        System.out.println("parent : " + file.getParent());
        System.out.println("length : " + file.length());
        System.out.println("exists : " + file.exists());
        System.out.println("is directory : " + file.isDirectory());
    }
}
