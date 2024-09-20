package de.eincode;

import java.util.Random;

public class Customer extends Thread {
    private final int id;
    private final int articleAmount;
    private final static int SCAN_TIME_PER_ARTICLE = 1000;
    private static final Object CASH_LOCK = new Object();

    public Customer(int id) {
        this.id = id;
        this.articleAmount = new Random().nextInt(10) + 1;
    }

    @Override
    public void run() {
        System.out.println("Kunde " + id + " ist an der Kasse mit " + this.articleAmount + " Artikeln.");

        synchronized (CASH_LOCK) {
            System.out.println("Kunde " + id + " beginnt mit dem Scannen.");

            for (int i = 1; i <= this.articleAmount; i++) {
                try {
                    Thread.sleep(SCAN_TIME_PER_ARTICLE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Kunde " + id + ": Artikel " + i + " von " + this.articleAmount + " gescannt.");
            }

            System.out.println("Kunde " + id + " hat das Scannen beendet.");
        }
    }
}

