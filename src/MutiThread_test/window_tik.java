package MutiThread_test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class window_tik implements Runnable {
    private int ticket = 100;

    Object obj = new Object();  //也可以是String obj = new String(); 任意写，都叫锁对象
    Lock l = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
//            synfun();
            l.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(10);  //sleep必须throw或try catch
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    l.unlock();
                }
            }
        }
    }

    //使用同步方法
//    public synchronized void synfun() {
//        if (ticket > 0) {
//            try {
//                Thread.sleep(10);  //sleep必须throw或try catch
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
//            ticket--;
//        }
//    }
}



