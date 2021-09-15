package Lambda_test;

public class Lambdatest1 {
    public static void main(String[] args) {
        cookimpl(new Cook() {
            @Override
            public void makefood() {
                System.out.println("makefood");
            }
        });
        System.out.println("==============");
        cookimpl(()->{
            System.out.println("makefood");
        });
        System.out.println("==============");
        cookimpl(()-> System.out.println("makefood"));
    }
    public static void cookimpl(Cook cook){
        cook.makefood();
    }
}
