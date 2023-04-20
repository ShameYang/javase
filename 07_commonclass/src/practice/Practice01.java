package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 将字符串指定部分反转
 * @date 2023/3/6 19:46:16
 */
public class Practice01 {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println("翻转前: " + str);
        try {
            String newStr = reverse(str, 1, 4);
            System.out.println("翻转后: " + newStr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String reverse(String str, int start, int end) {
        if (!(str != null && start >= 0 && start < end && end < str.length())) {
            throw new RuntimeException("参数不正确");
        }
        char[] chars = str.toCharArray();
        char temp = ' '; // 交换辅助
        for (int i = start, j = end; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}
