package kata.fizzbuzz.validator;

import java.util.regex.Pattern;

public
class FizzBuzzInputValidator implements NumberValidator{

    private static Pattern numericPattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    private        int     inputNumber;


    public
    boolean isValid(String numberAsString){

        if (numberAsString == null) {
            throw new RuntimeException("input is null try to insert any number valid [0-9]!");
        }

        boolean matchesResult = numericPattern.matcher(numberAsString).matches();

        if (matchesResult) {
            this.inputNumber = Integer.valueOf(numberAsString);
        }
        return matchesResult;

    }

    @Override
    public
    int validatePerform(){
        return this.inputNumber;
    }


}
