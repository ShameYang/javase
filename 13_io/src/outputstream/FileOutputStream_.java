package outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 文件字节输出流练习
 * @date 2023/3/21 18:46:54
 */
public class FileOutputStream_ {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("a:\\practice\\javase\\13_io\\write.txt");
//            fileOutputStream.write(65);
//            fileOutputStream.write(66);
//            fileOutputStream.write(67);
//            fileOutputStream.write('D');
            fileOutputStream.write('X');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
