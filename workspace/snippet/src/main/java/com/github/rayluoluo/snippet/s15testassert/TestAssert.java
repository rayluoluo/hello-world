package com.github.rayluoluo.snippet.s15testassert;

/**
 * @author luocanwei
 * @date 2017年11月19日
 * @Description: 测试Assert Java运行时环境默认设置为关闭断言功能，使用前要打开断言功能
 */
public class TestAssert {
	private int age = 0;

	public void setAge(int age) {
		// 设置断言
		assert (age > 0) : "年龄必须是正整数";
		this.age = age;
		System.out.println("设置年龄成功");
	}

	public static void main(String[] args) {
		TestAssert testAssert = new TestAssert();
		testAssert.setAge(-18);
	}
}
