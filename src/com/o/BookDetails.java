package com.o;


interface Book {
 int price = 0;
String name = null;
String year = null;

String getTitle();
 String getAuthor();
 void displayDetails();
 String getPrice();
 String getYear();
 String getName();

}


public class BookDetails {
	private String title;
	private String author;

 public BookDetails(String title, String author) {
     this.title = title;
     this.author = author;
 }

 public String getTitle() {
     return title;
 }

 public String getAuthor() {
     return author;
 }
}


abstract class BookImpl implements Book {
	private BookDetails bookDetails;

 public BookImpl(String title, String author) {
     this.bookDetails = new BookDetails(title, author);
 }

 @Override
 public String getTitle() {
     return bookDetails.getTitle();
 }

 @Override
 public String getAuthor() {
     return bookDetails.getAuthor();
 }

 @Override
 public void displayDetails() {
     System.out.println("Book: " + getTitle() + " by " + getAuthor());
 }
}
