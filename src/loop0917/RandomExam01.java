package loop0917;

public class RandomExam01 {

	public static void main(String[] args) {
		// Math.random() => 0���� ũ�ų� ����, 1���� ����
		// 0�� ~ 99������ ������ ������ �ְ�;�.
		for(int i = 0; i<100 ; i++) {
			System.out.println("���� : "+(int)(Math.random()*100));
		}
		
	}

}
