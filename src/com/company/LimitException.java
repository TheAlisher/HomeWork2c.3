package com.company;

public class LimitException extends Exception {

    private double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }

}
