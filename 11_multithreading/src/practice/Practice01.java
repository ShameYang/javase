package practice;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 多线程基础练习
 * @date 2023/3/17 12:01:58
 */
public class Practice01 {
    /* （1）在 main 方法中启动两个线程
     * （2）第一个线程循环随机打印100以内整数
     * （3）直到第二个线程从键盘读取了 "Q" 命令 */
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2(task1);
        new Thread(task1).start();
        new Thread(task2).start();
    }
}

@SuppressWarnings({"all"})
class Task1 implements Runnable {
    private boolean loop = true;

    @Override
    public void run() {
        //循环随即打印 0-100 整数
        while (loop) {
            System.out.println((int) (Math.random() * 101));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

@SuppressWarnings({"all"})
class Task2 implements Runnable {
    private Task1 task1;
    private Scanner scanner = new Scanner(System.in);

    public Task2(Task1 task1) {
        this.task1 = task1;
    }

    @Override
    public void run() {
        //接收用户输入
        while (true) {
            System.out.println("请输入你的指令(Q)表示退出");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                task1.setLoop(false);
                break;
            }
        }
    }
}
