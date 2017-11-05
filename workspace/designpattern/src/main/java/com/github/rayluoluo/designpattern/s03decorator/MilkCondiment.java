package com.github.rayluoluo.designpattern.s03decorator;

import java.math.BigDecimal;

/**
 * @author luocanwei
 * @date 2017��11��5��
 * @Description: ��һ�����ϣ�ţ��
 */
public class MilkCondiment extends CondimentDecorator {

	public MilkCondiment(Beverage component) {
		super(component);
		description = component.getDescription() + ", milk(ţ��)";
	}

	@Override
	public double cost() {
		// ���ţ�̵ļ۸�
		return new BigDecimal("0.10").add(
				new BigDecimal(Double.toString(component.cost())))
				.doubleValue();
	}

}
