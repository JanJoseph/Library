package dao;

import java.util.List;

import model.Publisher;

public interface GenericPublisherDao {

	public int insert(Publisher publisher);
	public int update(Publisher publisher);
	public int delete(int id);
	public List<Publisher> findAll();
	public Publisher findById(int id);
	public Publisher search(String text);
}
