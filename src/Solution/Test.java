package Solution;

class Num{
    private int count = 0;
    public void printcount(){
        System.out.println("count:"+this.count);
    }

    public void inc_count(){
        for(int i = 0; i<1000000; i++){
            count++;
        }
    }

    public void dec_count(){
        for(int i = 0; i<1000000; i++){
            count--;
        }
    }
}

class thread_inc implements Runnable{
    Num Dthread;
    thread_inc(Num Dthread){
        this.Dthread = Dthread;
    }
    @Override
    public void run() {
        Dthread.inc_count();
        Dthread.printcount();
    }
}

class thread_dec implements Runnable{
    Num Dthread;
    thread_dec(Num Dthread){
        this.Dthread = Dthread;
    }
    @Override
    public void run() {
        Dthread.dec_count();
        Dthread.printcount();
    }
}

public class Test {
    public static void main(String[] args){
        Num number = new Num();
        thread_inc Tinc = new thread_inc(number);
        thread_dec Tdec = new thread_dec(number);
        Thread T1 = new Thread(Tinc);
        Thread T2 = new Thread(Tdec);
        T1.start();
        T2.start();
        number.printcount();
        System.out.println("begin");
//        T1.join();
    }
}
