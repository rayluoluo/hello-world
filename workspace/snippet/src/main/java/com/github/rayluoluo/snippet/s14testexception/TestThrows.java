package com.github.rayluoluo.snippet.s14testexception;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestThrows {

}

class A {
	public void ma() throws IOException {
	}
}

class B1 extends A {
	// 重写基类方法，抛出的异常范围更小
	@Override
	public void ma() throws FileNotFoundException, EOFException {
	}
}

class B2 extends A {
	// 重写基类方法，不允许抛出范围更大的异常
	/*
	 * @Override public void ma() throws Exception { //非法 }
	 */
}