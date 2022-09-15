package kata.movierental.model;

public
class Rental{

    private Movie movie;
    private int   daysRented;

    public
    Rental(Movie movie , int daysRented){
        this.movie = movie;
        this.daysRented = daysRented;
    }


    public
    Movie getMovie(){
        return movie;
    }

    public
    void setMovie(Movie movie){
        this.movie = movie;
    }

    public
    int getDaysRented(){
        return daysRented;
    }

    public
    void setDaysRented(int daysRented){
        this.daysRented = daysRented;
    }

    protected
    double calculatedPrice(){
        return this.movie.calculatePrice(this.daysRented);
    }

    protected
    int calculatedPoint(){
        return this.movie.frequentRenterPoints();
    }
}
