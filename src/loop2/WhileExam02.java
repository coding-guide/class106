package loop2;

import java.util.Scanner;

public class WhileExam02 {
	public static void main(String[] args) {
		// 키보드로 정수 N을 입력받아 0부터 N까지 출력하시오.
		// -1이 입력되면 프로그램 종료
		Scanner in = new Scanner(System.in);
		
		//while(true){
		// }
		while(true) {
			
			System.out.println("정수 n을 입력하세요>>>>");
			int n = in.nextInt();
			if(n==-1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			//while문으로 코딩하시오.
			int i = 0;
			while(i<=n) {
				System.out.print(i+" ");
				i++;
			}
			System.out.println();//줄내리기
		}
	}//main
}
