package controller;

import java.util.Scanner;

public class SwitchExam02 {

	public static void main(String[] args) {
		// 1~12��
//		���� �Է��� �޾Ƽ� �ش���� ������ ��¥�� ������ִ� ���α׷�
		Scanner in = new Scanner(System.in);
		System.out.println("1~12���� �Է����ּ���>>>");
		int month = in.nextInt();
		switch (month) {
		// �ҽ� ���� ����Ű : Ctrl+Shift+F
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31�ϱ��� �ֽ��ϴ�.");
			break;
		case 2:
			System.out.println("28�ϱ��� �ֽ��ϴ�.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30�ϱ��� �ֽ��ϴ�.");
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");

		}
	}

}
