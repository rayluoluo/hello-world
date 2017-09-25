package com.github.rayluoluo.snippet.s06testoverwrite;

//协变返回类型：重写方法时，修改其返回值的类型；但必须是重写前方法返回值类型的子类或实现类类型。
public class CovarianReturn extends Parent {
	public Student getAssistor() {
		Student s = new Student();
		// --
		return s;
	}
}
