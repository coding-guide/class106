package loop;

import java.util.Scanner;

public class SumUntilN {

	public static void main(String[] args) {
		// 입력받은 정수 N까지의 합을 구하시오.
		Scanner in = new Scanner(System.in);
		System.out.println("숫자 N을 입력하세요>>>");
		int number = in.nextInt();
		int sum = 0;
		for(int i = 1 ; i <= number; i++) {
			sum = sum+i;
		}
		System.out.println(number+"까지의 합은 :"+sum);
//		반복문의 종류 : for , while , do~while
	}

}
