package Static_test;
/*
静态代码块只会执行一次
 */
public class StaticCodeblock {
    static {
        System.out.println("静态代码块");
    }
    StaticCodeblock(){
        System.out.println("创建对象");
    };

}
