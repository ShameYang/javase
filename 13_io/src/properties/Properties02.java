package properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 使用 Properties 类创建配置文件
 * @date 2023/3/22 16:53:11
 */
public class Properties02 {
    public static void main(String[] args) throws IOException {
        //使用 Properties 类创建配置文件 mysql02.properties

        Properties properties = new Properties();

        //创建
        properties.setProperty("user", "tom");
        properties.setProperty("user", "jack");
        properties.setProperty("pwd", "123456");
        properties.setProperty("ip", "中国");

        //将 k-v 存储
        properties.store(new FileOutputStream("src\\mysql02.properties"), null);
        System.out.println("配置文件保存成功");
    }
}
