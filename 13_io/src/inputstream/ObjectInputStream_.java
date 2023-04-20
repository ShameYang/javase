package inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 使用 ObjectInputStream 完成反序列化
 * @date 2023/3/22 15:15:05
 */
public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException {
        String filePath = "a:\\practice\\javase\\13_io\\data.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        //读取
        System.out.println(ois.readInt());

        //关闭流
        ois.close();
    }
}
