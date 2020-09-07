package loop;

import java.util.Scanner;

public class PrintN {

	public static void main(String[] args) {
//		숫자 n까지 출력하기
		Scanner in = new Scanner(System.in);
		System.out.println("숫자 n을 입력하세요>>>");
		int number = in.nextInt();
		for(int count = 1;count<=number;count++) {
			System.out.print(count+" ");
		}
	}

}
