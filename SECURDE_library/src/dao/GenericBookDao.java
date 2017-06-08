package dao;

import java.util.List;

import model.Book;
import model.definition.BookStatus;

public interface GenericBookDao {

	public int insert(Book book);
	public int update(Book book);
	public int delete(int id);
	public List<Book> findAll();
	public Book findById(int id);
	public Book findByDewey(String dewey);
	public List<Book> findByTag(String tag);
	public List<Book> findByTitle(String title);
	public List<Book> findByAuthor(String author);
	public List<Book> findByPublisher(String publisher);
	public List<Book> advancedSearch(String title, String author, String publisher, List<String> tags, BookStatus status);
	
}
