package de.eincode;

public class Supermarket {

    public static void main(String[] args) {
        int customerAmount = 5;

        for (int i = 1; i <= customerAmount; i++) {
            final Customer customer = new Customer(i);
            customer.start();
        }
    }
}