package com.github.rayluoluo.snippet.s04_TestPrintf;

//��ʽ���������:
public class TestPrintf {
	public static void main(String[] args) {
		System.out.printf("(1) %+8.3f", 3.14); // "+"�Ŵ������ţ�8λ�ַ���ȣ�3λС���㣬������
		System.out.println();
		System.out.printf("(2) %+-8.3f\n", 3.14); // "-"�������
		System.out.printf("(3) %08.3f\n", 3.14); // �ַ���Ȳ�����"0"���
		System.out.printf("(4) %(8.3f\n", -3.14); // ����������չʾ
		System.out.printf("(5) %,f\n", 2356.3456); // �ָ�������","����
		System.out.printf("(6) %xf\n", 0x4a36); // ʮ������
		System.out.printf("(7) %#xf\n", 0x4a36); // ʮ�����ƣ���һ"0x"
		System.out.printf("(8) ��ã�%1$s, %2$3d��, %2$#x��\n", "����", 38); // s��ʾ�ַ���;
																		// 1$/2$/3$����ڼ�������
		System.out.printf("(9) %3d, %#<x", 38); // "<"��ʾ��һ������
	}
}
