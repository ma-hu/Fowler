/**
 * Created by markus on 29.04.16.
 */
abstract class Price {
    abstract int getPriceCode();

    //make method abstact
   abstract double getCharge(int daysRented);
}
