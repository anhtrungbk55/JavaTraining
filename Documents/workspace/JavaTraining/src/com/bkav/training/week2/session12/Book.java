package com.bkav.training.week2.session12;

import com.bkav.training.week2.session2.Author;

public class Book {
	private String name;
	private Author[] author = new Author[5];
	private int numAuthors = 0;
	private double price;
	private int qtyInStock;

	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Book(String name, double price, int qtyInStock) {
		this.name = name;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	@Override
	public String toString() {
		return name + " by " + numAuthors + " authors";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthor() {
		return author;
	}
	public void printAuthors() {
		for (int i = 0; i < 5; i++) {
			if (author[i] != null) {
			System.out.printf(author[i].getName() + ", ");
			}
		}
	}
	public void addAuthors(Author author) {
		if (numAuthors < 5) {
			this.author[numAuthors] = author;
			numAuthors++;
		} else {
			System.out.println(" Không được vượt quá 5 tác giả");
		}
	}
}
