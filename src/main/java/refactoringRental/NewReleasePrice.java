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

	@Override
	public int getFrequentPoint(int daysRented1) {
		return daysRented1 > 1 ? 2 : 1;
	}
}
