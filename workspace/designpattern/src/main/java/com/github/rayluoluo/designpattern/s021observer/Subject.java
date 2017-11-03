/**
 * 
 */
package com.github.rayluoluo.designpattern.s021observer;

/**
 * @author luocanwei
 * @date 2017��11��2��
 * @Description:�ɹ۲���
 */
public interface Subject {
	/**
	 * ע�ᶩ��
	 * 
	 * @param observer
	 */
	public void registerObserver(Observer observer);

	/**
	 * ȡ������
	 * 
	 * @param observer
	 */
	public void removeObserver(Observer observer);

	/**
	 * ֪ͨ�۲���
	 */
	public void notifyObserver();

}
