package com.github.rayluoluo.snippet.s09_TestArray;

import java.util.Arrays;

public class TestArrays {
	public static void main(String[] args) {
		// 创建样本数组
		int a[] = { 6, 23, 45, 12, -83, 94, 41 };
		// 数组排序 （内部实现采用快速排序法）
		Arrays.sort(a);
		// 排序后数组元素输出
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}
