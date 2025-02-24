package com.o;

public class Invoice {
    private Books book;
    private int quantity;
    private int totalCost;

    public Invoice(Books book, int quantity) {
        this.book = book;
        this.quantity = quantity;
        this.totalCost = book.getPrice() * quantity;
    }

    public void printInvoice() {
        System.out.println("Book: " + book.getName());
        System.out.println("Year: " + book.getYear());
        System.out.println("Price per book: " + book.getPrice());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }
}
