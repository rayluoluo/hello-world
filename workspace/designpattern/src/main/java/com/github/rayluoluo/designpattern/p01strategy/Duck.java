/**
 * 
 */
package com.github.rayluoluo.designpattern.p01strategy;

/**
 * @author luocanwei
 * @date 2017��10��12��
 * @Description: TODO(��һ�仰�������ļ���ʲô)
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
