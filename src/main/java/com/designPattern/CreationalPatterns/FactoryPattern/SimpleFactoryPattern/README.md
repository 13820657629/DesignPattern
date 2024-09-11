简单工厂模式（Simple Factory）
   结构说明:
   1. 产品接口（Phone）：定义手机的基本行为。
   2. 具体产品类（ApplePhone、SamsungPhone、XiaomiPhone）：实现 Phone 接口。
   3. 工厂类（PhoneFactory）：根据输入参数创建具体的手机实例。
   4. 客户端（Main）：使用工厂类来创建手机对象。
      
优点： 简化了对象的创建，客户端不需要了解具体类的创建细节。

缺点： 当需要添加新的手机类型时，必须修改 PhoneFactory 类，违反了开闭原则。