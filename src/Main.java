import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// Simple text 
		System.out.println("CARS TABLE LIST ");
		System.out.println(" ");

		// Create car objects
		Car car1 = new Car(3000, '£', 5643445, "Doblo", "Fiat", "French");
		Car car2 = new Car(25000, '$', 3404390, "BMW", "X5", "Germany");
		Car car3 = new Car(90000, '₴', 9437249, "Reno", "Duster", "French");
		Car car4 = new Car(5000, '£', 7324924, "Wolksvagen", "Touran", "Germany");
		Car car5 = new Car(7000, '£', 1246893, "Reno", "Fluence", "French");
		Car car6 = new Car(200000, '₴', 9325453, "Wolksvagen", "Touareg", "Germany");
		Car car7 = new Car(40000, '$', 5324363, "Cadillac", "Escalade", "USA");
		
		// Create carList
		ArrayList<Car> carList = new ArrayList<>();
		
		// Add car object to carList
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		carList.add(car4);
		carList.add(car5);
		carList.add(car6);
		carList.add(car7);
		
		
		// Show info about cars from carList
		for (int i = 0; i < carList.size(); i++) {
			carList.get(i).showInfoAboutCar();
			
		}

		
	}

}
