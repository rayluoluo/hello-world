package com.github.rayluoluo.snippet.s05testinstanceof;

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