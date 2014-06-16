package refactoringRental;

public abstract class Price {
	public abstract int getPriceCode();

	public abstract double getCharge(int daysRented);

	public int getFrequentPoint(int daysRented1) {

		return 1;
	}
}
