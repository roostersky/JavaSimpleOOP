
public class Car {

	// Variables
	int price;
	int number;
	int counter;
	String model;
	String company_creator;
	String country_creator;

	public static void main(String[] args) {

	}
	
	// getPrice
	public int getPrice() {
		return price;
	}

	// getNumber
	public int getNumber() {
		return number;
	}

	// getCounter
	public int getCounter() {
		return counter;
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
	public Car(int price, int number, int counter, String model, String company_creator, String country_creator) {
		this.price = price;
		this.number = number;
		this.counter = counter;
		this.model = model;
		this.company_creator = company_creator;
		this.country_creator = country_creator;

	}
	
	

}
