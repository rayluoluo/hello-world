package com.github.rayluoluo.designpattern.s022observer;

import java.util.Observable;
import java.util.Observer;

import com.github.rayluoluo.designpattern.s021observer.DisplayElement;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private Observable observable;
	private float temperature;

	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		// 注册
		observable.addObserver(this);
	}

	public void update(Observable subject, Object params) {
		// 先判断是不是可观察者的实例
		if (subject instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) subject;
			this.temperature = weatherData.getTemperature();
			display();
		}
	}

	public void display() {
		System.out.println("CurrentConditionDisplay: temperature - "
				+ this.temperature + ".");
	}

}
