package loop;

import java.util.Scanner;

public class SumUntilN {

	public static void main(String[] args) {
		// �Է¹��� ���� N������ ���� ���Ͻÿ�.
		Scanner in = new Scanner(System.in);
		System.out.println("���� N�� �Է��ϼ���>>>");
		int number = in.nextInt();
		int sum = 0;
		for(int i = 1 ; i <= number; i++) {
			sum = sum+i;
		}
		System.out.println(number+"������ ���� :"+sum);
//		�ݺ����� ���� : for , while , do~while
	}

}
