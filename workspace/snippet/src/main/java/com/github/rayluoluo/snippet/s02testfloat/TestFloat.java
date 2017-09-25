package com.github.rayluoluo.snippet.s02testfloat;

public class TestFloat {
	static private double d = 0x1.2p-3;

	public static void main(String args[]) {
		System.out.println("0x1.2p-3 value:" + d);
		System.out.println("3.0/0.0 = " + 3.0 / 0.0);
		System.out.println("-3.0/0.0 = " + (-3.0 / 0.0));
		System.out.println("0.0/0.0 = " + 0.0 / 0.0);
	}
}