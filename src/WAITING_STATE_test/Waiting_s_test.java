package WAITING_STATE_test;

public class Waiting_s_test {

    public static void main(String[] args) {

        Object obj = new Object();
        new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("顾客1点餐");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("顾客1用餐");
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("老板做饭");
                    obj.notify();
                }
            }
        }.start();
    }
}
