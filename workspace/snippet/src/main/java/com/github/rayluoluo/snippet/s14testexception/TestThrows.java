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
	// ��д���෽�����׳����쳣��Χ��С
	@Override
	public void ma() throws FileNotFoundException, EOFException {
	}
}

class B2 extends A {
	// ��д���෽�����������׳���Χ������쳣
	/*
	 * @Override public void ma() throws Exception { //�Ƿ� }
	 */
}