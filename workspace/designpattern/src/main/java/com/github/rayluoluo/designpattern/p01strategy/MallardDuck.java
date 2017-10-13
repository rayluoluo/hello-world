package com.github.rayluoluo.designpattern.p01strategy;

/**
 * @author luocanwei
 * @date 2017年10月12日
 * @Description: 野鸭会飞
 */
public class MallardDuck extends Duck {

	// 构造函数中确定算法策略
	public MallardDuck() {
		super();
		// 会飞
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("我是野鸭");
	}

}
