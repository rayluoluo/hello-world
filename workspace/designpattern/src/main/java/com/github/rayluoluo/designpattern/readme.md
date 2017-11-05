# 策略模式（Strategy Pattern）
- 定义了算法簇，分别封装起来，让它们之间可以相互替换，此模式让算法的变化独立于使用算法的客户。

# 观察者模式（Observer Pattern）
- 定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会受到通知并自动更新。
	- 在Java中通过Observable类和Observer接口实现了内置的观察者模式
	- JDK中，其实JavaBeans和Swing中都实现了观察者模式，如JavaBeans的PropertyChangeListener类、Swing的JButton

# 装饰者模式（Decorator）
- 动态地将责任附加到对象上。若要扩展功能，装饰者提供了比继承更有弹性的替代方案。
	- 利用继承设计子类的行为，是在编译时静态决定的，而且所有的子类都会继承相同的行为；而如果利用组合(composition)和委托(delegation)的做法扩展对象的行为，就可以在运行时动态地进行扩展。
