/**
 * 
 */
package com.github.rayluoluo.designpattern.s03decorator;

/**
 * @author luocanwei
 * @date 2017年11月5日
 * @Description: 测试装饰者模式，买咖啡
 */
public class Test {
	public static void main(String[] args) {
		// 订一杯Espresso，不需要调料
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		// 订一杯HouseBlend，两倍摩卡，加奶
		Beverage beverage2 = new HouseBlend();
		beverage2 = new MochaCondiment(beverage2);
		beverage2 = new MochaCondiment(beverage2);
		beverage2 = new MilkCondiment(beverage2);
		System.out
				.println(beverage2.getDescription() + " $" + beverage2.cost());
	}
}
