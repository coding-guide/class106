package controller;

import java.util.Scanner;

public class SwitchExam02 {

	public static void main(String[] args) {
		// 1~12��
//		���� �Է��� �޾Ƽ� �ش���� ������ ��¥�� ������ִ� ���α׷�
		Scanner in = new Scanner(System.in);
		System.out.println("1~12���� �Է����ּ���>>>");
		int month = in.nextInt();
		switch(month) {
		case 1:
			System.out.println("31�ϱ��� �ֽ��ϴ�.");
			break;
		case 2:
			System.out.println("28�ϱ��� �ֽ��ϴ�.");
			break;
		case 3:
			System.out.println("31�ϱ��� �ֽ��ϴ�.");
			break;
		case 4:
			System.out.println("30�ϱ��� �ֽ��ϴ�.");
			break;
		case 5:
			System.out.println("31�ϱ��� �ֽ��ϴ�.");
			break;
		case 6:
			System.out.println("30�ϱ��� �ֽ��ϴ�.");
			break;
		case 7:
			System.out.println("31�ϱ��� �ֽ��ϴ�.");
			break;
		case 8:
			System.out.println("31�ϱ��� �ֽ��ϴ�.");
			break;
		case 9:
			System.out.println("30�ϱ��� �ֽ��ϴ�.");
			break;
		case 10:
			System.out.println("31�ϱ��� �ֽ��ϴ�.");
			break;
		case 11:
			System.out.println("30�ϱ��� �ֽ��ϴ�.");
			break;
		case 12:
			System.out.println("31�ϱ��� �ֽ��ϴ�.");
				
		}
	}

}
