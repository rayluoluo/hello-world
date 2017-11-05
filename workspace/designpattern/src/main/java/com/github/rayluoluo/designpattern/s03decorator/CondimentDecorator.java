/**
 * 
 */
package com.github.rayluoluo.designpattern.s03decorator;

/**
 * @author luocanwei
 * @date 2017��11��5��
 * @Description: ��ζƷװ������ ����չ�������࣬�õ��˼̳С� ԭ����װ���߱�����ȡ����װ���ߣ�������һ�������ͣ�Ҳ�����й�ͬ�ĳ��ࣩ
 */
public abstract class CondimentDecorator extends Beverage {
	protected Beverage component;

	/**
	 * �õ�ζƷ��װ��װ����Beverage
	 * 
	 * @param component
	 */
	public CondimentDecorator(Beverage component) {
		this.component = component;
	}
}
