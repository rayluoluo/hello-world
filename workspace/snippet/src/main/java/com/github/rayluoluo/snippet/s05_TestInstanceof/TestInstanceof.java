package com.github.rayluoluo.snippet.s05_TestInstanceof;

public class TestInstanceof {
	public void distribute(Person p) {
		if (p instanceof Graduate) {
			// ��������Graduate
		} else if (p instanceof Student) {
			// ��������Student
		} else {
			// ������Person
		}
	}
}