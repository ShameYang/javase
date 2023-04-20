package inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 文件字节输入流练习
 * @date 2023/3/20 17:03:51
 */
public class FileInputStream_ {
    public static void main(String[] args) {
        //使用 read()
        System.out.println("read()");
        int read = 0;
        try {
            FileInputStream fileInputStream = new FileInputStream("a:\\practice\\javase\\13_io\\write.txt");
            while ((read = fileInputStream.read()) != -1) {
                System.out.print((char) read);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //read(byte[] b)
        System.out.println("read(byte[] b)");
        byte[] b = new byte[8];
        int redLen = 0;
        try {
            FileInputStream fileInputStream = new FileInputStream("a:\\practice\\javase\\13_io\\write.txt");
            while ((redLen = fileInputStream.read(b)) != -1) {
                System.out.print(new String(b, 0, redLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
