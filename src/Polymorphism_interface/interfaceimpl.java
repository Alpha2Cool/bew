package Polymorphism_interface;

public class interfaceimpl implements MyInterface {
    @Override
    public void method() { //必须重写抽象方法
        System.out.println("调用抽象方法");
    }
}