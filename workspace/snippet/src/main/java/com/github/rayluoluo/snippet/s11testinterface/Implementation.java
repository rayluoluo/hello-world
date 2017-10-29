package com.github.rayluoluo.snippet.s11testinterface;

public class Implementation implements Interface {
	// 子类实现父类抽象方法
	public void foo() {
		System.out.println("Interface.foo(): 'public abstract' is omitted.");
	}
}
