package com.designPattern.StructuralPatterns.ProxyPattern.DynamicProxyPattern;

import java.lang.reflect.Proxy;

public class test {
    public static void main(String[] args) {
        RealService realService = new RealService();
        Service proxyInstance = (Service) Proxy.newProxyInstance(
                realService.getClass().getClassLoader(),
                realService.getClass().getInterfaces(),
                new ServiceInvocationHandler(realService)
        );
        proxyInstance.performOperation();
        System.out.println("----------------------------");
        proxyInstance.anotherOperation();
    }
}
