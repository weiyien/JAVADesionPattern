package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author: 魏薏恩
 * @date: 2019/4/5 09:55
 * @description: 通过反射和反序列化的方式破解单例模式(除枚举单例)
 */
public class ReflectAndDeserialization {
    public static void main(String[] args) throws Exception {
        testLazyGuySingleton();
        testLazyGuySingletonPro();
    }

    public static void testLazyGuySingleton() throws Exception {
        System.out.println("==============test common");
        LazyGuySingleton lazyGuySingleton1 = LazyGuySingleton.getLazyGuySingleton();
        LazyGuySingleton lazyGuySingleton2 = LazyGuySingleton.getLazyGuySingleton();
        System.out.println(lazyGuySingleton1 == lazyGuySingleton2);
        // 通过反射的方式直接调用私有构造器
        Class<LazyGuySingleton> clazz = (Class<LazyGuySingleton>) Class.forName("singleton.LazyGuySingleton");
        Constructor<LazyGuySingleton> constructor = clazz.getDeclaredConstructor(null);
        // 跳过私有声明检查
        constructor.setAccessible(true);
        LazyGuySingleton lazyGuySingleton3 = constructor.newInstance();
        LazyGuySingleton lazyGuySingleton4 = constructor.newInstance();
        System.out.println(lazyGuySingleton3 == lazyGuySingleton4);
        // 通过反序列化方式后遭多个对象
        FileOutputStream fileOutputStream = new FileOutputStream("a.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(lazyGuySingleton1);
        objectOutputStream.close();
        fileOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("a.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        LazyGuySingleton lazyGuySingleton5 = (LazyGuySingleton) objectInputStream.readObject();
        System.out.println(lazyGuySingleton1 == lazyGuySingleton5);
    }

    public static void testLazyGuySingletonPro() throws Exception {
        System.out.println("==============test pro");
        LazyGuySingletonPro lazyGuySingleton1 = LazyGuySingletonPro.getLazyGuySingleton();
        LazyGuySingletonPro lazyGuySingleton2 = LazyGuySingletonPro.getLazyGuySingleton();
        System.out.println(lazyGuySingleton1 == lazyGuySingleton2);
        // 通过反射的方式直接调用私有构造器
        Class<LazyGuySingletonPro> clazz = (Class<LazyGuySingletonPro>) Class.forName("singleton.LazyGuySingletonPro");
        Constructor<LazyGuySingletonPro> constructor = clazz.getDeclaredConstructor(null);
        // 跳过私有声明检查
        constructor.setAccessible(true);
        LazyGuySingletonPro lazyGuySingleton3 = constructor.newInstance();
        LazyGuySingletonPro lazyGuySingleton4 = constructor.newInstance();
        System.out.println(lazyGuySingleton3 == lazyGuySingleton4);
        // 通过反序列化方式后遭多个对象
        FileOutputStream fileOutputStream = new FileOutputStream("b.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(lazyGuySingleton1);
        objectOutputStream.close();
        fileOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("b.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        LazyGuySingletonPro lazyGuySingleton5 = (LazyGuySingletonPro) objectInputStream.readObject();
        System.out.println(lazyGuySingleton1 == lazyGuySingleton5);
    }
}
