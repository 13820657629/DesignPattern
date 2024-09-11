package com.designPattern.CreationalPatterns.SingletionPattern.EagerInitialization;


/**
 * 饿汉式单例模式：在类加载的时候就会创建单例实例，线程安全
 *
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    //私有构造函数，防止外部实例化
    private EagerSingleton(){

    }

    //提供一个全局访问函数
    public static EagerSingleton getInstance(){
        return instance;
    }
}
