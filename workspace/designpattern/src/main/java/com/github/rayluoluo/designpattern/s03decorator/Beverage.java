package com.github.rayluoluo.designpattern.s03decorator;

/**
 * @author luocanwei
 * @date 2017��11��5��
 * @Description: ���ϻ���
 */
public abstract class Beverage {
	protected String description = "����";

	public String getDescription() {
		return description;
	}

	/**
	 * ���󷽷����������ϼ۸�
	 * 
	 * @return �۸�
	 */
	public abstract double cost();
}
