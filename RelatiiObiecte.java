package modul1.lab7;

import java.util.Random;

public class RelatiiObiecte {
	public static void main(String[] args) {
		// Creare obiect de tip TransportCompany
		TransportCompany atlas = new TransportCompany("Atlas", 150000000);
		
		// Creare obiecte de tip Car
		Car car1 = new Car("Mercedes", "Transporter");
		Car car2 = new Car("Dacia", "Taxi");
		Car car3 = new Car("BMW", "Courier");
		
		// Adaugare masini in tabloul de masini al companiei Atlas:
		atlas.addCar(car1);
		atlas.addCar(car2);
		atlas.addCar(car3);
		
		// Creare obiecte de tip Driver
		Driver driver1 = new Driver("Jon", 32, 5);
		Driver driver2 = new Driver("Cosmin", 58, 20);
		Driver driver3 = new Driver("Paul", 26, 6);
		
		// Adaugare soferi in tabloul de soferi al companiei Atlas:
		atlas.setIndex(0);
		atlas.hireDriver(driver1);
		atlas.hireDriver(driver2);
		atlas.hireDriver(driver3);
		
		System.out.println("Afisare detalii companie:");
		System.out.println(atlas);
	}
}

class TransportCompany {
	// FIELDS
	private Cui cui;
	private String name;
	private int capital;
	
	/** Agregare: -> @TransportCompany are un numar de masini si un numar de soferi. Ciclul de viata al obiectelor 
	 * de tip @Car, @Driver si @TransportCompany nu este strans legat insemnand ca distrugerea unui obiect nu va 
	 * afecta celelalte obiecte. */
	private Car[] cars = new Car[3];
	private Driver[] drivers = new Driver[3];
	
	private int index = 0;
	
	// CONSTRUCTORS
	public TransportCompany(String name, int capital) {
		/** Compozitie: -> Obiectul de tip @Cui este creat doar atunci cand un obiect de tip @TransportCompany este 
		 * creat. Obiectul de tip @Cui nu poate exista fara un obiect de tip @TransportCompany. Odata ce obiectul de 
		 * tip @TransportCompany este distrus si obiectul de tip @Cui va fi distrus.*/
		cui = new Cui();
		
		this.name = name;
		this.capital = capital;
	}

	// SETTERS
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCapital(int capital) {
		this.capital = capital;
	}
	
	public void setCars(Car[] cars) {
		this.cars = cars;
	}
	
	public void setDriver(Driver[] drivers) {
		this.drivers = drivers;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	// GETTERS:
	public Cui getCui() {
		return cui;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCapital() {
		return capital;
	}
	
	public Car[] getCars() {
		return cars;
	}
	
	public Driver[] getDrivers() {
		return drivers;
	}
	
	public int getIndex() {
		return index;
	}
	
	// OPERATIONS:
	/** Asociere -> relatia de asociere este data de metoda @addCar prin care un obiect de tip @Car este asociat 
	 * clasei @CarCompany. */
	public void addCar(Car car) {
		cars[index] = car;
		
		index++;
	}
	
	/** Asociere -> relatia de asociere este data de metoda @hireDriver prin care un obiect de tip @Driver este 
	 * asociat clasei @CarCompany*/ 
	public void hireDriver(Driver driver) {
		drivers[index] = driver;
		
		index++;
	}
	
	private static String printArray(Object[] objects) {
		String str = "";
		for (Object object : objects) {
			str += object + " ";
		}
		
		return str;
	}
	
	@Override()
	public String toString() {
		return "|Transport Company Name: " + name + "| CUI: " + getCui() + "| Capital: " + capital + "\n Drivers: " 
				+ printArray(getDrivers()) + "\n Cars: " + printArray(cars) + "|";
	}
}

class Car {
	private String model;
	private String type;
	
	public Car(String name, String type) {
		this.model = name;
		this.type = type;
	}
	
	public void setName(String name) {
		this.model = name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getName() {
		return model;
	}
	
	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return "|Car Name: " + this.model + ", Car Type: " + this.type;
	}
}

class Driver {
	// FIELDS
	private String name;
	private int age;
	private int experience;
	
	// CONSTRUCTORS
	public Driver(String name, int age, int experience) {
		this.name = name;
		this.age = age;
		this.experience = experience;
	}
	
	// SETTERS
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	// GETTERS:
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getExperience() {
		return experience;
	}
	
	// OPERATIONS
	public String signContractWith(TransportCompany transportCompany) {
		return "You successfully signed the contract with the car company " + transportCompany;
	}
	
	@Override
	public String toString() {
		return "|Driver Name: " + this.name + ", Driver Age: " + this.age + ", Driver Experience: " + this.experience 
				+ "|";
	}
}

class Cui {
	private static final int CUI = new Random().nextInt(10_000_000) + 10_000_000;
	
	public int getCUI() {
		return CUI;
	}
	
	@Override
	public String toString() {
		return "" + CUI;
	}
}
