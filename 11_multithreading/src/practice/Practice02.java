package practice;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 多线程基础练习
 * @date 2023/3/17 12:29:01
 */
public class Practice02 {
    public static void main(String[] args) {
        /* (1)两个用户分别从用一张卡上取钱(总额:10000)
         * (2)每次取1000
         * (3)不能超取 -> 线程同步 */
        Account account = new Account();
        Thread t1 = new Thread(account);
        t1.setName("Account1");
        Thread t2 = new Thread(account);
        t2.setName("Account2");
        t1.start();
        t2.start();
    }
}

//涉及到多个多线程共享资源，所以实现 Runnable
class Account implements Runnable {
    private int money = 10000;

    @Override
    public void run() {
        while (true) {

            synchronized (this) {

                //判断余额是否足够
                if (money < 1000) {
                    System.out.println("余额不足...");
                    break;
                }

                money -= 1000;
                System.out.println(Thread.currentThread().getName() +
                        "取出了1000元, " + "余额: " + money);
            }
        }
    }
}

