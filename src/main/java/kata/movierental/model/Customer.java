package kata.movierental.model;

import java.util.ArrayList;
import java.util.List;

public
class Customer{

    private String       name;
    private List<Rental> rentals;

    public
    Customer(String name){
        this.name = name;
    }

    public
    void addRental(Rental rental){
        if (this.rentals == null) {
            this.rentals = new ArrayList<>();
        }

        this.rentals.add(rental);
    }

    public
    String getName(){
        return name;
    }

    public
    void setName(String name){
        this.name = name;
    }

    public
    List<Rental> getRentals(){
        return rentals;
    }

    public
    void setRentals(List<Rental> rentals){
        this.rentals = rentals;
    }

    public
    double getTotal(){
        return this.rentals.stream().mapToDouble(Rental::calculatedPrice).sum();
    }

    public
    int getTotalPoints(){
        return this.rentals.stream().mapToInt(Rental::calculatedPoint).sum();
    }
}
