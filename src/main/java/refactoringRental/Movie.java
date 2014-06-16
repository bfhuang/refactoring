package refactoringRental;

public class Movie {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDREN = 2;

    private String title;

	Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.initializePrice(priceCode);
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void initializePrice(int priceCode) {
	    switch (priceCode) {
		    case REGULAR:
			    price = new RegularPrice();
			    break;
		    case CHILDREN:
			    price = new ChildPrice();
			    break;
		    case NEW_RELEASE:
			    price = new NewReleasePrice();
			    break;
		    default:
			    throw new IllegalArgumentException("Illegal price code");
	    }
    }

    public String getTitle() {
        return title;
    }

	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);

	}

	public int getFrequentPoint(int daysRented) {
	    return price.getFrequentPoint(daysRented);
	}
}
