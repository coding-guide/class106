package loop0917;

import java.util.Scanner;

public class ForExam08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수 n을 입력하세요.>>>>");
		int inputNum = in.nextInt();
		for(int i = 1; i<=inputNum;i++) {
			if(i%3==0) {
				// 아래 출력문을 실행하면 안됨.
				// 단 반복문은 계속되어야 됨.
				continue;
			}
			System.out.print(i);
			System.out.print("짝 ");
		}
	}

}
