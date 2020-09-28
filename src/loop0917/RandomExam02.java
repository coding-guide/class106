package loop0917;

public class RandomExam02 {
	public static void main(String[] args) {
//	주사위를 10번 던졌을 때 나오는 눈의 값을 나열하시오.
//	( Math.random()이용 )
		for(int i = 1; i<=10; i++) {
			System.out.println(i+"번째 주사위 눈값 : "+(int)(Math.random()*6)+1);
		}
	}
}
