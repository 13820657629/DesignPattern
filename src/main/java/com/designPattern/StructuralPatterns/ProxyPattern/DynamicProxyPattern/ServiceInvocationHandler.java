package com.designPattern.StructuralPatterns.ProxyPattern.DynamicProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//动态代理处理器
public class ServiceInvocationHandler implements InvocationHandler{
    private Object target;

    public ServiceInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理开始");
        Object result = method.invoke(target, args);
        System.out.println("代理结束");
        return result;
    }
}
