package com.github.rayluoluo.snippet.s13testenum;

public class TestEnum {
	// 定义枚举
	public enum Week {
		MON, TUE, WED, THU, FRI, SAT, SUN
	}

	// 与equals结合使用
	public void work(Week day) {
		if (day.equals(Week.SAT)) {
			System.out.println("星期六，购物!");
		}
	}

	// 与switch/case结合使用
	public void work2(Week day) {
		switch (day) {
		case MON:
		case TUE:
		case WED:
		case THU:
		case FRI:
			System.out.println("工作日，去上班");
			break;
		case SAT:
			System.out.println("星期六，去购物");
			break;
		case SUN:
			System.out.println("星期天，去礼拜");
			break;
		default:
			System.out.println("ERROR PARAMS");
			break;
		}
	}
}
