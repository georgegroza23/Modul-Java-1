package modul1.lab7;

public class Carte {
	private String titlu;
	private String editura;
	private int numarPagini;
	
	public Carte() {
		this.titlu = getTitlu();
		this.editura = getEditura();
		this.numarPagini = getNumarPagini();
	}
	
	public Carte(String titlu, String editura, int numarPagini) {
		this.titlu = titlu;
		this.editura = editura;
		this.numarPagini = numarPagini;
	}
	
	// SETTERS:
	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	
	public void setEditura(String editura) {
		this.editura = editura;
	}
	
	public void setNumarPagini(int numarPagini) {
		this.numarPagini = numarPagini;
	}
	
	// GETTERS:
	public String getTitlu() {
		return titlu;
	}
	
	public String getEditura() {
		return editura;
	}
	
	public int getNumarPagini() {
		return numarPagini;
	}
	
	@Override
	public String toString() {
		return  this.titlu + "\t| Editura: " + this.editura + "\t| Numar pagini: " + this.numarPagini;
	}
}
