package com.github.rayluoluo.designpattern.s03decorator;

import java.math.BigDecimal;

/**
 * @author luocanwei
 * @date 2017年11月5日
 * @Description: 第一种配料：牛奶
 */
public class MilkCondiment extends CondimentDecorator {

	public MilkCondiment(Beverage component) {
		super(component);
		description = component.getDescription() + ", milk(牛奶)";
	}

	@Override
	public double cost() {
		// 添加牛奶的价格
		return new BigDecimal("0.10").add(
				new BigDecimal(Double.toString(component.cost())))
				.doubleValue();
	}

}
