package com.book.dao;

import java.util.List;
import com.book.model.bookmngmt;

public interface IBookdao
{
	void addBook(bookmngmt book);
	
	void updateBook(bookmngmt book);
	
	bookmngmt getBooksbyId (long id);
	
	List < bookmngmt > getallbooks();
	
	void deleteBook(int id);
}
