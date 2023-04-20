package file;

import java.io.File;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 练习目录操作
 * @date 2023/3/20 16:15:44
 */
public class Directory {
    public static void main(String[] args) {
//        //删除文件
//        File file = new File("A:\\practice\\javase\\13_io\\news01.txt");
//        if (file.exists()) {
//            if (file.delete()) {
//                System.out.println("删除成功");
//            } else {
//                System.out.println("删除失败");
//            }
//        } else {
//            System.out.println("文件不存在，删除失败");
//        }
        //创建目录
        File file = new File("A:\\practice\\javase\\13_io\\directory01\\a\\b");
        if (file.exists()) {
            System.out.println("目录已存在");
        } else {
            if (file.mkdir()) {
                System.out.println("目录创建成功");
            } else {
                System.out.println("目录创建失败");
            }
        }
    }
}
