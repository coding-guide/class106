package loop0917;

public class RandomExam02 {
	public static void main(String[] args) {
//	�ֻ����� 10�� ������ �� ������ ���� ���� �����Ͻÿ�.
//	( Math.random()�̿� )
		for(int i = 1; i<=10; i++) {
			System.out.println(i+"��° �ֻ��� ���� : "+(int)(Math.random()*6)+1);
		}
	}
}
