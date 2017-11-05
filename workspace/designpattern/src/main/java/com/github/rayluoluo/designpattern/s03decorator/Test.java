/**
 * 
 */
package com.github.rayluoluo.designpattern.s03decorator;

/**
 * @author luocanwei
 * @date 2017��11��5��
 * @Description: ����װ����ģʽ���򿧷�
 */
public class Test {
	public static void main(String[] args) {
		// ��һ��Espresso������Ҫ����
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		// ��һ��HouseBlend������Ħ��������
		Beverage beverage2 = new HouseBlend();
		beverage2 = new MochaCondiment(beverage2);
		beverage2 = new MochaCondiment(beverage2);
		beverage2 = new MilkCondiment(beverage2);
		System.out
				.println(beverage2.getDescription() + " $" + beverage2.cost());
	}
}
