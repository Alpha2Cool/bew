package Generaic_teat2;

public class main {
    public static void main(String[] args) {
        Generic_Interface_class_impl<String> gi = new Generic_Interface_class_impl<>();
        gi.Myinterface("hello world");

        Generic_Interface_class_impl<Double> gi1 = new Generic_Interface_class_impl<>();
        gi1.Myinterface(3.14);

        Generic_Interface_class_impl<Integer> gi2 = new Generic_Interface_class_impl<>();
        gi2.Myinterface(10);


        System.out.println(gi.hashCode());
    }
}
