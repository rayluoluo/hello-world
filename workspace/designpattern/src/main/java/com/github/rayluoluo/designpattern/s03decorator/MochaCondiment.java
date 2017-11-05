/**
 * 
 */
package com.github.rayluoluo.designpattern.s03decorator;

import java.math.BigDecimal;

/**
 * @author luocanwei
 * @date 2017年11月5日
 * @Description: 第二种配料：摩卡
 */
public class MochaCondiment extends CondimentDecorator {

	/**
	 * 
	 */
	public MochaCondiment(Beverage componet) {
		super(componet);
		description = componet.getDescription() + ", mocha(摩卡)";
	}

	@Override
	public double cost() {
		return new BigDecimal("0.20").add(
				new BigDecimal(Double.toString(component.cost())))
				.doubleValue();
	}

}
