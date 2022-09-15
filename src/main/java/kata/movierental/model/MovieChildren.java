package kata.movierental.model;

public
class MovieChildren extends Movie{


    public
    MovieChildren(String title){
        super(title);
    }

    @Override
    public
    double calculatePrice(int rentalDay){
        double total = 1.5d;
        if (rentalDay > 3) {
            total += (rentalDay - 3) * 1.5;
        }
        return total;
    }

    @Override
    int frequentRenterPoints(){
        return 0;
    }
}
