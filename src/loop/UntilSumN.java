package loop;

public class UntilSumN {

	public static void main(String[] args) {
//      �ڿ����� 1���� ����ؼ� ���س����ٰ� 
//		100,000�� �Ѿ�� ���� for���� �����ϰ� 
//		���������� ������ ���� ���Ͽ���
		
//		1+2+3+... �̰��� �ݺ������� ����ϴ�.
//		���� ����� �񱳸� �ؾߵǰ���??
//		���� ����� 100000�̻��̵ɶ��� �ڿ��� N�� ���� ã�ƶ�.
		
		int sum = 0; //sum�� ���� ����� �����ִ� ����
		int number = 0; // number�� �ڿ����� ī��Ʈ�� ����
// 5������ ���� 15�ӿ�. --> 14 �Ѿ�� ������ number����?? 5
		for(;;) {
			number++;
			sum = sum + number;
//			System.out.println(number);
			if(sum > 100000) { // ���Ѱ���� 100000�� �Ǵ� ���� �ݺ����� ����.
				break;     // �̶������� sum�� number�� ���� ����.
			}
		}//for
		System.out.println("number�� : "+number);
		System.out.println("number������ sum�� : "+sum);
	}
}
