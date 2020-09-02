package controller;

public class SwitchExam03 {

	public static void main(String[] args) {
		// g : ±Ýµµ³¢, s : Àºµµ³¢, b : ¼èµµ³¢ , ±×¿Ü¹®ÀÚ : µµ³¢°¡ ¾Æ´Õ´Ï´Ù.
		char ch='s';
		switch(ch) {
		case 'g':
			System.out.println("±Ýµµ³¢ÀÔ´Ï´Ù.");
			break;
		case 's':
			System.out.println("Àºµµ³¢ÀÔ´Ï´Ù.");
			break;
		case 'b':
			System.out.println("¼èµµ³¢ÀÔ´Ï´Ù.");
			break;
		default:
			System.out.println("µµ³¢°¡ ¾Æ´Õ´Ï´Ù.");
		}
	}

}
