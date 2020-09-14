package loop;

import java.util.Scanner;

public class ScannerSum {

	public static void main(String[] args) {
// 키보드로 정수를 입력받다가 0이 입력되면 입력을 종료하고 
//	현재까지 입력된 수의 합을 구하시오.<== 9월 9일 과제
		Scanner in = new Scanner(System.in);
		for (;;) {
			System.out.println("정수를 입력하세요>>>");
			int number = in.nextInt();
			System.out.println(number);
			if (number == 0) {
				break;
			}
		}

	}
}
