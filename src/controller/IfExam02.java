package controller;

import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {
//		8살 미만
//		8살~13살 :초등
//		14살~16살 : 중등
//		17살~19살 : 고등
//		20살 이상 : 성인
		Scanner in = new Scanner(System.in);
		System.out.println("나이를 입력하세요>>>");
		int age = in.nextInt();
		if(age < 8) {
			System.out.println("취학 전 아동입니다.");
			// else는 age>=8 라는 조건을 품고 있다.
		}else if( age <= 13) {
			//8 <= age <= 13	
			System.out.println("초등학생 입니다.");
			// else로 인해 생긴 조건 : age > 13			
		}else if(age <= 16) {
			System.out.println("중학생입니다.");
		}else if(age <= 19) {
			System.out.println("고등학생입니다.");
		}else {
			// age > 19
			System.out.println("성인입니다.");
		}

	}

}
