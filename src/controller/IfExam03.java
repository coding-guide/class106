package controller;

import java.util.Scanner;

public class IfExam03 {

	public static void main(String[] args) {
//	해결과제 if~elseif문 이용하기
// 사용자로부터 순위를 입력받습니다
// 1, 2, 3, ....
// 1이면 "금메일", 2이면 "은메달", 3이면 "동메달", 
//	그외는 "수상하지 못했습니다"
//	를 출력하세요
		Scanner in = new Scanner(System.in);
		System.out.println("순위를 입력하세요>>>");
		int rank = in.nextInt();
//		여기부터 if~elseif문으로 문제해결하기
//		A와 B가 같으면? if(A==B)
		int money=0;
		
		if(rank == 1) {
			System.out.println("금메달입니다.");
			money = 1000000;
		}else if(rank==2) {
			System.out.println("은메달입니다.");
			money = 500000;
		}else if(rank==3) {
			System.out.println("동메달입니다.");
			money = 100000;
		}else {
			System.out.println("수상하지못하였습니다.");
		}//if ~ elseif
		System.out.println("상금은 "+money+"원 입니다.");
	}

}
