/**
 * 
 */
package com.github.rayluoluo.designpattern.s03decorator;

import java.math.BigDecimal;

/**
 * @author luocanwei
 * @date 2017��11��5��
 * @Description: �ڶ������ϣ�Ħ��
 */
public class MochaCondiment extends CondimentDecorator {

	/**
	 * 
	 */
	public MochaCondiment(Beverage componet) {
		super(componet);
		description = componet.getDescription() + ", mocha(Ħ��)";
	}

	@Override
	public double cost() {
		return new BigDecimal("0.20").add(
				new BigDecimal(Double.toString(component.cost())))
				.doubleValue();
	}

}
