package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
       while (true) {
           try {
               bankAccount.withDraw(7000);
           }catch (LimitException e) {
               System.out.println("Остоток счета -" +bankAccount.getAmount());
               try {
                   bankAccount.withDraw(bankAccount.getAmount());
               }catch (LimitException limitException){
                   limitException.printStackTrace();
               }
               break;
           }
        }


    }
}
