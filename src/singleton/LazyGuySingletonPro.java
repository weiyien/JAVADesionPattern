package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author: 魏薏恩
 * @date: 2019/4/4 10:57
 * @description: 饿汉式单例-开启防反射,反序列化
 * <p>
 * 在调用获取单例对象时进行new操作,延时加载减少资源占用,获取对象方法需要锁机制同步执行,并发调用效率低
 * 特点: 线程安全,调用效率低,可以延时加载
 * 适用范围: 并发调用量平缓,单例对象占用资源大
 * 优点: 线程安全,延时加载
 * 缺点: 调用效率低,并发效率低
 */
public class LazyGuySingletonPro implements Serializable {
    private static LazyGuySingletonPro lazyGuySingleton;

    private LazyGuySingletonPro() {
        //防止反射破解单例
        if (lazyGuySingleton != null) {
            throw new RuntimeException();
        }
    }

    public static synchronized LazyGuySingletonPro getLazyGuySingleton() {
        if (lazyGuySingleton == null) {
            lazyGuySingleton = new LazyGuySingletonPro();
        }
        return lazyGuySingleton;
    }

    /**
     * 反序列化时,如果定义了readResolve()直接调用此方法返回对象,不新建对象
     */
    private Object readResolve() throws ObjectStreamException {
        return lazyGuySingleton;
    }
}
