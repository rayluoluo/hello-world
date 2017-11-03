package com.github.rayluoluo.designpattern.s021observer;

/**
 * 观察者
 * 
 * @author luocanwei
 * @date 2017年11月2日
 * @Description: 观察者
 */
public interface Observer {
	public void update(float temperature, float humidity, float pressure);
}
