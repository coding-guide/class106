package loop2;

import java.util.Scanner;

public class WhileExam02 {
	public static void main(String[] args) {
		// Ű����� ���� N�� �Է¹޾� 0���� N���� ����Ͻÿ�.
		// -1�� �ԷµǸ� ���α׷� ����
		Scanner in = new Scanner(System.in);
		
		//while(true){
		// }
		while(true) {
			
			System.out.println("���� n�� �Է��ϼ���>>>>");
			int n = in.nextInt();
			if(n==-1) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			//while������ �ڵ��Ͻÿ�.
			int i = 0;
			while(i<=n) {
				System.out.print(i+" ");
				i++;
			}
			System.out.println();//�ٳ�����
		}
	}//main
}
