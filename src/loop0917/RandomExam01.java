package loop0917;

public class RandomExam01 {

	public static void main(String[] args) {
		// Math.random() => 0보다 크거나 같고, 1보다 작음
		// 0점 ~ 99점까지 임의의 점수를 주고싶어.
		for(int i = 0; i<100 ; i++) {
			System.out.println("점수 : "+(int)(Math.random()*100));
		}
		
	}

}
