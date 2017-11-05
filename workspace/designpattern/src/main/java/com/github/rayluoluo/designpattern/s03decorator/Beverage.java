package com.github.rayluoluo.designpattern.s03decorator;

/**
 * @author luocanwei
 * @date 2017年11月5日
 * @Description: 饮料基类
 */
public abstract class Beverage {
	protected String description = "饮料";

	public String getDescription() {
		return description;
	}

	/**
	 * 抽象方法：计算饮料价格
	 * 
	 * @return 价格
	 */
	public abstract double cost();
}
