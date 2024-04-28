package modul1.lab7;

public class CerintaExercitiiTema_7 {

	public static void arataCerintaExercitiului(int exercitiu) {
		switch (exercitiu) {
		case 1:
			arataCerintaExercitiului_1();
			break;
		case 2:
			arataCerintaExercitiului_2();
			break;
		case 3:
			arataCerintaExercitiului_3();
			break;
		default:
			System.err.println("Exercitiul cu numarul " + exercitiu + " nu exista! Alegeti un exercitiu cuprins "
					+ "intre 1 si 3.");
			break;
		}
	}
	
	private static void arataCerintaExercitiului_1() {
		String cerinta = """
				EXERCITIUL 1:
				  Construiti clasa Carte ce va avea urmatoarele caracteristici: un titlu, o editura si un numar de
				pagini. Mai exista clasa Autor, ce va avea un atribut nume si un vector de carti. Autorul ar trebui sa
				ofere pe langa posibilitatea setarii/preluarii acestor atribute si urmatoarele metode:
				- sa adauge o carte in lista sa de carti;
				- returnarea cartii cu numarul maxim de pagini;
				- returnarea unei carti cautata dupa nume. """;

		System.out.println(cerinta);
	}

	private static void arataCerintaExercitiului_2() {
		String cerinta = """
				EXERCITIUL 2:
				  Construiti o clasa NumarComplex ce simuleaza numerele complexe din matematica. Clasa va fi formata
				din:
				- doua atribute de tip double, pentru partea reala, repectiv partea imaginara;
				- un constructor pentru setarea acestor atribute;
				- o metoda de afisare a valorii unui numar complex de forma "real + i * imaginar toString()";
				- o metoda pentru afisarea a cate numere complexe au fost create;
				- o metoda de calcul a modulului unui numar complex unde formula in matematica este:
				"radical din real * real + imaginar * imaginar";
				- o metoda pentru adunarea a doua numere complexe. Metoda va avea ca parametru un obiect de tipul
				NumarComplex si va returna un alt obiect NumarComplex, obtinut prin insumarea partii reale a
				obiectului curent cu cel primit ca parametru si analog pentru parte imaginara. """;

		System.out.println(cerinta);
	}

	private static void arataCerintaExercitiului_3() {
		String cerinta = """
				EXERCITIUL 3:
				    Dati exemple de partOf:
				  - asociere;
				  - agregare;
				  - compozitie. """;

		System.out.println(cerinta);
	}
}
