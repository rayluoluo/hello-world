package com.github.rayluoluo.snippet.s11testinterface;

/**
 * @author luocanwei
 * @date 2017年10月29日
 * @Description: 常量必须是public static final，方法必须是public abstract，修饰符可以部分或全部省略。
 */
public interface Interface {
	// 声明常量：public static final 可缺省
	String text = "'public static final' is omitted.";

	// 声明方法：public abstract 可缺省
	void foo();
}
