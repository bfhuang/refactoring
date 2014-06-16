package refactoringRental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<Rental>();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental arg) {
		rentals.add(arg);
	}

	public String getName() {
		return name;
	}

	public String statement() {
		String result = "Rental Record for " + getName() + "\n";

		for (Rental each : rentals) {
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
		}

		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentPoint()) +
				" frequent renter points";

		return result;
	}

	private double getTotalCharge() {
		double totalCharge = 0;
		for (Rental each : rentals) {
			totalCharge += each.getCharge();
		}
		return totalCharge;
	}

	private int getTotalFrequentPoint() {
		int frequentRenterPoints = 0;
		for (Rental each : rentals) {

			frequentRenterPoints += each.getFrequentPoint();
		}
		return frequentRenterPoints;
	}

}
