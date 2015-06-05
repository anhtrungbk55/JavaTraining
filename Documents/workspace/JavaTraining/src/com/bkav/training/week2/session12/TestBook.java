package com.bkav.training.week2.session12;

import com.bkav.training.week2.session2.Author;

public class TestBook {
	public static void main(String[] args) {
		Book javaDummy = new Book("Java for Dummy", 19.99, 99);
		System.out.println(javaDummy);  // toString()
		System.out.print("The authors are: ");
		javaDummy.printAuthors();
		 
		javaDummy.addAuthors(new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm'));
		javaDummy.addAuthors(new Author("Paul Tan", "Paul@nowhere.com", 'm'));
		System.out.println(javaDummy);  // toString()
		System.out.print("The authors are: ");
		javaDummy.printAuthors();
		System.out.println(javaDummy);  // toString()
	}
}
