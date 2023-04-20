package properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 使用 Properties 读取文件
 * @date 2023/3/22 16:43:37
 */
public class Properties01 {
    public static void main(String[] args) throws IOException {
        //使用 Properties 类读取 mysql.properties 文件

        //1. 创建 Properties 对象
        Properties properties = new Properties();
        //2. 加载指定配置文件信息
        properties.load(new FileReader("src\\mysql.properties"));
        //3. 控制台显示 k-v
        properties.list(System.out);
        //4. 根据指定 key 获取对应值
        String name = properties.getProperty("user");
        System.out.println("用户名 : " + name);
    }
}
