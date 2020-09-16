package loop0916;

public class ForExam05 {

	public static void main(String[] args) {
		// 1~ 50사이의 정수 중 2의 배수만을 출력합니다. continue사용
		for(int i = 1; i <= 50 ; i++) {
			if(i%2==0) {//짝수라는 뜻
				System.out.println("짝수 : "+i);
			}else {
				// 아무것도 처리하지 않습니다.
				// continue를 작성하면 이 문장 아래에 있는 실행문을 실행하지 않고 반복문 처음으로 분기합니다.
				continue; 
			}
			System.out.println("***************************");
		}

	}

}
