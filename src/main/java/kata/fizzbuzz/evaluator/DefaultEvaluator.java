package kata.fizzbuzz.evaluator;

/**
 * default evaluator when any number is multiple of 3 or 5 or 3 and 5
 */
public
class DefaultEvaluator implements Evaluator{

    Evaluator multipleOfFiveEvaluator  = new MultipleOfFiveEvaluator();
    Evaluator multipleOfThreeEvaluator = new MultipleOfThreeEvaluator();
    private int number;

    @Override
    public
    boolean evaluate(int number){
        this.number = number;
        return !multipleOfFiveEvaluator.evaluate(number) && !multipleOfThreeEvaluator.evaluate(number);
    }



    @Override
    public
    String evaluatePerform(){
        return String.valueOf(this.number);
    }
}
