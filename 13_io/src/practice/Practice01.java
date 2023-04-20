package practice;

import java.io.File;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO IO流练习
 * @date 2023/3/22 17:11:08
 */
public class Practice01 {
    public static void main(String[] args) {
        //判断 a:\practice\javase\13_io 中是否有文件夹 p01，没有就创建
        File file = new File("a:\\practice\\javase\\13_io\\p01");
        if (file.exists()) {
            System.out.println("文件夹已存在");
        } else {
            if (file.mkdir()) {
                System.out.println("文件夹创建成功");
            } else {
                System.out.println("文件夹创建失败");
            }
        }
    }
}
