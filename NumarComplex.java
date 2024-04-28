package modul1.lab7;

public class NumarComplex {
	private double real;
	private double imaginar;
	private static int totalNumereComplexe = 0;
	
	public NumarComplex(double real, double imaginar) {
		this.real = real;
		this.imaginar = imaginar;
		totalNumereComplexe++;
	}
	
	public void setReal(double real) {
		this.real = real;
	}
	
	public void setImaginar(double imaginar) {
		this.imaginar = imaginar;
	}
	
	public double getReal() {
		return real;
	}
	
	public double getImaginar() {
		return imaginar;
	}
	
	public static int getTotalNumereComplexe() {
		return totalNumereComplexe;
	}
	
	public double calculeazaModul() {
		return Math.sqrt((real * real) + (imaginar * imaginar));
	}
	
	public NumarComplex adunaNumereComplexe(NumarComplex numarComplex) {
		double parteReala = this.real + numarComplex.getReal();
		double parteImaginara = this.imaginar + numarComplex.getImaginar();
		
		return new NumarComplex(parteReala, parteImaginara);
	}
	
	@Override
	public String toString() {
		return this.real + " + " + this.imaginar + "i";
	}
}
