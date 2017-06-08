package model;

import java.util.List;

import model.datetime.SimpleDate;
import model.definition.BookStatus;

public class Book {
	
	private int idBook;
	private String title;
	private List<String> author;
	private String details;
	private List<String> tags;
	private String dewey;
	private String publisher;
	private SimpleDate publishDate;
	private BookStatus status;
	private SimpleDate dueDate;
	
	
	public Book(){}
	
}
