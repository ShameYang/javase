package runnable;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 演示实现 Runnable 接口创建线程
 * @date 2023/3/15 16:30:47
 */
public class RunnableDemo {
    public static void main(String[] args) throws InterruptedException {
        Run run = new Run();
        Thread thread = new Thread(run);
        thread.start();
        Thread.sleep(1000);
    }
}

class Run implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("Run线程" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
