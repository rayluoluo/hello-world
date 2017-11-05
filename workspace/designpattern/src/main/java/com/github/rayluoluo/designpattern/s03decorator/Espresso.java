package com.github.rayluoluo.designpattern.s03decorator;

/**
 * @author luocanwei
 * @date 2017��11��5��
 * @Description: �ڶ��ֿ��ȣ�Ũ������
 */
public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso(Ũ������)";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
