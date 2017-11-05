/**
 * 
 */
package com.github.rayluoluo.designpattern.s03decorator;

/**
 * @author luocanwei
 * @date 2017年11月5日
 * @Description: 调味品装饰者类 （扩展自饮料类，用到了继承。 原因是装饰者必须能取代被装饰者，必须是一样的类型，也就是有共同的超类）
 */
public abstract class CondimentDecorator extends Beverage {
	protected Beverage component;

	/**
	 * 用调味品包装被装饰者Beverage
	 * 
	 * @param component
	 */
	public CondimentDecorator(Beverage component) {
		this.component = component;
	}
}
