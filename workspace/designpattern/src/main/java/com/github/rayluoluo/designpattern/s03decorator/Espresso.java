package com.github.rayluoluo.designpattern.s03decorator;

/**
 * @author luocanwei
 * @date 2017年11月5日
 * @Description: 第二种咖啡：浓缩咖啡
 */
public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso(浓缩咖啡)";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
