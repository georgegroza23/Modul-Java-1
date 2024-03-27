package modul1.lab1;

public class Main1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 3;
		
		if (a >= b && a >= c) {
			System.out.println("Maximum dintre " + a + ", " + b + " si " + c + " este " + a + ".");
		} else if (b >= a && b >= c) {
			System.out.println("Maximum dintre " + a + ", " + b + " si " + c + " este " + b + ".");
		} else {
			System.out.println("Maximum este " + c);
		}
	}

}
