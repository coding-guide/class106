package loop0923;

import java.util.Scanner;

public class LoopExam01 {
	// 주사위의 눈값을 맞추는 프로그램을 작성하시오.
	// 기회는 3번. 1번에 맞추면 30점, 2번에 맞추면 20점.
	// 3번째 맞추면 10점. 틀리면 0점.
	public static void main(String[] args) {
//		for(int i = 1; i<=200; i++) { // 0 ~ 100점
//			double jumsu = Math.random();
//			System.out.println(i+"번 학생 점수 :"+(int)(jumsu*101));
//		}
		// System.out.println(Math.random());//1 ~ 6 => 0 ~ 5 여기에 +1
		int diceNumber;
		Scanner in = new Scanner(System.in);
		int jumsu = 0;
		System.out.println("도전자의 이름을 입력하세요>>>");
		String name = in.next();
		
		for (int cnt = 1; cnt <= 5; cnt++) {
			System.out.println("-------"+cnt+"번째 주사위를 던집니다.-------");
			diceNumber = (int) (Math.random() * 6) + 1;// 컴퓨터가 주사위 던지기
			for (int i = 3; i >= 1; i--) { // int i = 1; i<=3;i++
				System.out.println("주사위 값을 입력하세요>>>>>");
				int inputnumber = in.nextInt();
				if (diceNumber == inputnumber) {
					System.out.println("맞았습니다.");
					jumsu = jumsu+i * 10;//점수 누적
					break;
				} else {
					System.out.println("틀렸습니다.");
				}
			} // for
		}
		System.out.println(name+"님 점수는 " + jumsu +"점 입니다.");

	}

}
