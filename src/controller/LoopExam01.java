package controller;

public class LoopExam01 {

	public static void main(String[] args) {
		// 1���� 4���� ���ϴ� ���α׷��� ¥����.
		int num = 1; //1->4���� ���ڸ� ī�����ϴ� ����
		int sum = 0; //���� ����� �����ϴ� ����
		sum = sum + num;//sum <=1
		num = num + 1;//num <=2
		sum = sum + num;//sum <= 1+2
		num = num + 1; // num <=3
		sum = sum + num;// sum <= 1+2+3
		num = num + 1; // num <= 4
		sum = sum + num; // sum <= 1+2+3+4
		System.out.println("1~4������ ���� : "+sum);
	}

}
