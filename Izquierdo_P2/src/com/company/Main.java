package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

       SavingsAccount saver1 = new SavingsAccount();
       SavingsAccount saver2 = new SavingsAccount();

       saver1.setSavingsBalance(2000.00);
       saver2.setSavingsBalance(3000.00);

       SavingsAccount.modifyInterestRate(.04);
       for(int i = 0; i < 12; i++)
       {
          saver1.calculateMonthlyInterest();
       }
       for(int i = 0; i < 12; i++)
       {
           saver2.calculateMonthlyInterest();
       }

       SavingsAccount.modifyInterestRate(.05);

       saver1.calculateMonthlyInterest();
       saver2.calculateMonthlyInterest();
    }
}
