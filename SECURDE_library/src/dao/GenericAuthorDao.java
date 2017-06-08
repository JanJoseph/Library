package dao;

import java.util.List;

import model.Author;

public interface GenericAuthorDao {

	public int insert(Author author);
	public int update(Author author);
	public int delete(int id);
	public List<Author> findAll();
	public Author findById(int id);
	public Author search(String text);
	
}
