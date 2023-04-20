package practice;

import java.util.Scanner;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 注册处理题
 * @date 2023/3/6 20:14:36
 */
public class Practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("用户名: ");
            String name = sc.next();
            System.out.println("密码: ");
            String password = sc.next();
            System.out.println("邮箱: ");
            String email = sc.next();
            userRegister(name, password, email);
            System.out.println("恭喜你~注册成功！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void userRegister(String name, String password, String email) {
        //用户名校验
        int nameLen = name.length();
        if (!(nameLen >= 2 && nameLen <= 4)) {
            throw new RuntimeException("用户名需2-4位!");
        }

        //密码校验
        int passwordLen = password.length();
        if (!(passwordLen == 6 && isDigital(password))) {
            throw new RuntimeException("密码应为6位数字");
        }

        //邮箱校验
        int emailLen = email.length();
        int i = email.indexOf("@");
        int j = email.indexOf(".");
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱格式不正确");
        }
    }

    //判断字符串是否全为数字
    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(chars[i])) {
                return false;
            }
        }
        return true;
    }
}
