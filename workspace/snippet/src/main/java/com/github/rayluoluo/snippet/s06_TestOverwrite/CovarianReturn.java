package com.github.rayluoluo.snippet.s06_TestOverwrite;

//Э�䷵�����ͣ���д����ʱ���޸��䷵��ֵ�����ͣ�����������дǰ��������ֵ���͵������ʵ�������͡�
public class CovarianReturn extends Parent {
	public Student getAssistor() {
		Student s = new Student();
		// --
		return s;
	}
}
