package kata.movierental.service.impl;

import kata.movierental.model.Customer;
import kata.movierental.model.Rental;
import kata.movierental.service.Writer;

public
class HtmlWriter implements Writer{

    private Customer customer;

    /**
     * c>Rental Record for <em>martin</em></h1>
     * <table>
     *   <tr><td>Ran</td><td>3.5</td></tr>
     *   <tr><td>Trois Couleurs: Bleu</td><td>2</td></tr>
     * </table>
     * <p>Amount owed is c5.5</em></p>
     * <p>You earned <em>2</em> frequent renter points</p>
     *
     * @param customer
     * @return
     */

    @Override
    public
    String write(Customer customer){
        this.customer = customer;
        String result = "<h1>Rental Record for " + "<em>" + getName() + "</em>" + "</h1>" + "\n";
        result += "<table>" + "\n";
        for (Rental each : this.customer.getRentals()) {
            result += "\t" + "<tr>"
                    + "<td>" + each.getMovie().getTitle() + "</td>"
                    + "<td>" + String.valueOf(each.getMovie().calculatePrice(each.getDaysRented())) + "</td>"
                    + "</tr>" + "\n";
        }

        result += "</table>" + "\n";

        result += "<p>" + "Amount owed is " + String.valueOf(this.customer.getTotal()) + "</p>" + "\n";


        result += "You earned " + "<em>" + String.valueOf(this.customer.getTotalPoints()) + "</em>" + " frequent " +
                "renter points" + "\n";

        return result;
    }


    private
    String getName(){
        return this.customer.getName();
    }
}
