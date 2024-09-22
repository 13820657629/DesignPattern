package com.designPattern.StructuralPatterns.ProxyPattern.StaticProxyPattern;

//代理对象
public class ServiceProxy implements Service{
    private RealService realService;

    public ServiceProxy(RealService realService) {
        this.realService = realService;
    }

    @Override
    public void performOperation() {
        System.out.println("代理开始");
        realService.performOperation();
        System.out.println("代理结束");
    }
}
