package Polymorphism_interface;

public class Poly_interface {
    public static void main(String[] args) {
//        想调用接口就要先创建类对象
        interfaceimpl obj = new interfaceimpl();
//        调用接口的method方法
        obj.method();

//        也可以用多态实现尚书过程  接口 obj = new 对象()
        MyInterface obj1 = new interfaceimpl(); //多态的体现
        obj1.method();


//        使用匿名内部类实现上述
//        由于为了使用MyInterface中的method方法必须要创建一个类非常麻烦
//        因此省去interfaceimpl类的创建，而使用匿名内部类，只需要 接口 obj = new 接口(){方法重写};
        MyInterface obj2 = new MyInterface() {
            @Override //{}中的内容和因此省去interfaceimpl类中的完全一样
            public void method() {
                System.out.println("调用抽象方法");
            }
        };
        obj2.method();
    }
}
