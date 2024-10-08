建造者模式（Builder Pattern）是一种设计模式，它用于将复杂对象的构建过程与其表示分离，使得同样的构建过程可以创建不同的表示。建造者模式通常用于构建那些需要多个步骤来进行初始化的对象，同时避免了构造函数参数过多的情况。

使用场景
当一个类的构造函数参数过多，并且部分参数是可选的。
需要确保对象的不可变性，确保对象一旦构建完成后就不会修改。
对象的构建过程比较复杂，需要分步骤进行。

结构
Builder（抽象建造者）：定义了构建对象的各个步骤。

ConcreteBuilder（具体建造者）：实现了 Builder 的各个步骤，并返回产品。

Director（指挥者）：负责按顺序调用 Builder 的各个构造步骤。

Product（产品）：最终要创建的对象。