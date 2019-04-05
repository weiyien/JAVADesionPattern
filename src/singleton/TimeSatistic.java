package singleton;

import java.util.concurrent.CountDownLatch;

/**
 * @author: 魏薏恩
 * @date: 2019/4/5 11:58
 * @description: 效率比较
 */
public class TimeSatistic {
    private static final int RUNTIME = 1000000;

    public static void main(String[] args) throws InterruptedException {
        testDoubleLockSingleton();
        testEnumSingleton();
        testHungryGuySingleton();
        testLazyGuySingleton();
        testStaticInnerClassSingleton();
    }

    public static void testHungryGuySingleton() throws InterruptedException {
        System.out.println("HungryGuySingleton");
        long startTime = System.currentTimeMillis();
        int threadNum = 10;
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < threadNum; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < RUNTIME; j++) {
                        Object object = HungryGuySingleton.getHungryGuySingleton();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        long endTime = System.currentTimeMillis();
        System.out.println("time:" + (endTime - startTime) + "ms");
    }

    public static void testLazyGuySingleton() throws InterruptedException {
        System.out.println("LazyGuySingleton");
        long startTime = System.currentTimeMillis();
        int threadNum = 10;
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < threadNum; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < RUNTIME; j++) {
                        Object object = LazyGuySingleton.getLazyGuySingleton();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        long endTime = System.currentTimeMillis();
        System.out.println("time:" + (endTime - startTime) + "ms");
    }

    public static void testDoubleLockSingleton() throws InterruptedException {
        System.out.println("DoubleLockSingleton");
        long startTime = System.currentTimeMillis();
        int threadNum = 10;
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < threadNum; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < RUNTIME; j++) {
                        Object object = DoubleLockSingleton.getDoubleLockSingleton();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        long endTime = System.currentTimeMillis();
        System.out.println("time:" + (endTime - startTime) + "ms");
    }

    public static void testEnumSingleton() throws InterruptedException {
        System.out.println("EnumSingleton");
        long startTime = System.currentTimeMillis();
        int threadNum = 10;
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < threadNum; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < RUNTIME; j++) {
                        Object object = EnumSingleton.getInstance();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        long endTime = System.currentTimeMillis();
        System.out.println("time:" + (endTime - startTime) + "ms");
    }

    public static void testStaticInnerClassSingleton() throws InterruptedException {
        System.out.println("StaticInnerClassSingleton");
        long startTime = System.currentTimeMillis();
        int threadNum = 10;
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < threadNum; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < RUNTIME; j++) {
                        Object object = StaticInnerClassSingleton.getStaticInnerClassSingleton();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        long endTime = System.currentTimeMillis();
        System.out.println("time:" + (endTime - startTime) + "ms");
    }
}
