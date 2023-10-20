package org.howard.edu.lsp.midterm.problem1;

public class Book {
	
	private String title;
	private String author;
	private int year;
	
	
	 public Book(String T, String A, int Y){
	 title = T;
	 author = A;
	 year = Y;

	}
	/**
	 * This method displays the title and aithor of the book
	 */
	public String toString() {
		return author+" "+title+" "+year;
	}
	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Book book = (Book) obj;

        if (!title.equals(book.title)) return false;
        return author.equals(book.author);
    }

}
