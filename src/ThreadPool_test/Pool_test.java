package ThreadPool_test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pool_test {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2); //线程池中有2个线程
        es.submit(new Thread_t()); //不需要start直接执行run方法
        es.submit(new Thread_t()); //不需要start直接执行run方法
        es.shutdown(); //关闭线程池
    }
}
