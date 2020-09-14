package loop2;

import java.util.Scanner;

public class DoWhileExam02 {

	public static void main(String[] args) {
		// 키보드로 정수 N을 입력받아 0부터 N까지 출력하시오.
		// -1을 입력하면 종료
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("정수 n을 입력하세요>>>>");
			int n = in.nextInt();
			if(n==-1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			// while문으로 코딩하시오.
			int i = 0;
			System.out.println("0부터 입력한 숫자까지의 나열");
			do {
				System.out.print(i+" ");
				i++;
			} while (i <= n);
			System.out.println();//줄 내리기
		} while (true);

	}

}
