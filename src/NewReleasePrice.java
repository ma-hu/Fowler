/**
 * Created by markus on 29.04.16.
 */
class NewReleasePrice extends Price {
    double getCharge(int daysRented){
        return daysRented * 3;
    }
    int getPriceCode(){
        return Movie.NEW_RELEASE;
    }
}
