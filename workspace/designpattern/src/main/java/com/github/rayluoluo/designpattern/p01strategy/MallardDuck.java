package com.github.rayluoluo.designpattern.p01strategy;

/**
 * @author luocanwei
 * @date 2017��10��12��
 * @Description: ҰѼ���
 */
public class MallardDuck extends Duck {

	// ���캯����ȷ���㷨����
	public MallardDuck() {
		super();
		// ���
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("����ҰѼ");
	}

}
