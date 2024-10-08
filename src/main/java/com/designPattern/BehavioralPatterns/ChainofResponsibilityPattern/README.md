责任链模式（Chain of Responsibility Pattern）是一种行为设计模式，它允许将请求的发送者和接收者解耦，形成一个处理请求的链。每个处理者可以选择处理请求或将其传递给链中的下一个处理者。

主要角色：
1. 抽象处理者（Handler）：定义处理请求的接口，并实现链中链接的功能。
2. 具体处理者（Concrete Handler）：实现处理请求的具体逻辑，并决定是否处理请求或将其传递给下一个处理者。
3. 客户端（Client）：向链中的处理者发送请求。

工作流程：
1. 客户端发送请求给链的第一个处理者。
2. 处理者检查是否可以处理该请求。
3. 如果可以处理，请求得到处理；如果不能，处理者将请求传递给链中的下一个处理者。
4. 这个过程持续，直到请求被处理或链的末尾被达到。

