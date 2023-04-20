package thread;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 演示继承 Thread 类创建线程
 * @date 2023/3/15 14:14:08
 */
@SuppressWarnings({"all"})
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        new Computer().start();
        new Computer().start();
        new Computer().start();

        //当主线程开启一个子线程时，主线程不会堵塞，会继续执行
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程" + Thread.currentThread().getName() + "i=" + i);
            Thread.sleep(1000);
        }
    }
}

class Computer extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("开启线程..." + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
