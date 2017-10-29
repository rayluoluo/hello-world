package com.github.rayluoluo.snippet.s12testinnerclass;

public class Foo {
	private String name = "Outer";

	// 内部嵌套类也可以声明为private或protected
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
		// 内部类对象的new方法
		Foo.InnerClass inner = foo.new InnerClass();
		inner.printName("Argument");
	}
}
