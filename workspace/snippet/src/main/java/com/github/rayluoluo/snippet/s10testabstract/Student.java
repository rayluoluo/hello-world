/**
 * 
 */
package com.github.rayluoluo.snippet.s10testabstract;

/**
 * @author luocanwei
 * @date 2017年10月29日
 * @Description: 抽象类实现方法
 */
public class Student extends Person {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.rayluoluo.snippet.s10testabstract.Animal#eat()
	 */
	@Override
	public void eat() {
		System.out.println("Eat at school.");
	}

	public static void main(String[] args) {
		Animal animal = new Student();
		animal.eat();
	}
}
