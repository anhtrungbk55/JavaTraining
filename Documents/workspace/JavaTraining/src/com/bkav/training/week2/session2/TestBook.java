package com.bkav.training.week2.session2;

public class TestBook {
	public static void main(String[] args) {
		Author anAuthor = new Author("TrungBV", "trungbv@bkav.com", 'm');
		Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
		// Use an anonymous instance of Author
		Book anotherBook = new Book("more Java for dummy", new Author(
				"Ngô Tất Tố", "daicaTo@gmail.com", 'f'), 29.95, 888);
		System.out.println(aBook);
		System.out.println(anotherBook);
		System.out.println("Tên chủ nhân quyển " + aBook.getName() + " là " + aBook.getAuthor().getName());
	}
}
