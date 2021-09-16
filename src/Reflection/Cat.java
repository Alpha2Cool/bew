package Reflection;

public class Cat {
    private String name = "hello world";
    public int age = 10;

    public Cat() {}
    public Cat(String name) {
        this.name = name;
    }

    public void hi() {
        System.out.println("hi "+name);
    }
    public void bye() {
        System.out.println("bye "+name);
    }
}
