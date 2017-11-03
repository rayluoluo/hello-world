package com.github.rayluoluo.designpattern.s021observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

	private float temperature;
	private float humidity;
	private float pressure;

	private List<Observer> observers = new ArrayList<Observer>();

	public void registerObserver(Observer observer) {
		if (observer != null) {
			observers.add(observer);
		}
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).update(temperature, humidity, pressure);
		}
	}

	/**
	 * �����������µ�api
	 * 
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void measurementChanged(float temperature, float humidity,
			float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObserver();
	}

	public static void main(String[] args) {
		System.out.println("ϵͳ������");
		WeatherData weatherData = new WeatherData();
		System.out.println("CurrentConditionDisplay ������Ϣ��");
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(
				weatherData);

		System.out.println("������������Ϣ������15, ʪ��78, ��ѹ101��");
		weatherData.measurementChanged(15, 78, 101);
	}
}
