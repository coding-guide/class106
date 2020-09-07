package loop;

public class Gugudan {

	public static void main(String[] args) {
		System.out.println("=== 2단 ===");
		System.out.println(" 2 * 1 = "+2*1);
		System.out.println(" 2 * 2 = "+2*2);
		System.out.println(" 2 * 3 = "+2*3);
		System.out.println(" 2 * 4 = "+2*4);
		System.out.println(" 2 * 5 = "+2*5);
		System.out.println(" 2 * 6 = "+2*6);
		System.out.println(" 2 * 7 = "+2*7);
		System.out.println(" 2 * 8 = "+2*8);
		System.out.println(" 2 * 9 = "+2*9);
		
		System.out.println();
		System.out.println("=== 3단 ===");
		for(int gop = 1;gop <= 9;gop++) {
			System.out.println(" 3 * "+gop+" = "+3*gop);
		}
		
		System.out.println();
		System.out.println("=== 4단 ===");
		for(int gop = 1;gop <= 9;gop++) {
			System.out.println(" 4 * "+gop+" = "+4*gop);
		}
		
		System.out.println();
		System.out.println("=== 5단 ===");
		for(int gop = 1;gop <= 9;gop++) {
			System.out.println(" 5 * "+gop+" = "+5*gop);
		}
		
		for(int dan = 6; dan <=16;dan++) {
			System.out.println();
			System.out.println("=== "+dan+"단 ===");
			for(int gop = 1;gop <= 16;gop++) {
				System.out.println(dan+" * "+gop+" = "+dan*gop);
			}
			
		}
		
	}

}
