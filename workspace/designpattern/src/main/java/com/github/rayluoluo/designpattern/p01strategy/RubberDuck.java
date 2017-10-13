package com.github.rayluoluo.designpattern.p01strategy;

/**
 * @author luocanwei
 * @date 2017��10��12��
 * @Description: ��ƤѼ�����
 */
public class RubberDuck extends Duck {

	// ���캯����ȷ���㷨����
	public RubberDuck() {
		super();
		// �����
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("������ƤѼ");
	}
}
