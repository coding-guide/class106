package loop;

public class SumUntil10 {

	public static void main(String[] args) {
//		1 ~ 10������ �ձ��ϱ�
		int sum=0;
		for(int cnt = 1; cnt <= 9999; cnt++) {
			sum = sum + cnt;
		}
		System.out.println(sum);
	}

}
