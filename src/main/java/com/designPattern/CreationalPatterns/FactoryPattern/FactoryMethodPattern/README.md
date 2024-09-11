工厂方法模式（Factory Method）

结构说明:
1. 产品接口（Phone）：定义手机的基本行为。
2. 具体产品类（ApplePhone、SamsungPhone、XiaomiPhone）：实现 Phone 接口。
3. 抽象工厂接口（PhoneFactory）：定义创建 Phone 对象的工厂方法。
4. 具体工厂类（ApplePhoneFactory、SamsungPhoneFactory、XiaomiPhoneFactory）：实现 PhoneFactory 接口，创建具体的手机实例。
客户端（Main）：使用具体工厂类来创建手机对象。

优点： 遵循开闭原则，添加新的手机类型时只需新增一个具体工厂类，无需修改现有代码。

缺点： 类的数量增加，每个产品都需要一个对应的工厂类，可能导致系统复杂度上升。