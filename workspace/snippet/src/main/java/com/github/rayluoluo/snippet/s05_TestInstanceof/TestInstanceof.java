package com.github.rayluoluo.snippet.s05_TestInstanceof;

public class TestInstanceof {
	public void distribute(Person p) {
		if (p instanceof Graduate) {
			// 处理子类Graduate
		} else if (p instanceof Student) {
			// 处理子类Student
		} else {
			// 处理父类Person
		}
	}
}