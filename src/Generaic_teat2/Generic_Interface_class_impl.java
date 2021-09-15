package Generaic_teat2;

public class Generic_Interface_class_impl<E> implements Generic_Interface_class_teat<E> {

    @Override
    public void Myinterface(E e) {
        System.out.println("参数为："+e);
    }
}
