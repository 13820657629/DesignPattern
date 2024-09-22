package com.designPattern.StructuralPatterns.ProxyPattern.StaticProxyPattern;

//目标对象
public class RealService implements Service{
    @Override
    public void performOperation() {
        System.out.println("执行实际的操作");
    }
}
