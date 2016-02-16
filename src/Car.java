// Car class
public class Car {

	// Variables
	int price;
	int carNumber;
	int counter;
	static int count;
	char valute;
	String model;
	String company_creator;
	String country_creator;

	// getPrice
	public int getPrice() {
		return price;
	}

	// getNumber
	public int getNumber() {
		return carNumber;
	}

	// getCounter
	public int getCounter() {
		return counter;
	}

	// getValute
	public char getValute() {
		return valute;
	}

	// getModel
	public String getModel() {
		return model;
	}

	// getCompany_creator
	public String getCompany_creator() {
		return company_creator;
	}

	// getCountry_creator
	public String getCountry_creator() {
		return country_creator;
	}

	// Constructor
	public Car(int price, char valute, int carNumber, String company_creator, String model, String country_creator) {
		this.price = price;
		this.carNumber = carNumber;
		this.counter = counter;
		this.model = model;
		this.valute = valute;
		this.company_creator = company_creator;
		this.country_creator = country_creator;
		count++;
		counter = count;

	}

	// Show info about cars VOID
	public void showInfoAboutCar() {
		System.out.println(counter + ") CREATOR " + company_creator + " MODEL " + model + " COUNTRY " + country_creator
				+ " CAR NUMBER " + carNumber + " PRICE " + price + " " + valute);
	}

	// Show info about cars STRING
	public String showInfoAboutCarString() {
		return counter + ") CREATOR " + company_creator + " MODEL " + model + " COUNTRY " + country_creator
				+ " CAR NUMBER " + carNumber + " PRICE " + price + " " + valute + "\n";

	}

}
