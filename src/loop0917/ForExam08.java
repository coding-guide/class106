package loop0917;

import java.util.Scanner;

public class ForExam08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���� n�� �Է��ϼ���.>>>>");
		int inputNum = in.nextInt();
		for(int i = 1; i<=inputNum;i++) {
			if(i%3==0) {
				// �Ʒ� ��¹��� �����ϸ� �ȵ�.
				// �� �ݺ����� ��ӵǾ�� ��.
				continue;
			}
			System.out.print(i);
			System.out.print("¦ ");
		}
	}

}
