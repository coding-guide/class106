package loop0916;

import java.util.Scanner;

public class ForExam06 {

	public static void main(String[] args) {
		// ���� N�� �Է¹޾� 1~N������ 3�� ����� �� ������ ������ ����Ͻÿ�.
		Scanner in = new Scanner(System.in);
		System.out.println("���� n�� �Է��ϼ���>>>");
		int inputN = in.nextInt();
		System.out.println("======"+inputN+"������ 3�� ����� ������ ��� ��======");
		for (int i = 1; i <= inputN; i++) {
			if(i%3==0) {
				//3�� ����� ���� �Ʒ� ��¹��� �������� �ʰ� for������ �̵�
				continue;
			}
			System.out.print(i);
			System.out.print("¦ ");
		}
	}

}
