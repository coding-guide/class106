package loop0916;

import java.util.Scanner;

public class ForExam04 {

	public static void main(String[] args) {
		// 정수 N을 입력받아 입력받은 수의 2배값을
		// 출력하고 0을 입력하면 프로그램을 종료하시오
		Scanner in = new Scanner(System.in);
		
		for(;;) {
			System.out.println("정수N을 입력하세요(0은 프로그램 종료)>>>");
			int inputNumber = in.nextInt();
			if(inputNumber==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			// 입력된 숫자 N 의 두배 수 : N*2
			System.out.println("입력된 숫자 "+inputNumber+" 의 두배 수 :"+inputNumber*2);
		}
		in.close();
	}

}
