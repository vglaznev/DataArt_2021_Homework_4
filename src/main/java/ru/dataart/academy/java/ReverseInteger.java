package ru.dataart.academy.java;


public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 21
     * -2,147,483,648 -> exception and error message
     * If result (number in reversed order) is out of int range [-2,147,483,648,  2,147,483,647] throw custom
     * unchecked exception. In main method (Main class) if exception happened output message with problem to user.
     */
    public int reverse(int inputNumber){
        int originalInputNumber = inputNumber;
        long reversedNumber = 0;
        int digit;

        while (inputNumber != 0) {
            digit = inputNumber % 10;
            inputNumber /= 10;
            reversedNumber = reversedNumber * 10 + digit;
        }
        if(reversedNumber <= Integer.MAX_VALUE && reversedNumber >=Integer.MIN_VALUE){
                return (int)reversedNumber;
        } else{
            throw new ReversedNumberOutOfIntRange("Reversed number out of int range. Input number is too large: " + originalInputNumber);
        }
    }
}
