package ThreadPool_test;

public class Thread_t implements Runnable{
    @Override
    public void run() {
        System.out.println("线程执行");
    }
}
