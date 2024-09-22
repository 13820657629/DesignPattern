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
        String methodName = method.getName();
        if("performOperation".equals(methodName)){
            System.out.println("代理performOperation前的执行操作");
            Object result = method.invoke(target, args);
            System.out.println("代理performOperation后的执行操作");
            return result;
        }else if("anotherOperation".equals(methodName)){
            System.out.println("代理anotherOperation前的执行操作");
            Object result = method.invoke(target, args);
            System.out.println("代理anotherOperation后的执行操作");
            return result;
        }else{
            return method.invoke(target, args);
        }
    }
}
