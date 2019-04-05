package singleton;

/**
 * @author: 魏薏恩
 * @date: 2019/4/4 11:20
 * @description: 静态内部类单例模式
 * 通过静态内部类实现线程安全和延迟加载.
 * 特点: 具备懒汉\饿汉两种单例模式的优点
 * 适用范围:
 * 优点: 线程安全,调用效率高,资源占用低
 * 缺点:
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
        // System.out.println("step 3 StaticInnerClassSingleton");
    }

    private static class StaticInnerClassSingletonInnerClass {
        static {
            // System.out.println("step 2 staticInnerClassSingleton");
        }

        private static final StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getStaticInnerClassSingleton() {
        // System.out.println("step 1 getStaticInnerClassSingleton");
        return StaticInnerClassSingletonInnerClass.staticInnerClassSingleton;
    }

    public static void main(String[] args) {
        StaticInnerClassSingleton.getStaticInnerClassSingleton();
        StaticInnerClassSingleton.getStaticInnerClassSingleton();
    }
}
