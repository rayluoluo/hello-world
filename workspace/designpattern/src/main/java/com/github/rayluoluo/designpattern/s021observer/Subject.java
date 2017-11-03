/**
 * 
 */
package com.github.rayluoluo.designpattern.s021observer;

/**
 * @author luocanwei
 * @date 2017年11月2日
 * @Description:可观察者
 */
public interface Subject {
	/**
	 * 注册订阅
	 * 
	 * @param observer
	 */
	public void registerObserver(Observer observer);

	/**
	 * 取消订阅
	 * 
	 * @param observer
	 */
	public void removeObserver(Observer observer);

	/**
	 * 通知观察者
	 */
	public void notifyObserver();

}
