/**
 * 
 */
package com.github.rayluoluo.designpattern.p01strategy;

/**
 * @author luocanwei
 * @date 2017年10月12日
 * @Description: TODO(用一句话描述该文件做什么)
 */
public abstract class Duck {

	FlyBehavior flyBehavior;

	public Duck() {
		display();
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public abstract void display();
}
