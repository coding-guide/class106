package controller;

import java.util.Scanner;

public class IfExam03 {

	public static void main(String[] args) {
//	�ذ���� if~elseif�� �̿��ϱ�
// ����ڷκ��� ������ �Է¹޽��ϴ�
// 1, 2, 3, ....
// 1�̸� "�ݸ���", 2�̸� "���޴�", 3�̸� "���޴�", 
//	�׿ܴ� "�������� ���߽��ϴ�"
//	�� ����ϼ���
		Scanner in = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���>>>");
		int rank = in.nextInt();
//		������� if~elseif������ �����ذ��ϱ�
//		A�� B�� ������? if(A==B)
		int money=0;
		
		if(rank == 1) {
			System.out.println("�ݸ޴��Դϴ�.");
			money = 1000000;
		}else if(rank==2) {
			System.out.println("���޴��Դϴ�.");
			money = 500000;
		}else if(rank==3) {
			System.out.println("���޴��Դϴ�.");
			money = 100000;
		}else {
			System.out.println("�����������Ͽ����ϴ�.");
		}//if ~ elseif
		System.out.println("����� "+money+"�� �Դϴ�.");
	}

}
