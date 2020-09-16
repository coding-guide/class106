package loop0916;

import java.util.Scanner;

public class ForExam06 {

	public static void main(String[] args) {
		// 정수 N을 입력받아 1~N사이의 3의 배수를 뺀 나머지 정수를 출력하시오.
		Scanner in = new Scanner(System.in);
		System.out.println("숫자 n을 입력하세요>>>");
		int inputN = in.nextInt();
		System.out.println("======"+inputN+"까지의 3의 배수를 제외한 모든 수======");
		for (int i = 1; i <= inputN; i++) {
			if(i%3==0) {
				//3의 배수인 수는 아래 출력문을 실행하지 않고 for문으로 이동
				continue;
			}
			System.out.print(i);
			System.out.print("짝 ");
		}
	}

}
