package loop;

import java.util.Scanner;

public class PrintN {

	public static void main(String[] args) {
//		���� n���� ����ϱ�
		Scanner in = new Scanner(System.in);
		System.out.println("���� n�� �Է��ϼ���>>>");
		int number = in.nextInt();
		for(int count = 1;count<=number;count++) {
			System.out.print(count+" ");
		}
	}

}
