package loop;

public class UntilSumN {

	public static void main(String[] args) {
//      자연수를 1부터 계속해서 더해나가다가 
//		100,000이 넘어가는 순간 for문을 종료하고 
//		마지막으로 더해진 값을 구하여라
		
//		1+2+3+... 이것을 반복문으로 만듭니다.
//		더한 결과를 비교를 해야되겠지??
//		더한 결과가 100000이상이될때의 자연수 N의 값을 찾아라.
		
		int sum = 0; //sum은 더한 결과를 갖고있는 변수
		int number = 0; // number는 자연수를 카운트할 변수
// 5까지의 합은 15임요. --> 14 넘어가는 순간의 number값은?? 5
		for(;;) {
			number++;
			sum = sum + number;
//			System.out.println(number);
			if(sum > 100000) { // 합한결과가 100000가 되는 수간 반복문을 끝냄.
				break;     // 이때까지의 sum과 number의 값이 남음.
			}
		}//for
		System.out.println("number값 : "+number);
		System.out.println("number까지의 sum값 : "+sum);
	}
}
