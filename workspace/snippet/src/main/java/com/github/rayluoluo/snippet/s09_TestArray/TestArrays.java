package com.github.rayluoluo.snippet.s09_TestArray;

import java.util.Arrays;

public class TestArrays {
	public static void main(String[] args) {
		// ������������
		int a[] = { 6, 23, 45, 12, -83, 94, 41 };
		// �������� ���ڲ�ʵ�ֲ��ÿ������򷨣�
		Arrays.sort(a);
		// ���������Ԫ�����
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}
