package Polymorphism;

public class Zi extends Fu{
    int num = 10;

    @Override
    void method() {
        System.out.println("子类方法");
    }

    void methodZi(){
        System.out.println("子类特有方法");
    }
}
