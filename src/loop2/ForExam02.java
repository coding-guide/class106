package loop2;

import java.util.Scanner;

public class ForExam02 {

	public static void main(String[] args) {
//키보드로 정수 N을 입력받아 0부터 N까지 출력하시오.
//종료하기위해서는 숫자 -1을 넣으면 종료하세요.
		Scanner in = new Scanner(System.in);
		for (;;) { // (;;) 무한반복
			System.out.println("정수 n을 입력하세요>>>>");
			int n = in.nextInt();
			//종료처리
			if(n==-1) {
				//종료
				System.out.println("프로그램을 종료합니다.");
				break; // 반복문을 벗어나는 예약어
			}
			System.out.println("0부터 입력한 숫자까지의 나열");
			for (int i = 0; i <= n; i++) {
				System.out.print(i + " ");
			}//안쪽 for
			System.out.println();
		}//바깥쪽 for

	}//mian

}//class
