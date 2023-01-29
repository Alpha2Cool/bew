package clasloaderProj;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class testDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        ClassloaderT classloaderT = new ClassloaderT();
        String classpath = "C:\\Users\\XiaoMI\\Desktop\\Person.class";
//        System.out.println(classpath.substring(classpath.lastIndexOf("\\") + 1,
//                classpath.lastIndexOf(".")));
        Class<?> classimp = classloaderT.findClass(classpath);

        System.out.println(classimp.getClassLoader());
        System.out.println(classimp.getClassLoader().getParent());
        System.out.println(classimp.getClassLoader().getParent().getParent());
        System.out.println(classimp.getClassLoader().getParent().getParent().getParent());

        Object instance = classimp.getDeclaredConstructor(String.class).newInstance("hello");
        Method MgetName = classimp.getMethod("getName");
        System.out.println(MgetName.invoke(instance));;

    }
}
