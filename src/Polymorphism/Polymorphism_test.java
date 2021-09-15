package Polymorphism;
/*
* 多态的概念
父类 obj = new 子类()
接口 obj = new 子类()*/
public class Polymorphism_test {
    /*
    * 注意
    * 成员变量，编译看左边，运行看左边
    * 成员函数，编译看左边，运行看右边*/
    public static void main(String[] args) {
        Fu obj = new Zi();  //体现出了多态
        System.out.println(obj.num); //注意这里obj.num输出的时父类的num

        obj.method(); //注意这里由于子类覆写(重写)了父类的method方法，因此调用的是子类的方法(也就是成员函数运行看右边)
        obj.methodFu(); //子类没有methonFu方法，因此调用父类的methonFu方法
        //obj.methodZi(); //注意这是错误写法，因为编译时看Fu obj = new Zi();的左边，左边时Fu，Fu中没有methodZi方法
    }
}
