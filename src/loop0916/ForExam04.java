package loop0916;

import java.util.Scanner;

public class ForExam04 {

	public static void main(String[] args) {
		// ���� N�� �Է¹޾� �Է¹��� ���� 2�谪��
		// ����ϰ� 0�� �Է��ϸ� ���α׷��� �����Ͻÿ�
		Scanner in = new Scanner(System.in);
		
		for(;;) {
			System.out.println("����N�� �Է��ϼ���(0�� ���α׷� ����)>>>");
			int inputNumber = in.nextInt();
			if(inputNumber==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			// �Էµ� ���� N �� �ι� �� : N*2
			System.out.println("�Էµ� ���� "+inputNumber+" �� �ι� �� :"+inputNumber*2);
		}
		in.close();
	}

}
