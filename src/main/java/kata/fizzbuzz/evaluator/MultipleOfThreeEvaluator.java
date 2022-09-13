package kata.fizzbuzz.evaluator;

/**
 * evaluator test if number is multiple of 3
 */
public
class MultipleOfThreeEvaluator implements Evaluator{
    public static final String FIZZ = "fizz";

    @Override
    public
    boolean evaluate(int number){
        return number % 3 == 0;
    }

    @Override
    public
    String evaluatePerform(){
        return FIZZ;
    }
}
