package loop;

import java.util.Scanner;

public class AMultipleOf3 {

	public static void main(String[] args) {
//1���� �Է��� ������  3�� ����� ��� ����ϼ���.
// ���� N�� �Է��ϼ���>>>>
//	50
// *** 3�� ��� ****
//	3 6 9 12 ....
		Scanner in = new Scanner(System.in);
		System.out.println("���� 100�̻��� �Է��ϼ���>>>");
		
		int number = in.nextInt();
		System.out.println("*** 3�� ��� ***");
		int cntN = 1;
		for(int cnt = 1; cnt <= number; cnt++) {
//			3�� ����� �����ϴ� ���
//			3, 6, 9 ... ������=> 3���� �������� �������� 0�ΰ�.
//			������ ���ϴ� ������ : %
//			���� % 3  => ����� 3���� ���������� �������� ��ȯ����
//			���� : ���ٿ� 10���� ����ϰ� ���� �ٷ� ��������.
			if(cnt % 3 == 0) {
				System.out.print(cnt+" ");
				cntN++;//cntN�� ���� 1�� ������Ŵ
				// cntN�� 11�� �Ǵ¼��� ���� �ϳ� ����ְ�, cntN�� �ʱ�ȭ
				if(cntN > 10) {
					System.out.println();
					cntN=1;
				}
			}
		}
		
		
	}
}
		