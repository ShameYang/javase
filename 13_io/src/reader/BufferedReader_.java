package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO BufferedReader 练习
 * @date 2023/3/22 13:49:49
 */
public class BufferedReader_ {
    public static void main(String[] args) throws Exception {
        //文件路径
        String filePath = "a:\\practice\\javase\\13_io\\write02.txt";
        //创建 BufferedReader 对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //按行读取
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
