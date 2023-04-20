package writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO BufferedWriter 练习
 * @date 2023/3/22 13:54:19
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        //文件路径
        String filePath = "a:\\practice\\javase\\13_io\\bw.txt";
        //创建 BufferedWriter 对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        //写入
        bufferedWriter.write("你好01");
        bufferedWriter.newLine();
        bufferedWriter.write("你好02");
        bufferedWriter.newLine();
        bufferedWriter.write("你好03");

        //关闭外层流 BufferedWriter
        bufferedWriter.close();
    }
}
