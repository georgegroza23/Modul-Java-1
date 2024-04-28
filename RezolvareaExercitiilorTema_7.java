package modul1.lab7;

public class RezolvareaExercitiilorTema_7 {
	
	public static void arataRezolvareaExercitiului(int exercitiu) {
		switch(exercitiu) {
		case 1: 
			arataRezolvareaExercitiului_1();
			break;
		case 2:
			arataRezolvareaExercitiului_2();
			break;
		case 3:
			System.out.println("A se vedea clasa RelatiiObiecte");
			break;
		default:
			System.err.println("Exercitiul cu numarul " + exercitiu + " nu exista! Alegeti un exercitiu cuprins "
					+ "intre 1 si 3.");
			break;
		}
	}

	// EXERCITIUL 1:
	public static void arataRezolvareaExercitiului_1() {
		// Creare carti
		Carte twistedGames = new Carte("Twisted Games", "Epica", 464);
		Carte twistedHate = new Carte("Twisted Hate", "Epica", 512);
		Carte twistedLove = new Carte("Twisted Love", "Epica", 400);
		
		System.out.println("Afisare carti create:");
		System.out.println(twistedGames);
		System.out.println(twistedHate);
		System.out.println(twistedLove);
		System.out.println();
		
		// Creare autor:
		Autor anaHuang = new Autor("Ana Huang", 3);
		
		// Adaugare carti:
		anaHuang.adaugaCarte(twistedGames);
		anaHuang.adaugaCarte(twistedHate);
		anaHuang.adaugaCarte(twistedLove);

		// Afisare carti adaugate:
		System.out.println("Afisarea cartilor din tabloul Carti[]:");
		for (Carte carte : anaHuang.getCarti()) {
			if (carte != null) {
				System.out.println(carte);
			}
		}
		System.out.println();
		
		// Afisarea cartii cu cele mai multe pagini:
		Carte carte = anaHuang.returneazaCarteaCuMaximumDePagini();
		
		System.out.printf("Din colectia de carti afisata mai sus, cartea cu cele mai multe pagini este %s, de la "
				+ "editura %s, cu %d pagini. \n", carte.getTitlu(), carte.getEditura(), carte.getNumarPagini());
		System.out.println();
		
		// Returnarea unei carti dupa nume/titlu:
		System.out.println("Returneaza cartea cu numele Twisted Games: ");
		
		String nume = "Twisted Games";
		if (anaHuang.returneazaCartea("Twisted Games") != null) {
			System.out.println(anaHuang.returneazaCartea(nume));
		} else {
			System.err.println("Cartea cu numele " + nume + " nu exista in colectia data!");
		}
	}
	
	// EXERCITIUL 2:
	public static void arataRezolvareaExercitiului_2() {
		// Creare obiecte de tip NumarComplex:
		NumarComplex numarComplex1 = new NumarComplex(5, 8);
		NumarComplex numarComplex2 = new NumarComplex(25, 15);
		NumarComplex numarComplex3 = new NumarComplex(10, 20);
		
		// Afisarea numerelor complexe create si numarul total al acestora:
		System.out.println("Au fost create " + NumarComplex.getTotalNumereComplexe() + " numere complexe iar acestea "
				+ "sunt urmatoarele:");
		System.out.println(numarComplex1);
		System.out.println(numarComplex2);
		System.out.println(numarComplex3);
		System.out.println();
		
		// Calcularea modulului unui numar complex:
		System.out.println("Modulul numarului complex " + numarComplex1 + " este: " + numarComplex1.calculeazaModul());
		System.out.println();
		
		// Adunarea a doua numere complexe:
		System.out.println("Rezultatul adunarii numarului complex " + numarComplex1 + " cu numarul complex "
				+ numarComplex2 + " este " + numarComplex1.adunaNumereComplexe(numarComplex2) + ".");
	}
}
