package Basics.CodeChallenge2;

public class FooBarQix {

    public static String compute(int numberToFoobar) {
        //create a string where we'll place the output
        String result = "";

        //check the divisible requirement and add to the result variable
        if (numberToFoobar % 3 == 0) {
            result += "Foo";
        }
        if (numberToFoobar % 5 == 0) {
            result += "Bar";
        }
        if (numberToFoobar % 7 == 0) {
            result += "Qix";
        }
        //declare a string variable in order to convert the int variable into a string object
        //we do that to be able to count the number of digits we have
        String toFooBar = String.valueOf(numberToFoobar);

        //if the digit is equal with 3/5/7, we add it to the result variable
        for (int j = 0; j < toFooBar.length(); j++) {
            char element = toFooBar.charAt(j);
            if (element == '3')
                result += "Foo";
            if (element == '5')
                result += "Bar";
            if (element == '7')
                result += "Qix";
        }
        return result.isEmpty() ? toFooBar : result;
    }

    public static void main(String[] args) {
        System.out.println(compute(33));
    }
}
