package com.company;

public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            amount = amount + sum;
            System.out.println("На кошелке: " + amount);
        }
    }

    public void withDraw(int sum) throws LimitException {
        if (getAmount() < sum) {
            System.out.println("Вы можете снять только: "  + amount);
            amount = amount - amount;
            System.out.println("Остаток на кошелке: " + amount);
            throw new LimitException("Недостаточно средств на балансе. Остаток средств на балансе    ", getAmount());
        } else {
            System.out.println("Снято со кошелка: " + sum);
            System.out.println("Остаток на кошелке: " + (amount = amount - sum));
        }
       /* if (getAmount() < sum) {
            System.out.println("Недостаточна средств на кошелке и было снято вся сумма: " + amount);
            System.out.println("Остаток на кошелке: " + (amount = amount - amount));
        } */
    }
}
