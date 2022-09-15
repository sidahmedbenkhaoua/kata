package kata.movierental.model;

public abstract
class Movie{

    private String title;

    public
    Movie(String title){
        this.title = title;
    }


    public abstract
    double calculatePrice(int rentalDay);

    abstract int frequentRenterPoints();

    public
    String getTitle(){
        return title;
    }

    public
    void setTitle(String title){
        this.title = title;
    }

}
