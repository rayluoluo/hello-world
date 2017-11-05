package com.github.rayluoluo.snippet.e01TestDouble;

import java.math.BigDecimal;

/**
 * @author luocanwei
 * @date 2017��11��5��
 * @Description: Java������߸������Ա�ṩ��һ�������õ���BigDecimal����������float��double���޷����о�ȷ�����ȱ��
 */
public class TestDouble {

	public static void testDouble() {
		double a = 1;
		double b = 0.9;
		BigDecimal a1 = new BigDecimal(Double.toString(a));
		BigDecimal b1 = new BigDecimal(Double.toString(b));
		BigDecimal a2 = new BigDecimal(a);
		BigDecimal b2 = new BigDecimal(b);
		double c = a1.subtract(b1).doubleValue();
		double d = a2.subtract(b2).doubleValue();
		System.out.println("double a-b=\t" + (a - b));
		System.out.println("double c=\t" + c);
		System.out.println("double d=\t" + d);
	}

	public static void testFloat() {
		float a = 1f;
		float b = 0.9f;
		BigDecimal a1 = new BigDecimal(Float.toString(a));
		BigDecimal b1 = new BigDecimal(Float.toString(b));
		BigDecimal a2 = new BigDecimal(a);
		BigDecimal b2 = new BigDecimal(b);
		float c = a1.subtract(b1).floatValue();
		float d = a2.subtract(b2).floatValue();
		System.out.println("float a-b=\t" + (a - b));
		System.out.println("float c=\t" + c);
		System.out.println("float d=\t" + d);
	}

	public static void main(String[] args) {
		System.out.println("-------------double--------------");
		testDouble();
		System.out.println("-------------float--------------");
		testFloat();
	}
}
