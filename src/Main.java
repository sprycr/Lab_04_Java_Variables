public class Main {
    public static void main(String[] args) {
        int intOperandA = 16;
        int intOperandB = 36;
        int intSum = 2;
        int intProduct = 45;
        int intDifference = 9;
        int intQuotient = 5;
        int intModulo = 1;

        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        double doubleOperandA = 25.41;
        double doubleOperandB = 25.0;
        double doubleSum = 10.1;
        double doubleProduct = 35.6;
        double doubleDifference = 6.6;
        double doubleQuotient = 3.7;
        double doubleModulo = 1.1;

        doubleSum = doubleOperandA + intOperandB;
        doubleProduct = doubleOperandA * intOperandB;
        doubleDifference = doubleOperandA - intOperandB;
        doubleQuotient = doubleOperandA / intOperandB;
        doubleModulo = doubleOperandA % intOperandB;

        // int
        System.out.println();
        System.out.println("int:");
        System.out.println("The sum of using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("The product of using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The difference of using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);
        System.out.println("The quotient of using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo of using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        // double
        System.out.println();
        System.out.println("double:");
        System.out.println("The sum of using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("The product of using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The difference of using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The quotient of using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);
        System.out.println("The modulo of using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);

    }
}
