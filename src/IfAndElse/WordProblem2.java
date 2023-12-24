package IfAndElse;
/*
Given a number 'N' print the sum of each digit to the power of the number of digits in the given input.
Hint: Use Math.pow
Example :
Input => 1234
=> ( 1 ^ 4 ) + ( 2 ^ 4 ) + ( 3 ^ 4 ) + ( 4 ^ 4 )
=> 1 + 16 + 81 + 256
Output => 354
N <=100000000000
Sample Testcase :

INPUT
1234

OUTPUT
354

* */
public class WordProblem2 {
    public static void main(String[] args){
        long number = 1234;

        // Calculate the number of digits in the input number
        int numDigits = (int) Math.log10(number) + 1;

        long sum = 0;
        long tempNumber = number;

        // Calculate the sum of each digit raised to the power of the number of digits
        while (tempNumber > 0) {
            long digit = tempNumber % 10;
            sum += Math.pow(digit, numDigits);
            tempNumber /= 10;
        }

        System.out.println("Output: " + sum);
    }
}
