package controller;

public class SwitchExam03 {

	public static void main(String[] args) {
		// g : �ݵ���, s : ������, b : �赵�� , �׿ܹ��� : ������ �ƴմϴ�.
		char ch='s';
		switch(ch) {
		case 'g':
			System.out.println("�ݵ����Դϴ�.");
			break;
		case 's':
			System.out.println("�������Դϴ�.");
			break;
		case 'b':
			System.out.println("�赵���Դϴ�.");
			break;
		default:
			System.out.println("������ �ƴմϴ�.");
		}
	}

}
