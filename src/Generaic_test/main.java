package Generaic_test;

public class main {
    public static void main(String[] args) {
        Gen_class<String> stringGen_class = new Gen_class<>();
        stringGen_class.setName("hello");
        String name = stringGen_class.getName();
        System.out.println(name);
        System.out.println("=============");
        stringGen_class.gen(1);
        stringGen_class.gen("world");
        stringGen_class.fun(2);
        Gen_class.fun("Haha");
    }
}
