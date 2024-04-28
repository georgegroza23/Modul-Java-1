package modul1.lab7;

import java.util.Arrays;

public class Autor {
	private String nume;
	private Carte[] carti;
	private int index = 0;
	
	public Autor(String nume, int totalCarti) {
		this.nume = nume;
		carti = new Carte[totalCarti];
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void setCarti(Carte[] carti) {
		this.carti = carti;
	}
	
	public String getNume() {
		return nume;
	}
	
	public Carte[] getCarti() {
		return carti;
	}
	
	public void adaugaCarte(Carte carte) {
		carti[index] = carte;
		
		index++;
	}
	
	public Carte returneazaCarteaCuMaximumDePagini() {
		Carte carte  = null;
		int maxPages = carti[0].getNumarPagini();
		
		for (int i = 1; i < carti.length && carti[i] != null; i++) {
			if (carti[i].getNumarPagini() > maxPages) {
				maxPages = carti[i].getNumarPagini();
				carte = carti[i];
			}
		}

		return carte;
	}
	
	public Carte returneazaCartea(String nume) {
		Carte carte = null;
		
		for (int i = 0; i < carti.length && carti[i] != null; i++) {
			if (carti[i].getTitlu().equalsIgnoreCase(nume)) {
				carte = carti[i];
			}
		}
		
		return carte;
	}
	
	@Override
	public String toString() {
		return "Nume autor: " + this.nume + "Carti: " + Arrays.toString(getCarti());
	}
}
