package loop;

import java.util.Scanner;

public class ScannerSum {

	public static void main(String[] args) {
// Ű����� ������ �Է¹޴ٰ� 0�� �ԷµǸ� �Է��� �����ϰ� 
//	������� �Էµ� ���� ���� ���Ͻÿ�.<== 9�� 9�� ����
		Scanner in = new Scanner(System.in);
		for (;;) {
			System.out.println("������ �Է��ϼ���>>>");
			int number = in.nextInt();
			System.out.println(number);
			if (number == 0) {
				break;
			}
		}

	}
}
