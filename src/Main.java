public class Main {
    public static void main(String[] args) {

        int intOperandA = 1;
        int intOperandB = 5;
        int intSum = 13;
        int intProduct = 24;
        int intDifference = 36;
        int intQuotient = 72;
        int intModulo = 56;
        double doubleOperandA = 3.50;
        double doubleOperandB = 7.00;
        double doubleSum = 9.00;
        double doubleProduct = 12.00;
        double doubleDifference = 16.00;
        double doubleQuotient = 18.25;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum); // Output statement

        intProduct = intOperandA * intOperandB;
        System.out.println("The product of " + intOperandA + " " + intOperandB + " is " + intProduct); // Output statement

        intDifference = intOperandB - intOperandA;
        System.out.println("The difference of " + intOperandB + " " + intOperandA + " is " + intDifference); // Output statement

        intQuotient = intOperandB / intOperandA;
        System.out.println("The quotient of " + intOperandB + " " + intOperandA + " is " + intQuotient); // Output statement

        intModulo = intOperandB % intOperandA;
        System.out.println("The modulo of " + intOperandB + " " + intOperandA + " is " + intModulo); // Output statement

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of " + doubleOperandB + " " + doubleOperandA + " is " + doubleSum); // Output statement

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of " + doubleOperandB + " " + doubleOperandA + " is " + doubleProduct); // Output statement

        doubleDifference = doubleOperandB - doubleOperandA;
        System.out.println("The difference of " + doubleOperandB + " " + doubleOperandA + " is " + doubleDifference); // Output statement

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient of " + doubleOperandB + " " + doubleOperandA + " is " + doubleQuotient); // Output statement

        double myLunchCost = 12.50;
        System.out.println("The cost of my lunch is: " + myLunchCost);

        double mykids = 2;
        System.out.println("The number of kids in your family: " + mykids);


        String raining = "Is it raining?";
        String answer = "yes";
        String question = raining + " " + answer;

        System.out.println(question);

        String kids = "The number of kids in your family:";
        intSum = intOperandA + intOperandA;
        System.out.println("The number of kids in your family " + intOperandA + " " + intOperandA + " is " + intSum); // Output statement

        System.out.println(question);

        String gas = "The price of a gallon of gas?";
        System.out.println("The price of a gallon of gas " + doubleOperandA +  " is "); // Output statement


        System.out.println(question);

        String favorite = "Your favorite number?";
        String favnumber = "78";
        String favquestion = favorite + " " + favnumber;

        System.out.println(favquestion);

        String shoe = "Your shoe size is";
        String shoeanswer = "14";
        String shoequestion = shoe + " " + shoeanswer;

        System.out.println(shoequestion);

        String month = "Your birth month is";
        String monthanswer = "February";
        String monthquestion = month + " " + monthanswer;

        System.out.println(monthquestion);

        String first = "Joe";
        String last = "Brooks";
        String fullname = first + " " + last;

        System.out.println(fullname);

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
    }
}