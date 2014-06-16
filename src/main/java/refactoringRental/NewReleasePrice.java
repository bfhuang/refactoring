package refactoringRental;

import static refactoringRental.Movie.NEW_RELEASE;

public class NewReleasePrice extends Price {
	@Override
	public int getPriceCode() {
		return NEW_RELEASE;
	}

	@Override
	public double getCharge(int daysRented) {
		return daysRented * 3;
	}
}
