package loop0917;

import java.util.Scanner;

public class ForExam07 {

	public static void main(String[] args) {
// 정수 N을 입력받아 입력받은 수의 2배값을 출력하고 
// 0을 입력하면 프로그램을 종료하시오.( break )
		Scanner in = new Scanner(System.in); 
		for(;;) {
			System.out.println("정수 N을 입력하세요.(단, 0은 프로그램 종료)>>>");
			int inputNum = in.nextInt();
			if(inputNum==0) {
				System.out.println("프로그램 종료");
				break;
			}
			// 입력된 숫자 N의 2배수 : inputNum*2
			System.out.println("입력된 숫자 "+inputNum+"의 2배수 :"+inputNum*2);
		}//break로인해 for문을 벗어남.
		
		
	}

}
