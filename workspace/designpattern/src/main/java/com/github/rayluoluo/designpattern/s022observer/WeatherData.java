package com.github.rayluoluo.designpattern.s022observer;

import java.util.Observable;

public class WeatherData extends Observable {

	private float temperature;

	public float getTemperature() {
		return temperature;
	}

	public void measurementChanged(float temperature) {
		this.temperature = temperature;
		// ���״̬�Ѿ��ı䡣ֻ����setChange()�����ú�notifyObservers()�Ż�ȥ����update()������ʲô�����ɡ�
		this.setChanged();
		// ֪ͨ���¹۲���
		this.notifyObservers();
	}

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		// ������Ϣ
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(
				weatherData);

		// ��������
		weatherData.measurementChanged(10);
	}
}
