package com.github.rayluoluo.snippet.s15testassert;

/**
 * @author luocanwei
 * @date 2017��11��19��
 * @Description: ����Assert Java����ʱ����Ĭ������Ϊ�رն��Թ��ܣ�ʹ��ǰҪ�򿪶��Թ���
 */
public class TestAssert {
	private int age = 0;

	public void setAge(int age) {
		// ���ö���
		assert (age > 0) : "���������������";
		this.age = age;
		System.out.println("��������ɹ�");
	}

	public static void main(String[] args) {
		TestAssert testAssert = new TestAssert();
		testAssert.setAge(-18);
	}
}
