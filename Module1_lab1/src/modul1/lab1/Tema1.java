package modul1.lab1;

import java.lang.Math;

public class Tema1 {
	
	/** EXERCITIUL 1: Afisati mesajul "Incep tema";
	 ** EXERCITIUL 2: Afisati mesajul "Incep tema" prin salvarea acestui String intr-o variabila;
	 ** EXERCITIUL 3: Declarati doua variabile @x si @y, de tip intreg, apoi stocati rezultatul intr-o variabila @suma. Afisati rezultatul pe ecran;
	 ** EXERCITIUL 4: Folosind aceeasi variabila, afisati mesajul "Suma este:", urmat de rezultatul sumei; 
	 ** EXERCITIUL 5: Calculati minimul a doua numere si afisati rezultatul;
	 ** EXERCITIUL 6: Calculati minimul a trei numere si afisati rezultatul;
	 ** EXERCITIUL 7: Realizati impartirea a doua numere de tipul @double si afisati rezultatul pe ecran;
	 ** EXERCITIUL 8: Construiti un caz in care sa afisati trei mesaje pe ecran prin utilizarea if-else if-else;
	 ** EXERCITIUL 9: Afisati, pe ecran, numerele de la 10 la 1, cu @while;
	 ** EXERCITIUL 10: Afisati, pe ecran, de 7 ori, textul "Afara e soare", cu @while; */

	public static void main(String[] args) {
		
		/** @EXERCITIUL 1: */
		System.out.println("--------REZOLVAREA EXERCITIULUI 1--------");
		
		System.out.println("Incep tema");
		
		System.out.println(); // adauga spatiu intre exercitii
		
		/** @EXERCITIUL 2: */
		System.out.println("--------REZOLVAREA EXERCITIULUI 2--------");
		
		String mesaj = "Incep tema";
		System.out.println(mesaj);
		
		System.out.println(); 
		
		/** @EXERCITIUL 3: */
		System.out.println("--------REZOLVAREA EXERCITIULUI 3--------");
		
		int x = 29;
		int y = 47;
		int suma = x + y;
		System.out.println(x + " + " + y + " = " + suma);
		
		System.out.println(); 
		
		/** @EXERCITIUL 4: */
		System.out.println("--------REZOLVAREA EXERCITIULUI 4--------");
		
		System.out.println("Suma este " + suma + ".");
		
		System.out.println(); 
		
		/** @EXERCITIUL 5: */
		System.out.println("--------REZOLVAREA EXERCITIULUI 5--------");
		
		int numar1 = 12856;
		int numar2 = 145263;
		int minimum = 0;
		
		// Aflarea minimului folosind nested if-else:
		if (!(numar1 == numar2)) {
			if (numar1 < numar2) {
				minimum = numar1;
				System.out.println("Minimul dintre " + numar1 + " si " + numar2 + " este " + minimum);
			} else {
				minimum = numar2;
				System.out.println("Minimul dintre " + numar1 + " si " + numar2 + " este " + minimum);
			}
		} else {
			System.out.println("Numerele date sunt egale");
		}
		
		// Aflaream minimului folosind metoda statica min() a clasei Math din pachetul java.lang;
		if (!(numar1 == numar2)) {
			minimum = Math.min(numar1, numar2);
			System.out.println("Minimul dintre " + numar1 + " si " + numar2 + " este " + minimum);
		} else {
			System.out.println("Numerele date sunt egale");
		}
		
		System.out.println();
		
		/** @EXERCITIUL 6: */
		System.out.println("--------REZOLVAREA EXERCITIULUI 6--------");
		
		int numar3 = 15;
		int numar4 = 14;
		int numar5 = 12;
		
		// Aflarea minimului  combinand ternary-if cu if-else:
		minimum = (numar3 <= numar4)? numar3 : numar4;
		
		if (minimum <= numar5) {
			System.out.println("Minimul dintre " + numar3 + ", " + numar4 + " si " + numar5 + " este " + minimum);
		} else {
			System.out.println("Minimul dintre " + numar3 + ", " + numar4 + " si " + numar5 + " este " + numar5);
		}
		
		System.out.println(); 
		
		/** @EXERCITIUL 7: */
		System.out.println("--------REZOLVAREA EXERCITIULUI 7--------");
		
		double numarDouble1 = 22.35;
		double numarDouble2 = 13.12;
		double impartire = numarDouble1 / numarDouble2;
		System.out.println(numarDouble1 + " / " + numarDouble2 + " = " + impartire);
		
		System.out.println();
		
		/** @EXERCITIUL 8: */
		System.out.println("--------REZOLVAREA EXERCITIULUI 8--------");
		
		String culoareSemafor = "verde";
		
		if (culoareSemafor.equalsIgnoreCase("verde")) {
			System.out.println("Culoarea semforului este verde. Puteti traversa.");
		} else if (culoareSemafor.equalsIgnoreCase("galben")) {
			System.out.println("Culoarea semaforului este galben. Grabiti pasul.");
		} else if (culoareSemafor.equalsIgnoreCase("rosu")) {
			System.out.println("Culoarea semaforului este rosu. Nu traversati.");
		} else {
			System.out.println("Culoarea " + culoareSemafor + " nu este o culoare a semaforului.");
		}
		
		System.out.println();
		
		/** @EXERCITIUL 9: */
		System.out.println("--------REZOLVAREA EXERCITIULUI 9--------");
		
		int cronometru = 10;
		while (cronometru != 0) {
			System.out.println(cronometru + " ");
			
			cronometru--;
		}
		
		System.out.println();
		
		/** @EXERCITIUL 10: */
		System.out.println("--------REZOLVAREA EXERCITIULUI 10--------");
		
		cronometru = 0;
		while (cronometru < 7) {
			System.out.println("Afara e soare");
			
			cronometru++;
		}
	}

}
