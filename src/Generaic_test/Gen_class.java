package Generaic_test;

public class Gen_class<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    //含有泛型的方法
    public <E> void gen(E e){
        System.out.println(e);
    }
    //含有泛型的静态方法
    public static <E> void fun(E e){
        System.out.println(e);
    }
}
