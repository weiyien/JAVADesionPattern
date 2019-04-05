package singleton;

/**
 * @author: 魏薏恩
 * @date: 2019/4/4 11:39
 * @description: 枚举单例模式
 * 枚举本身就是单例,由jvm提供支持
 * 特点:线程安全,调用效率高,不能延时加载.天然防止反射和序列化漏洞
 * 使用范围:
 * 优点: 简单,jvm支持,避免反射和序列化漏洞
 * 缺点: 不能延时加载
 */
public enum EnumSingleton {
    MALE, FEMALE;

    EnumSingleton() {
    }

    public static EnumSingleton getInstance() {
        return MALE;
    }

}
