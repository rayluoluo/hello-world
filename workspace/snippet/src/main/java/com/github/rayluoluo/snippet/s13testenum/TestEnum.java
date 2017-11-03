package com.github.rayluoluo.snippet.s13testenum;

public class TestEnum {
	// ����ö��
	public enum Week {
		MON, TUE, WED, THU, FRI, SAT, SUN
	}

	// ��equals���ʹ��
	public void work(Week day) {
		if (day.equals(Week.SAT)) {
			System.out.println("������������!");
		}
	}

	// ��switch/case���ʹ��
	public void work2(Week day) {
		switch (day) {
		case MON:
		case TUE:
		case WED:
		case THU:
		case FRI:
			System.out.println("�����գ�ȥ�ϰ�");
			break;
		case SAT:
			System.out.println("��������ȥ����");
			break;
		case SUN:
			System.out.println("�����죬ȥ���");
			break;
		default:
			System.out.println("ERROR PARAMS");
			break;
		}
	}
}
