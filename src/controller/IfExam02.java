package controller;

import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {
//		8�� �̸�
//		8��~13�� :�ʵ�
//		14��~16�� : �ߵ�
//		17��~19�� : ���
//		20�� �̻� : ����
		Scanner in = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���>>>");
		int age = in.nextInt();
		if(age < 8) {
			System.out.println("���� �� �Ƶ��Դϴ�.");
			// else�� age>=8 ��� ������ ǰ�� �ִ�.
		}else if( age <= 13) {
			//8 <= age <= 13	
			System.out.println("�ʵ��л� �Դϴ�.");
			// else�� ���� ���� ���� : age > 13			
		}else if(age <= 16) {
			System.out.println("���л��Դϴ�.");
		}else if(age <= 19) {
			System.out.println("����л��Դϴ�.");
		}else {
			// age > 19
			System.out.println("�����Դϴ�.");
		}

	}

}
