package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {

        BankAccount person1 = new BankAccount();
        person1.deposit(10000);
        for (int i = 0; ; i++) {
            try {
                person1.withDraw(6000);
            } catch (LimitException LE) {

                System.out.println(LE.getMessage());
                break;
            }
        }
    }
}
