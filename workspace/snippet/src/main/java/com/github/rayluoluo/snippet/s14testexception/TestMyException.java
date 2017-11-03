package com.github.rayluoluo.snippet.s14testexception;

public class TestMyException {
	public static void main(String[] args) {
		try {
			// �����׳��쳣
			throw new MyException("ʧ����Ϣ", 3);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
}

class MyException extends Exception {
	private static final long serialVersionUID = 1L;
	private int idNumber;

	public MyException(String message, int id) {
		super(message);
		this.idNumber = id;
	}

	public int getIdNumber() {
		return idNumber;
	}
}
