package loop0917;

import java.util.Scanner;

public class ForExam09 {

	public static void main(String[] args) {
		// ����ڰ� ���� N�� �Է��ϸ� N���� 2�� ����� 
		// ������ ���� ���Ͻÿ�.
		Scanner in = new Scanner(System.in);
		System.out.println("���� n�� �Է��ϼ���>>>>");
		int inputN = in.nextInt();
		int cnt=0, sum=0;
		System.out.println("====="+inputN+"������ 2�� ��� =====");
		for(int i = 1; i<=inputN; i++) {
			if(i%2==0) {//2�� ���
				System.out.print(i+" ");
				cnt = cnt + 1; // cnt += 1; �Ǵ� cnt++;
				sum = sum + i; // sum += i;
			}
		}
		System.out.println();
		System.out.println(inputN+"������ 2�� ����� ���� :"+cnt);
		System.out.println(inputN+"������ 2�� ����� �� :"+sum);
		
	}

}
