package com.github.rayluoluo.snippet.s04_TestPrintf;

//格式化输出栗子:
public class TestPrintf {
	public static void main(String[] args) {
		System.out.printf("(1) %+8.3f", 3.14); // "+"号带正负号，8位字符宽度，3位小数点，浮点型
		System.out.println();
		System.out.printf("(2) %+-8.3f\n", 3.14); // "-"号左对齐
		System.out.printf("(3) %08.3f\n", 3.14); // 字符宽度不足用"0"填充
		System.out.printf("(4) %(8.3f\n", -3.14); // 负数用括号展示
		System.out.printf("(5) %,f\n", 2356.3456); // 分隔数字用","隔开
		System.out.printf("(6) %xf\n", 0x4a36); // 十六进制
		System.out.printf("(7) %#xf\n", 0x4a36); // 十六进制，多一"0x"
		System.out.printf("(8) 你好：%1$s, %2$3d岁, %2$#x岁\n", "张三", 38); // s表示字符串;
																		// 1$/2$/3$代表第几个参数
		System.out.printf("(9) %3d, %#<x", 38); // "<"表示上一个参数
	}
}
