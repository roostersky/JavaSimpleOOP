import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// Simple text 
		System.out.println("CARS TABLE LIST ");
		System.out.println(" ");

		// Creat car objects
		Car car1 = new Car(475490, '£', 564345, "Sence", "Fiat", "French");
		Car car2 = new Car(764435, '$', 566545, "Reno", "Duster", "French");
		Car car3 = new Car(764435, '₴', 566545, "Reno", "Duster", "French");
		Car car4 = new Car(764435, '£', 566545, "Reno", "Duster", "French");
		Car car5 = new Car(764435, '£', 566545, "Reno", "Duster", "French");
		Car car6 = new Car(764435, '₴', 566545, "Reno", "Duster", "French");
		Car car7 = new Car(764435, '$', 566545, "Reno", "Duster", "French");
		
		// Creat carList
		ArrayList<Car> carList = new ArrayList<>();
		
		// Add car object to carList
		carList.add(car1);
		carList.add(car1);
		carList.add(car1);
		carList.add(car1);
		carList.add(car1);
		carList.add(car1);
		carList.add(car1);
		
		
		// Show info about cars from carList
		for (int i = 0; i < carList.size(); i++) {
			carList.get(i).showInfoAboutCar();
		}

		
	}

}
