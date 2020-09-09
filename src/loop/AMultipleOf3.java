package loop;

import java.util.Scanner;

public class AMultipleOf3 {

	public static void main(String[] args) {
//1부터 입력한 값까지  3의 배수를 모두 출력하세요.
// 숫자 N을 입력하세요>>>>
//	50
// *** 3의 배수 ****
//	3 6 9 12 ....
		Scanner in = new Scanner(System.in);
		System.out.println("숫자 100이상을 입력하세요>>>");
		
		int number = in.nextInt();
		System.out.println("*** 3의 배수 ***");
		int cntN = 1;
		for(int cnt = 1; cnt <= number; cnt++) {
//			3의 배수를 선택하는 방법
//			3, 6, 9 ... 공통점=> 3으로 나눴을때 나머지가 0인거.
//			나머지 구하는 연산자 : %
//			숫자 % 3  => 결과는 3으로 나눳을때의 나머지를 반환해줌
//			문제 : 한줄에 10개씩 출력하고 다음 줄로 내리세요.
			if(cnt % 3 == 0) {
				System.out.print(cnt+" ");
				cntN++;//cntN이 값을 1씩 증가시킴
				// cntN이 11이 되는순간 빈줄 하나 집어넣고, cntN을 초기화
				if(cntN > 10) {
					System.out.println();
					cntN=1;
				}
			}
		}
		
		
	}
}
		