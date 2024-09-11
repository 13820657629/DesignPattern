package com.designPattern.CreationalPatterns.SingletionPattern.LazyInitialization;


/**
 * 线程安全的懒汉式单例模式，使用双重检查
 */
public class LazySingleton {
    //加volatile防止指令重排
    private static volatile LazySingleton instance;

    private LazySingleton(){

    }

    private static LazySingleton getInstance(){
        if(instance == null){
            synchronized (LazySingleton.class){
                if(instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
