package kata.movierental.model;

public
class MovieNewRelease extends Movie{
    public final static int PRICE = 1;


    public
    MovieNewRelease(String title){
        super(title);
    }

    @Override
    public
    double calculatePrice(int rentalDay){
        return rentalDay * 3;
    }

    @Override
    int frequentRenterPoints(){
        return 1;
    }
}
