package loop0917;

import java.util.Scanner;

public class ForExam07 {

	public static void main(String[] args) {
// ���� N�� �Է¹޾� �Է¹��� ���� 2�谪�� ����ϰ� 
// 0�� �Է��ϸ� ���α׷��� �����Ͻÿ�.( break )
		Scanner in = new Scanner(System.in); 
		for(;;) {
			System.out.println("���� N�� �Է��ϼ���.(��, 0�� ���α׷� ����)>>>");
			int inputNum = in.nextInt();
			if(inputNum==0) {
				System.out.println("���α׷� ����");
				break;
			}
			// �Էµ� ���� N�� 2��� : inputNum*2
			System.out.println("�Էµ� ���� "+inputNum+"�� 2��� :"+inputNum*2);
		}//break������ for���� ���.
		
		
	}

}
