package kata.movierental.model;

public
class MovieRegular extends Movie{
    public final static int PRICE = 0;


    public
    MovieRegular(String title){
        super(title);
    }

    @Override
    public
    double calculatePrice(int rentalDay){
        double thisAmount = 2;

        if (rentalDay > 2)

            thisAmount += (rentalDay - 2) * 1.5;

        return thisAmount;
    }

    @Override
    int frequentRenterPoints(){
        return 0;
    }
}
