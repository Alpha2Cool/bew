package Reflection.factor;

import Reflection.Cat;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectorTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        // 建立Properties对象
        Properties properties = new Properties();
        // 加载指定配置文件
        properties.load(new FileInputStream("src\\Reflection\\re.properties"));
        // 获取指定的类路径和类方法
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();

        System.out.println(classfullpath);
        System.out.println(method);

        // 用类路径创建类对象 【java.lang.Class类】
        Class aClass = Class.forName(classfullpath); // 获取对象类
        Object o = aClass.newInstance(); // 获取到对象的实例

        System.out.println("o class: "+o.getClass());

        // 调用指定类方法  【java.lang.reflect.Method类】
        Method method1 = aClass.getMethod(method);  // 获取类方法
        method1.invoke(o); // 实现调用

        // 调用成员变量  【java.lang.reflect.Field类】
        Field age = aClass.getField("age");  // 只能获取公有成员
        System.out.println(age.get(o));

        // 调用构造函数  【java.lang.reflect.Constructor类】
        Constructor constructor = aClass.getConstructor();  // 调用无参构造函数
        System.out.println(constructor);
        Cat ob = (Cat)constructor.newInstance();
        ob.hi();

        Constructor constructor1 = aClass.getConstructor(String.class);  // 调用有参构造函数，String.class为Class类的类对象
        System.out.println(constructor1);
        Cat ob1 = (Cat)constructor1.newInstance("hhh");
        ob1.hi();

        // Method类、Field类、Constructor类会继承AccessibleObject类
        // 如method1.setAccessible(true);  //用于关闭控制访问检测，可加快
        // method1.invoke(o); 的访问速度，但是提升有限

    }
}
