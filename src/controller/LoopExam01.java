package controller;

public class LoopExam01 {

	public static void main(String[] args) {
		// 1부터 4까지 더하는 프로그램을 짜세요.
		int num = 1; //1->4까지 숫자를 카운팅하는 변수
		int sum = 0; //더한 결과를 저장하는 변수
		sum = sum + num;//sum <=1
		num = num + 1;//num <=2
		sum = sum + num;//sum <= 1+2
		num = num + 1; // num <=3
		sum = sum + num;// sum <= 1+2+3
		num = num + 1; // num <= 4
		sum = sum + num; // sum <= 1+2+3+4
		System.out.println("1~4까지의 덧셈 : "+sum);
	}

}
