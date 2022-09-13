package kata.fizzbuzz.evaluator;

/**
 * evaluator test if number is multiple of five or three
 */
public
class MultipleOfFiveAndThreeEvaluator implements Evaluator{
    public static final String
            FIZZ_BUZZ = "fizzbuzz";

    Evaluator multipleOfFiveEvaluator  = new MultipleOfFiveEvaluator();
    Evaluator multipleOfThreeEvaluator = new MultipleOfThreeEvaluator();

    @Override
    public
    boolean evaluate(int number){
        return multipleOfFiveEvaluator.evaluate(number)
                &&
                multipleOfThreeEvaluator.evaluate(number);
    }

    @Override
    public
    String evaluatePerform(){
        return FIZZ_BUZZ;
    }


}
