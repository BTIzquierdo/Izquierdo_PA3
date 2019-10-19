package com.company;

public class SavingsAccount
{
    private double savingsBalance;
    private static double annualInterestRate;
    public void setSavingsBalance(double balance)
    {
        savingsBalance = balance;
    }
    public void calculateMonthlyInterest()
    {
        savingsBalance += savingsBalance * annualInterestRate / 12;
        System.out.printf("$%.2f\n", savingsBalance);
    }
    public static void modifyInterestRate(double interest)
    {
        annualInterestRate = interest;

    }

}
