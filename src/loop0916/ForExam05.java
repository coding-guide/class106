package loop0916;

public class ForExam05 {

	public static void main(String[] args) {
		// 1~ 50������ ���� �� 2�� ������� ����մϴ�. continue���
		for(int i = 1; i <= 50 ; i++) {
			if(i%2==0) {//¦����� ��
				System.out.println("¦�� : "+i);
			}else {
				// �ƹ��͵� ó������ �ʽ��ϴ�.
				// continue�� �ۼ��ϸ� �� ���� �Ʒ��� �ִ� ���๮�� �������� �ʰ� �ݺ��� ó������ �б��մϴ�.
				continue; 
			}
			System.out.println("***************************");
		}

	}

}
