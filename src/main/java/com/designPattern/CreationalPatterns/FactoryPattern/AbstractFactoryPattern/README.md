抽象工厂模式（Abstract Factory）

抽象工厂模式是工厂方法模式的扩展版本，它不再是创建单一类型的西乡，而是创建一系列相关联的对象，抽象工厂模式包含多个抽象产品类

结构说明

1. 产品接口：
   (1)Phone
   (2)Battery
   (3)Screen
2. 具体产品类：
   (1)ApplePhone, AppleBattery, AppleScreen
   (2)SamsungPhone, SamsungBattery, SamsungScreen
   (3)XiaomiPhone, XiaomiBattery, XiaomiScreen
3. 抽象工厂接口（DeviceFactory）：定义创建一系列相关对象的接口。
4. 具体工厂类（AppleFactory、SamsungFactory、XiaomiFactory）：实现 DeviceFactory 接口，创建具体的产品对象。
5. 客户端（Main）：使用具体工厂类来创建相关的产品对象。

优点： 确保了一系列相关的对象一起被创建和使用，符合“单一职责原则”。
易于扩展新的产品族（如增加新的手机品牌），无需修改现有代码。

缺点： 系统中产品种类较多时，会有大量的工厂类，增加系统的复杂性。