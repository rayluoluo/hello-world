/**
 * 
 */
package com.github.rayluoluo.snippet.s10testabstract;

/**
 * @author luocanwei
 * @date 2017��10��29��
 * @Description: ������ʵ�ַ���
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
