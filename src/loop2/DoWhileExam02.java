package loop2;

import java.util.Scanner;

public class DoWhileExam02 {

	public static void main(String[] args) {
		// Ű����� ���� N�� �Է¹޾� 0���� N���� ����Ͻÿ�.
		// -1�� �Է��ϸ� ����
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("���� n�� �Է��ϼ���>>>>");
			int n = in.nextInt();
			if(n==-1) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			// while������ �ڵ��Ͻÿ�.
			int i = 0;
			System.out.println("0���� �Է��� ���ڱ����� ����");
			do {
				System.out.print(i+" ");
				i++;
			} while (i <= n);
			System.out.println();//�� ������
		} while (true);

	}

}
