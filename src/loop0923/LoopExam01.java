package loop0923;

import java.util.Scanner;

public class LoopExam01 {
	// �ֻ����� ������ ���ߴ� ���α׷��� �ۼ��Ͻÿ�.
	// ��ȸ�� 3��. 1���� ���߸� 30��, 2���� ���߸� 20��.
	// 3��° ���߸� 10��. Ʋ���� 0��.
	public static void main(String[] args) {
//		for(int i = 1; i<=200; i++) { // 0 ~ 100��
//			double jumsu = Math.random();
//			System.out.println(i+"�� �л� ���� :"+(int)(jumsu*101));
//		}
		// System.out.println(Math.random());//1 ~ 6 => 0 ~ 5 ���⿡ +1
		int diceNumber;
		Scanner in = new Scanner(System.in);
		int jumsu = 0;
		System.out.println("�������� �̸��� �Է��ϼ���>>>");
		String name = in.next();
		
		for (int cnt = 1; cnt <= 5; cnt++) {
			System.out.println("-------"+cnt+"��° �ֻ����� �����ϴ�.-------");
			diceNumber = (int) (Math.random() * 6) + 1;// ��ǻ�Ͱ� �ֻ��� ������
			for (int i = 3; i >= 1; i--) { // int i = 1; i<=3;i++
				System.out.println("�ֻ��� ���� �Է��ϼ���>>>>>");
				int inputnumber = in.nextInt();
				if (diceNumber == inputnumber) {
					System.out.println("�¾ҽ��ϴ�.");
					jumsu = jumsu+i * 10;//���� ����
					break;
				} else {
					System.out.println("Ʋ�Ƚ��ϴ�.");
				}
			} // for
		}
		System.out.println(name+"�� ������ " + jumsu +"�� �Դϴ�.");

	}

}
