package controller;

import java.util.Scanner;

public class SwitchExam01 {

	public static void main(String[] args) {
		// ����ڷκ��� ������ �Է¹޽��ϴ�
		// 1, 2, 3, ....
		// 1�̸� "�ݸ���", 2�̸� "���޴�", 3�̸� "���޴�", 
		//	�׿ܴ� "�������� ���߽��ϴ�"
		System.out.println("1,2,3���� ������ �Է��ϼ���>>>");
		Scanner in = new Scanner(System.in);
		int rank = in.nextInt();
		switch(rank) {
		case 1:
			System.out.println("�ݸ޴�");
			break;
		case 2:
			System.out.println("���޴�");
			break;
		case 3:
			System.out.println("���޴�");
			break;
		default:
			System.out.println("�������� ���߽��ϴ�.");
		}
		
	}

}
