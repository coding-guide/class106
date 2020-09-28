package loop0917;

import java.util.Scanner;

public class ForExam09 {

	public static void main(String[] args) {
		// 사용자가 정수 N을 입력하면 N까지 2의 배수의 
		// 개수와 합을 구하시오.
		Scanner in = new Scanner(System.in);
		System.out.println("숫자 n을 입력하세요>>>>");
		int inputN = in.nextInt();
		int cnt=0, sum=0;
		System.out.println("====="+inputN+"까지의 2의 배수 =====");
		for(int i = 1; i<=inputN; i++) {
			if(i%2==0) {//2의 배수
				System.out.print(i+" ");
				cnt = cnt + 1; // cnt += 1; 또는 cnt++;
				sum = sum + i; // sum += i;
			}
		}
		System.out.println();
		System.out.println(inputN+"까지의 2의 배수의 개수 :"+cnt);
		System.out.println(inputN+"까지의 2의 배수의 합 :"+sum);
		
	}

}
