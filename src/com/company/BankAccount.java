package com.company;

public class BankAccount  {
    double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public BankAccount() {

    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    public void deposit(double sum){
        amount = amount + sum;
        System.out.println("Ваша сумма состовляет - " + amount);

    }
    public void withDraw(double sum ) throws  LimitException{
        amount = amount - sum;
        System.out.println("Сумма для снятия - " +sum);
        if (amount<sum) {
            throw new LimitException("Если ваша запрашиваемая сумма > больше чем на балансе - ",amount);
        }
        amount = amount - sum;
        System.out.println("Ваша сумма состовляет - " + sum);
    }
    public double amount(){
        return amount;
    }
}

