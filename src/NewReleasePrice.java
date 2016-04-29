/**
 * Created by markus on 29.04.16.
 */
abstract class NewReleasePrice extends Price {
    int getPriceCode(){
        return Movie.NEW_RELEASE;
    }
}
