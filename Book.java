package com.heb.commons.test;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {
	long bookId;
	String title;
	double price;
	Integer volume;
	LocalDate publishdate;

	public Book(long bookId, String title, double price, Integer volume, LocalDate publishdate) {
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.volume = volume;
		this.publishdate = publishdate;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public LocalDate getPublishdate() {
		return publishdate;
	}

	public void setPublishdate(LocalDate publishdate) {
		this.publishdate = publishdate;
	}

}
