package com.company;

public class LimitException extends Exception {
    String massage;
    double remainingAmount;

    public LimitException(String massage, double remainingAmount) {
        this.massage = massage;
        this.remainingAmount = remainingAmount;
    }

    public String getMassage() {
        return getMessage();
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public void setRemainingAmount(double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }
    public void getRemainingAmount(){

    }
}


