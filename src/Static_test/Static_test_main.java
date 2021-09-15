package Static_test;

public class Static_test_main {
    public static void main(String[] args) {
        //静态成员、静态方法
        Myclass.setTotel(40); //total为静态成员，一般需要先设置，注意这里时用类名来访问成员方法的
        Myclass one = new Myclass(1,123);
        System.out.println("ID:"+one.getId());
        System.out.println("pwd:"+one.getPwd());
        System.out.println("totel:"+ Myclass.getTotel()); //注意这里时用类名来访问成员方法的
        //静态代码块
        StaticCodeblock s1 = new StaticCodeblock();
        StaticCodeblock s2 = new StaticCodeblock();
    }
}
