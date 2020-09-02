package controller;

import java.util.Scanner;

public class SwitchExam02 {

	public static void main(String[] args) {
		// 1~12월
//		달을 입력을 받아서 해당달의 마지막 날짜를 출력해주는 프로그램
		Scanner in = new Scanner(System.in);
		System.out.println("1~12월을 입력해주세요>>>");
		int month = in.nextInt();
		switch (month) {
		// 소스 정렬 단축키 : Ctrl+Shift+F
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일까지 있습니다.");
			break;
		case 2:
			System.out.println("28일까지 있습니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일까지 있습니다.");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");

		}
	}

}
