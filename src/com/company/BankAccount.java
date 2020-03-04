package com.company;

public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            amount = amount + sum;
            System.out.println(amount);
        }
    }

    public void withDraw(int sum) throws LimitException {
        if (getAmount() < sum) {
            throw new LimitException("Недостаточно средств на балансе. Остаток средств на балансе    ", getAmount());
        } else {
            System.out.println(amount = amount - sum);
        }
        if (getAmount() < sum) {
            System.out.println(amount = amount - amount);
        }
    }
}
