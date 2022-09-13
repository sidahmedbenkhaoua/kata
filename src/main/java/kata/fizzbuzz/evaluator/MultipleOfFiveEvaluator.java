package kata.fizzbuzz.evaluator;

/**
 * evaluator for test if is number multiple of 5
 */
public
class MultipleOfFiveEvaluator implements Evaluator{
    public static final String
            BUZZ = "buzz";

    @Override
    public
    boolean evaluate(int number){
        return number % 5 == 0;
    }

    @Override
    public
    String evaluatePerform(){
        return BUZZ;
    }

}
