package loop2;

import java.util.Scanner;

public class ForExam02 {

	public static void main(String[] args) {
//Ű����� ���� N�� �Է¹޾� 0���� N���� ����Ͻÿ�.
//�����ϱ����ؼ��� ���� -1�� ������ �����ϼ���.
		Scanner in = new Scanner(System.in);
		for (;;) { // (;;) ���ѹݺ�
			System.out.println("���� n�� �Է��ϼ���>>>>");
			int n = in.nextInt();
			//����ó��
			if(n==-1) {
				//����
				System.out.println("���α׷��� �����մϴ�.");
				break; // �ݺ����� ����� �����
			}
			System.out.println("0���� �Է��� ���ڱ����� ����");
			for (int i = 0; i <= n; i++) {
				System.out.print(i + " ");
			}//���� for
			System.out.println();
		}//�ٱ��� for

	}//mian

}//class
