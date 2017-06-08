package dao.implementation;

import java.util.List;

import dao.GenericBookDao;
import model.Book;
import model.definition.BookStatus;

public class BookDao implements GenericBookDao{

	@Override
	public int insert(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book findByDewey(String dewey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findByTag(String tag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findByPublisher(String publisher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> advancedSearch(String title, String author, String publisher, List<String> tags,
			BookStatus status) {
		// TODO Auto-generated method stub
		return null;
	}

}
