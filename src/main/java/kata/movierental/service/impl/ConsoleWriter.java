package kata.movierental.service.impl;

import kata.movierental.model.Customer;
import kata.movierental.model.Rental;
import kata.movierental.service.Writer;

public
class ConsoleWriter implements Writer{
    private Customer customer;

    @Override
    public
    String write(Customer customer){
        this.customer = customer;
        String result = "Rental Record for " + getName() + "\n";
        for (Rental each : this.customer.getRentals()) {
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getMovie().calculatePrice(each.getDaysRented())) +
                    "\n";
        }

        result += "Amount owed is " + String.valueOf(this.customer.getTotal()) + "\n";

        result += "You earned " + String.valueOf(this.customer.getTotalPoints()) + " frequent renter points";

        return result;
    }


    private
    String getName(){
        return this.customer.getName();
    }
}
