package org.howard.edu.lsp.midterm.problem1;

public class DriverForBook {

	public static void main(String[] args) {
        Book book1 = new Book("Hemisphere", "George Simons", 1987);
        System.out.println(book1.toString());
        Book book2 = new Book("Hemisphere", "George Simons", 1987);
        System.out.println("book1 and book 2 equals??" + book1.equals(book2)  );
	}
}