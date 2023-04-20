package reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 文件字符输入流练习
 * @date 2023/3/21 19:41:59
 */
public class FileReader_ {
    public static void main(String[] args) {
        //read() 单个字符
        System.out.println("read() 单个字符");
        String path = "a:\\practice\\javase\\13_io\\write02.txt";
        FileReader fileReader = null;
        int read = 0;
        try {
            fileReader = new FileReader(path);
            while ((read = fileReader.read()) != -1) {
                System.out.print((char) read);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //read(char[] c) 字符数组
        System.out.println("read(char[] c) 字符数组");
        char[] cbuf = new char[8];
        int readLen = 0;
        try {
            fileReader = new FileReader(path);
            while ((readLen = fileReader.read(cbuf)) != -1) {
                System.out.print(new String(cbuf, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
