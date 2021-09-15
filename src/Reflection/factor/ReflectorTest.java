package Reflection.factor;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectorTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        // 建立Properties对象
        Properties properties = new Properties();
        // 加载指定配置文件
        properties.load(new FileInputStream("src\\Reflection\\re.properties"));
        // 获取指定的类路径和类方法
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();

        System.out.println(classfullpath);
        System.out.println(method);

        // 用类路径创建类对象
        Class aClass = Class.forName(classfullpath); // 获取对象类
        Object o = aClass.newInstance(); // 获取到对象的实例

        System.out.println("o class: "+o.getClass());

        // 调用指定类方法
        Method method1 = aClass.getMethod(method);  // 获取类方法
        method1.invoke(o); // 实现调用

    }
}
