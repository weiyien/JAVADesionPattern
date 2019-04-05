package singleton;

/**
 * @author: 魏薏恩
 * @date: 2019/4/4 10:52
 * @description: 饿汉式单例
 * <p>
 * 在类处理化时就new好对象,调用get方法时直接返回.
 * 特点: 线程安全,调用效率高,不能延时加载
 * 使用范围: 适合在单例对象占用资源较小,调用并发要求高时使用.
 * 优点: 并发支持好
 * 缺点: 资源占用高
 */
public class HungryGuySingleton {
    private static HungryGuySingleton hungryGuySingleton = new HungryGuySingleton();

    private HungryGuySingleton() {

    }

    public static HungryGuySingleton getHungryGuySingleton() {
        return hungryGuySingleton;
    }

}
