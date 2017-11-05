package com.github.rayluoluo.designpattern.s03decorator;

/**
 * @author luocanwei
 * @date 2017��11��5��
 * @Description: ��һ�ֿ��ȣ���ѡ����
 */
public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House Blend Coffee(��ѡ����)";
	}

	@Override
	public double cost() {
		return 0.89;
	}

}
