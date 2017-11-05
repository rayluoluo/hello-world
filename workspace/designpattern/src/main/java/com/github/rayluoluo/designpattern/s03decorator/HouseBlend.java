package com.github.rayluoluo.designpattern.s03decorator;

/**
 * @author luocanwei
 * @date 2017年11月5日
 * @Description: 第一种咖啡：首选咖啡
 */
public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House Blend Coffee(首选咖啡)";
	}

	@Override
	public double cost() {
		return 0.89;
	}

}
