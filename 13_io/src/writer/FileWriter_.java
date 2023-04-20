package writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 文件字符输出流练习
 * @date 2023/3/21 19:42:35
 */
public class FileWriter_ {
    public static void main(String[] args) {
        String path = "a:\\practice\\javase\\13_io\\write02.txt";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path);
            fileWriter.write("我是...");
            fileWriter.write("你好上海", 0, 2);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
