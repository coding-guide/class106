package loop;

public class ABC {

	public static void main(String[] args) {
// ���ĺ� a ~ z���� ����Ͻÿ�.
//		���ڸ� �����ϴ� �ڷ��� char <= ���ڿ� �ش��ϴ� �ڵ尪�� ��������
		for(char ch = 'a'; ch <= 'z';ch++) {
			System.out.print(ch);
		}
		System.out.println();
//		�빮�� A ~ Z���� ����ϱ�
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch);
		}
	}

}
