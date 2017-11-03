package com.github.rayluoluo.designpattern.s021observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private Subject weatherData;
	private float temperature;
	private float humidity;
	private float pressure;

	public CurrentConditionDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void display() {
		System.out.println("CurrentConditionDisplay: temperature - "
				+ this.temperature + "; humidity - " + this.humidity
				+ "; pressure - " + this.pressure + ".");
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
