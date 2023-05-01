package com.mavenproject.book_management;
import java.util.*;

import com.book.dao.bookdao;
import com.book.model.bookmngmt;

public class App 
{
    public static void main( String[] args )
    {
    	bookdao bk = new bookdao();
    	
    	bookmngmt book = new bookmngmt("Alice ","Lewis Carol",10);
    	bookmngmt book1 = new bookmngmt("Ancient Mariner","Coleridge",10);
    	
    	bk.addBook(book);
    	bk.addBook(book1);
    	
    	book.setAuthorName("Lewis");
    	bk.updateBook(book);
    	
    	List<bookmngmt> books = bk.getallbooks();
    	books.forEach(book2 -> System.out.println(book2.getId()));
    	
    	bk.deleteBook(2);
    }
}
