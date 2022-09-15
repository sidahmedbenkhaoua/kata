package kata.fizzbuzz.proecssor;

import kata.fizzbuzz.evaluator.*;
import kata.fizzbuzz.validator.FizzBuzzInputValidator;
import kata.fizzbuzz.validator.NumberValidator;

import java.util.Arrays;
import java.util.List;

/**
 * class processor for start all evaluator check for any number in input
 */
public
class FizzBuzzProcessor{
    //order is important
    protected static final List<Evaluator> evaluatorList = Arrays.asList(
            new MultipleOfFiveAndThreeEvaluator() ,
            new MultipleOfFiveEvaluator() ,
            new MultipleOfThreeEvaluator() ,
            new DefaultEvaluator());

    private static NumberValidator fizzBuzzInputValidator = new FizzBuzzInputValidator();

    /**
     * method to check number if is multiple of 3 or 5 or 5 and 3 with multiple evaluators list
     *
     * @param value
     * @return
     */
    public static
    String process(String value){
        System.out.println("process value " + value);
        if (fizzBuzzInputValidator.isValid(value)) {
            final Evaluator evaluatorOptional = evaluatorList.stream().
                    filter(evaluator -> evaluator.evaluate(fizzBuzzInputValidator.validatePerform())).
                    findFirst().orElseThrow(RuntimeException::new);

            return evaluatorOptional.evaluatePerform();
        }

        throw new RuntimeException(String.format("Input %s is not valid number" , value));
    }
}
