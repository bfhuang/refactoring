package refactoringRental;

public class Movie {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDREN = 2;

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int arg) {
        priceCode = arg;
    }

    public String getTitle() {
        return title;
    }

	public double getCharge(int daysRented1) {
		double thisAmount = 0;
		switch (priceCode) {
			case REGULAR:
				thisAmount += 2;
				if (daysRented1 > 2)
					thisAmount += (daysRented1 - 2) * 1.5;
				break;
			case NEW_RELEASE:
				thisAmount += daysRented1 * 3;
				break;
			case CHILDREN:
				thisAmount += 1.5;
				if (daysRented1 > 3)
					thisAmount += (daysRented1 - 3) * 1.5;
				break;
		}
		return thisAmount;
	}
}
