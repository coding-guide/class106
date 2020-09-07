package loop;

public class ABC {

	public static void main(String[] args) {
// 알파벳 a ~ z까지 출력하시오.
//		문자를 저장하는 자료형 char <= 문자에 해당하는 코드값을 갖고있음
		for(char ch = 'a'; ch <= 'z';ch++) {
			System.out.print(ch);
		}
		System.out.println();
//		대문자 A ~ Z까지 출력하기
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch);
		}
	}

}
