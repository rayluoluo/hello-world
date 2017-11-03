# 策略模式(Strategy Pattern)
- 定义了算法簇，分别封装起来，让它们之间可以相互替换，此模式让算法的变化独立于使用算法的客户。

# 观察者模式（Observer Pattern）
- 定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会受到通知并自动更新。
	- 在Java中通过Observable类和Observer接口实现了内置的观察者模式
	- JDK中，其实JavaBeans和Swing中都实现了观察者模式，如JavaBeans的PropertyChangeListener类、Swing的JButton