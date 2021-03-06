package com.zinkworks;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.out.println("The total sum is " + ReadingUserInputChallenge.readNums());

        // Simple calculator challenge
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println(calculator.getFirstNumber());
        System.out.println(calculator.getSecondNumber());
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());

        // Bank account challenge
        BankAcc accOne = new BankAcc(123, 50000, "Ruth");
        System.out.println(accOne.getCustomerName() + ", you have €" + accOne.getBalance() + " in your account");
        accOne.deposit(50000);
        accOne.withdraw(900000);
        accOne.withdraw(9000);
        BankAcc accTwo = new BankAcc("Lucy");
        System.out.println(accTwo.getCustomerName() + ", you have €" + accTwo.getBalance() + " in your account");

    }
}