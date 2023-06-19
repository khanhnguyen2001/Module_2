package _8_CleanCode_and_Refactoring.TH_2_Refactoring_tach_bien;

public class FizzBuzz {
    public static String fizzBuzz(int number){
//        if(number % 3 == 0 && number % 5 == 0)
//            return "FizzBuzz";
//
//        if(number % 3 == 0)
//            return "Fizz";
//
//        if(number % 5 == 0)
//            return "Buzz";

        boolean isFuzz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if (isFuzz && isBuzz)
            return "FizzBuzz";

        if (isFuzz)
            return "Fizz";

        if (isBuzz)
            return "Buzz";

        return number + "";
    }
}
