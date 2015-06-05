package com.bkav.training.week2.session11;

import com.bkav.training.week2.session2.Author;

public class Book {
	private String name;
	private Author[] author;
	private double price;
	private int qtyInStock;

	public Book(String name, Author[] author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Book(String name, Author[] author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	@Override
	public String toString() {
		return name + " by " + author.length + " authors";
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
		for (int i = 0; i < author.length; i++) {
			System.out.printf(author[i].getName() + ", ");
		}
	}
}
