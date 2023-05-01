package com.book.model;

import javax.persistence.*;

@Entity  
@Table(name = "Frank")
public class bookmngmt 
{
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name= "book_id")
	 private int id;
	 
	 @Column(name = "book_name")
	 private String bookName;
	 
	 @Column(name="author_name")
	 private String authorName;
	 
	 @Column (name = "number_of_copies")
	 private int copies;
	 
	 //default constructor
	 public bookmngmt()
	 {
		 
	 }

	public bookmngmt( String bookName, String authorName, int copies) {
		
		this.bookName = bookName;
		this.authorName = authorName;
		this.copies = copies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	@Override
	public String toString() {
		return "bookmngmt [id=" + id + ", bookName=" + bookName + ", authorName=" + authorName + ", copies=" + copies
				+ "]";
	}
	 
	 
}
