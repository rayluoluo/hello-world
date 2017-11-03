package com.github.rayluoluo.designpattern.s022observer;

import java.util.Observable;

public class WeatherData extends Observable {

	private float temperature;

	public float getTemperature() {
		return temperature;
	}

	public void measurementChanged(float temperature) {
		this.temperature = temperature;
		// 标记状态已经改变。只有在setChange()被调用后，notifyObservers()才会去调用update()，否则什么都不干。
		this.setChanged();
		// 通知更新观察者
		this.notifyObservers();
	}

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		// 订阅消息
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(
				weatherData);

		// 更新数据
		weatherData.measurementChanged(10);
	}
}
