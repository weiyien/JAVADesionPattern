package singleton;

/**
 * @author: 魏薏恩
 * @date: 2019/4/4 11:11
 * @description: 双重锁单例模式
 * 效果不详,支持受限.不建议使用
 */
public class DoubleLockSingleton {
    private static DoubleLockSingleton doubleLockSingleton;

    private DoubleLockSingleton() {

    }

    public static DoubleLockSingleton getDoubleLockSingleton() {
        if (doubleLockSingleton == null) {
            DoubleLockSingleton dls;
            synchronized (DoubleLockSingleton.class) {
                dls = doubleLockSingleton;
                if (dls == null) {
                    synchronized (DoubleLockSingleton.class) {
                        if (dls == null) {
                            dls = new DoubleLockSingleton();
                        }
                    }
                    doubleLockSingleton = dls;
                }
            }
        }
        return doubleLockSingleton;
    }
}
