package copy;

import java.io.*;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 使用 BufferedReader 和 BufferedWriter 完成文件拷贝
 * @date 2023/3/22 14:04:37
 */
@SuppressWarnings({"all"})
public class BufferedCopy {
    public static void main(String[] args) throws Exception {
        String line;
        String srcFilePath = "a:\\practice\\javase\\13_io\\bw.txt"; //源路径
        String destFilePath = "a:\\practice\\javase\\13_io\\bwcopy.txt"; //目标路径
        BufferedReader br = new BufferedReader(new FileReader(srcFilePath));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destFilePath));
        //边读边写
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }
        //关闭流
        br.close();
        bw.close();
    }
}
