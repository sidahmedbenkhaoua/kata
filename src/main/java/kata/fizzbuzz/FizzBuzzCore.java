package kata.fizzbuzz;

import kata.fizzbuzz.proecssor.FizzBuzzProcessor;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * class core for fizzbuzz
 */
public
class FizzBuzzCore{


    public static
    String[] process(String[] array){

        return Arrays.asList(array).stream().map(FizzBuzzProcessor::process).
                collect(Collectors.toList()).toArray(new String[0]);
    }


}
