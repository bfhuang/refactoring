package refactoringRental;

import static refactoringRental.Movie.CHILDREN;

public class ChildPrice extends Price {
	@Override
	public int getPriceCode() {
		return CHILDREN;
	}

	@Override
	public double getCharge(int daysRented) {
		double thisAmount = 1.5;
		if (daysRented > 3)
			thisAmount += (daysRented - 3) * 1.5;

		return thisAmount;
	}
}
