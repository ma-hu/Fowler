public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private Price _price;
    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        // Replace Type Code with State/Strategy.
        setPriceCode(newpriceCode);
    }
    public int getPriceCode() {
        return _price.getPriceCode();
    }
    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrenPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }
    public String getTitle (){
        return title;
    };

    //move method -> getCharge from rental to movie
    double getCharge(int daysRented) {
        double result = 0;
        switch (getPriceCode()) {
            case REGULAR:
                result += 2;
                if (daysRented > 2)
                    result += (daysRented - 2) * 1.5;
                break;
            case NEW_RELEASE:
                result += daysRented * 3;
                break;
            case CHILDRENS:
                result += 1.5;
                if (daysRented > 3)
                    result += (daysRented - 3) * 1.5;
                break;
        }
        return result;
    }

    //move method -> getFrequentRenterPoints from rental to movie
    int getFrequentRenterPoints(int daysRented) {
        if ((getPriceCode() == NEW_RELEASE) && daysRented > 1)
            return 2;
        else
            return 1;
    }
}