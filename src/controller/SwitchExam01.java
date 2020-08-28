package controller;

import java.util.Scanner;

public class SwitchExam01 {

	public static void main(String[] args) {
		// 사용자로부터 순위를 입력받습니다
		// 1, 2, 3, ....
		// 1이면 "금메일", 2이면 "은메달", 3이면 "동메달", 
		//	그외는 "수상하지 못했습니다"
		System.out.println("1,2,3등의 순위를 입력하세요>>>");
		Scanner in = new Scanner(System.in);
		int rank = in.nextInt();
		switch(rank) {
		case 1:
			System.out.println("금메달");
			break;
		case 2:
			System.out.println("은메달");
			break;
		case 3:
			System.out.println("동메달");
			break;
		default:
			System.out.println("수상하지 못했습니다.");
		}
		
	}

}
