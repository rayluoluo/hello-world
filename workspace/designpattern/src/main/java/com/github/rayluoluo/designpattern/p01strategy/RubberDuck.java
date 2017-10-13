package com.github.rayluoluo.designpattern.p01strategy;

/**
 * @author luocanwei
 * @date 2017年10月12日
 * @Description: 橡皮鸭不会飞
 */
public class RubberDuck extends Duck {

	// 构造函数中确定算法策略
	public RubberDuck() {
		super();
		// 不会飞
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("我是橡皮鸭");
	}
}
