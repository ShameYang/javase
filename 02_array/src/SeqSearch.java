import java.util.Scanner;
/**
 * @author ShameYang
 * @version 1.0
 * @description TODO顺序查找
 * @date 2023/2/27 18:02:37
 */

public class SeqSearch {
    public static void main(String[] args) {
        // 定义一个字符串数组
        String[] names = {"老二","老六","老八"};
        Scanner sc = new Scanner(System.in);

        // 输入名字
        System.out.println("请输入名字");
        String findName = sc.next();

        // 遍历数组，逐一比较
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            // equals 字符串比较
            if(findName.equals(names[i])) {
                System.out.println("恭喜你找到" + findName);
                System.out.println("下标 = " + i);
                break;
            } else {
                System.out.println("没找到");
            }
        }
    }
}
