package com.github.rayluoluo.snippet.s05testinstanceof;

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