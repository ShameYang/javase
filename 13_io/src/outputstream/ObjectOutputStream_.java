package outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 使用 ObjectOutputStream 完成数据的序列化
 * @date 2023/3/22 15:05:12
 */
public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException {
        String filePath = "a:\\practice\\javase\\13_io\\data.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        //Integer 实现了 Serializable 接口
        oos.writeInt(100);
        System.out.println("序列化保存数据~");

        //关闭流
        oos.close();
    }
}
