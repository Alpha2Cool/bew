package Static_test;
/*
静态关键字static用法
1. static声明的成员变量与对象无关，至于类有关
2. static声明的静态方法，可以通过对象来调用也可以通过类名称来调用
3. 静态方法不能访问非静态成员
 */
public class Myclass {
    private int id;
    private int pwd;
    private static int totel;

    public Myclass(){};

    public Myclass(int id, int pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    public static int getTotel() {   //静态方法来访问静态成员
        return totel;
    }

    public static void setTotel(int totel) {  //静态方法来访问静态成员
        Myclass.totel = totel;
    }

    public static void metho_static(){
        System.out.println("这是一个静态方法");
    }
}
