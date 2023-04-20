package copy;

import java.io.*;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO使用 BufferedInputStream 和 BufferedOutputStream 完成二进制文件拷贝
 * @date 2023/3/22 14:22:49
 */
public class BufferedCopy02 {
    public static void main(String[] args) throws IOException {
        String srcFilePath = "a:\\practice\\javase\\13_io\\bug.jpg";
        String destFilePath = "a:\\practice\\javase\\13_io\\bugcopy.jpg";

        //创建对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFilePath));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath));

        //循环读取文件
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = bis.read(buf)) != -1) {
            bos.write(buf, 0, readLen);
        }

        //关闭流
        bis.close();
        bos.close();
    }
}
