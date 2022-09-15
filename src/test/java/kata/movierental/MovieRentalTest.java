package kata.movierental;

import kata.movierental.model.*;
import kata.movierental.service.impl.ConsoleWriter;
import kata.movierental.service.impl.HtmlWriter;
import kata.movierental.service.Writer;
import org.junit.Assert;
import org.junit.Test;

public
class MovieRentalTest{


    @Test
    public
    void test(){
        Customer customer = new Customer("John");
        customer.addRental(new Rental(new MovieNewRelease("un_titre_a") , 4));
        customer.addRental(new Rental(new MovieNewRelease("un_titre_b") , 3));
        customer.addRental(new Rental(new MovieChildren("un_titre_c") , 1));
        Writer consoleWriter = new ConsoleWriter();
        Writer htmlWriter = new HtmlWriter();
        String expectedConsoleString = "Rental Record for John\n" +
                "\tun_titre_a\t12.0\n" +
                "\tun_titre_b\t9.0\n" +
                "\tun_titre_c\t1.5\n" +
                "Amount owed is 22.5\n" +
                "You earned 2 frequent renter points";

        String expectedHtmlString = "<h1>Rental Record for <em>John</em></h1>\n" +
                "<table>\n" +
                "\t<tr><td>un_titre_a</td><td>12.0</td></tr>\n" +
                "\t<tr><td>un_titre_b</td><td>9.0</td></tr>\n" +
                "\t<tr><td>un_titre_c</td><td>1.5</td></tr>\n" +
                "</table>\n" +
                "<p>Amount owed is 22.5</p>\n" +
                "You earned <em>2</em> frequent renter points\n";

        Assert.assertEquals(consoleWriter.write(customer) , expectedConsoleString);
        Assert.assertEquals(htmlWriter.write(customer) , expectedHtmlString);
    }
}
