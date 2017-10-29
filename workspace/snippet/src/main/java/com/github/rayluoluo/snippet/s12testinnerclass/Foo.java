package com.github.rayluoluo.snippet.s12testinnerclass;

public class Foo {
	private String name = "Outer";

	// �ڲ�Ƕ����Ҳ��������Ϊprivate��protected
	private class InnerClass {
		private String name = "Inner";

		public void printName(String name) {
			System.out.println("Arg  Name:" + name);
			System.out.println("InnerName:" + this.name);
			System.out.println("OuterName:" + Foo.this.name);
		}
	};

	public static void main(String[] args) {
		Foo foo = new Foo();
		// �ڲ�������new����
		Foo.InnerClass inner = foo.new InnerClass();
		inner.printName("Argument");
	}
}
