package Lambda_test;

public class main {
    public static void main(String[] args) {
        //实现多线程
        //用匿名内部类快速创建
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"创建线程");
            }
        }).start();

        //使用Lambda表达式
        new Thread(()->{    // ()->{} 将()中的内容传入{}
            System.out.println(Thread.currentThread().getName()+"创建线程");
        }).start();
    }
}
